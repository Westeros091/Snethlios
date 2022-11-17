/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snethlios.dao;

import com.snethlios.entity.GioHang;
import com.snethlios.entity.SanPham;
import com.snethlios.utils.JdbcHelper;
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
public class GioHangDao extends SnethliosDAO<GioHang, String> {

    String insert = "insert into GIOHANG (MASP,TENSP,LOAI,DONGIA,SOLUONG,MAUSAC,KICHTHUOC,HANG,HINH) values(?,?,?,?,?,?,?,?,?);";
    String update = "UPDATE GIOHANG SET TENSP=?, LOAI=?, DONGIA=?, SOLUONG=?, MAUSAC=?, KICHTHUOC=?, HANG=?, HINH=? WHERE MASP=?";
    String delete = "DELETE FROM GIOHANG WHERE MASP=?";
    String selectAll = "SELECT * FROM GIOHANG";
    String selectByID = "SELECT * FROM GIOHANG WHERE MASP=?";

    @Override
    public void insert(GioHang entity) {
        try {
            JdbcHelper.update(insert, entity.getMaSp(), entity.getTenSp(), entity.getLoai(), entity.getDonGia(), entity.getSoLuong(), entity.getMau(), entity.getKichThuoc(), entity.getHang(), entity.getHinh());
        } catch (SQLException ex) {
            Logger.getLogger(GioHang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(GioHang entity) {
        try {
            JdbcHelper.update(update, entity.getTenSp(), entity.getLoai(), entity.getDonGia(), entity.getSoLuong(), entity.getMau(), entity.getKichThuoc(), entity.getHang(), entity.getHinh(), entity.getMaSp());
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
    public List<GioHang> selectAll() {
        return this.selectBySQL(selectAll);
    }

    @Override
    public GioHang selectByID(String key) {
        List<GioHang> list = selectBySQL(selectByID, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<GioHang> selectBySQL(String sql, Object... args) {
        List<GioHang> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.query(sql, args);
                while (rs.next()) {
                    GioHang model = readFromResultSet(rs);
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

    private GioHang readFromResultSet(ResultSet rs) throws SQLException {
        GioHang model = new GioHang();
        model.setMaSp(rs.getString("MASP"));
        model.setTenSp(rs.getString("TENSP"));
        model.setLoai(rs.getString("LOAI"));
        model.setDonGia(rs.getDouble("DONGIA"));
        model.setSoLuong(rs.getInt("SOLUONG"));
        model.setMau(rs.getString("MAUSAC"));
        model.setKichThuoc(rs.getInt("KICHTHUOC"));
        model.setHang(rs.getString("HANG"));
        model.setHinh(rs.getString("HINH"));

        return model;
    }

}
