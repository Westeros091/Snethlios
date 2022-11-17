/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snethlios.dao;

import com.snethlios.entity.SanPham;
import com.snethlios.utils.JdbcHelper;
import com.snethlios.utils.MD5;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class SanPhamDao extends SnethliosDAO<SanPham, String> {

    String insert = "insert into SANPHAM (MASP,TENSP,LOAI,DONGIA,SOLUONG,MAUSAC,KICHTHUOC,HANG,HINH,NgayNhap,MANV) values(?,?,?,?,?,?,?,?,?,?,?);";
    String update = "UPDATE SANPHAm SET TENSP=?, LOAI=?, DONGIA=?, SOLUONG=?, MAUSAC=?, KICHTHUOC=?, HANG=?, HINH=?, NGAYNHAP=?, MANV=? WHERE MASP=?";
    String delete = "DELETE FROM SANPHAM WHERE MASP=?";
    String selectAll = "SELECT * FROM NhanVien";
    String selectByID = "SELECT * FROM NhanVien WHERE TenNV=?";

    @Override
    public void insert(SanPham entity) {
        try {
            JdbcHelper.update(insert, entity.getMaSp(), entity.getTenSp(), entity.getLoai(), entity.getDonGia(), entity.getSoLuong(), entity.getMau(), entity.getKichThuoc(), entity.getHang(), entity.getHinh(), entity.getNgayNhap(), entity.getMaNV());
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(SanPham entity) {
        try {
            JdbcHelper.update(update,entity.getTenSp(), entity.getLoai(), entity.getDonGia(), entity.getSoLuong(), entity.getMau(), entity.getKichThuoc(), entity.getHang(), entity.getHinh(), entity.getNgayNhap(), entity.getMaNV(),entity.getMaSp());
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void delete(String key) {
        try {
            JdbcHelper.update(delete, key);
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public List<SanPham> selectAll() {
        String sql = "select * from SanPham";
        return this.selectBySQL(sql);
    }

    @Override
    public SanPham selectByID(String key) {
        String sql = "select * from SanPham where MASP=?";
        List<SanPham> list = selectBySQL(sql, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<SanPham> selectBySQL(String sql, Object... args) {
        List<SanPham> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.query(sql, args);
                while (rs.next()) {
                    SanPham model = readFromResultSet(rs);
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    private SanPham readFromResultSet(ResultSet rs) throws SQLException {
        SanPham model = new SanPham();
        model.setMaSp(rs.getString("MASP"));
        model.setTenSp(rs.getString("TENSP"));
        model.setLoai(rs.getString("LOAI"));
        model.setDonGia(rs.getDouble("DONGIA"));
        model.setSoLuong(rs.getInt("SOLUONG"));
        model.setMau(rs.getString("MAUSAC"));
        model.setKichThuoc(rs.getInt("KICHTHUOC"));
        model.setHang(rs.getString("HANG"));
        model.setHinh(rs.getString("HINH"));
        model.setNgayNhap(rs.getDate("NgayNhap"));
        model.setMaNV(rs.getString("MANV"));
        return model;
    }

}
