package com.snethlios.dao;

import com.snethlios.entity.PhieuXuat;
import com.snethlios.entity.SanPham;
import com.snethlios.utils.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PhieuXuatDAO extends SnethliosDAO<PhieuXuat, Integer> {

    String insert = "insert into PHIEUXUAT (SOPX,NGAYTAO,LYDOHUY,TRANGTHAI,HINHTHUCTHANHTOAN,MANV,MKH) values(?,?,?,?,?,?,?);";
    String update = "UPDATE PHIEUXUAT SET NGAYTAO=?, LYDOHUY=?, TANGTHAI=?,HINHTHUCTHANHTOAN=?,MANV=?,MKH=? WHERE MAPX=?";
    String delete = "DELETE FROM PHIEUXUAT WHERE MAPX=?";
    String selectAll = "SELECT * FROM PHIEUXUAT";
    String selectByID = "SELECT * FROM PHIEUXUAT WHERE MAPX=?";

    @Override
    public void insert(PhieuXuat entity) {
        try {
            JdbcHelper.update(insert, entity.getSoPX(), entity.getNgayTao(), entity.getLyDoHuy(), entity.getTrangThai(), entity.getHinhThucThanhToan(), entity.getMaNV(), entity.getMaKH());
        } catch (SQLException ex) {
            Logger.getLogger(PhieuXuatDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void update(PhieuXuat entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Integer key) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<PhieuXuat> selectAll() {
        return this.selectBySQL(selectAll);
    }

    @Override
    public PhieuXuat selectByID(Integer key) {
        List<PhieuXuat> list = selectBySQL(selectByID, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<PhieuXuat> selectBySQL(String sql, Object... args) {
        List<PhieuXuat> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.query(sql, args);
                while (rs.next()) {
                    PhieuXuat model = readFromResultSet(rs);
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

    public List<Integer> selectYears() {
        String sql = "SELECT DISTINCT year(NgayTao) Year FROM PhieuXuat ORDER BY Year DESC";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    private PhieuXuat readFromResultSet(ResultSet rs) throws SQLException {
        PhieuXuat px = new PhieuXuat();
        px.setSoPX(rs.getInt("SOPX"));
        px.setNgayTao(rs.getDate("NGAYTAO"));
        px.setLyDoHuy(rs.getString("LYDOHUY"));
        px.setTrangThai(rs.getString("TRANGTHAI"));
        px.setHinhThucThanhToan(rs.getString("HINHTHUCTHANHTOAN"));
        px.setMaNV(rs.getString("MANV"));
        px.setMaKH(rs.getString("MAKH"));
        return px;
    }

}
