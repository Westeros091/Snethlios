/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snethlios.dao;

import com.snethlios.entity.SanPham;
import com.snethlios.utils.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class SanPhamDao extends SnethliosDAO<SanPham, String> {

    String insert = "INSERT INTO NhanVien (MaNV, MatKhau, HoTen, VaiTro) VALUES (?, ?, ?, ?)";
    String update = "UPDATE NhanVien SET MatKhau=?, HoTen=?, VaiTro=? WHERE MaNV=?";
    String delete = "DELETE FROM NhanVien WHERE MaNV=?";
    String selectAll = "SELECT * FROM NhanVien";
    String selectByID = "SELECT * FROM NhanVien WHERE TenNV=?";

    @Override
    public void insert(SanPham entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(SanPham entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
