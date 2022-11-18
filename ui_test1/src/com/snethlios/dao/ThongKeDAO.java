/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.snethlios.dao;


import com.snethlios.utils.JdbcHelper;
import java.util.*;
import java.sql.*;

/**
 *
 * @author Admin
 */
public class ThongKeDAO {

    private List<Object[]> getListOfArray(String sql, String[] cols, Object... args) {
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                Object[] vals = new Object[cols.length];
                for (int i = 0; i < cols.length; i++) {
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
//    public List<Object[]> getBangDiem (Integer makh){
//        String sql = "{CALL sp_BangDiem(?)}";
//        String[] cols = {"MaNH", "HoTen", "Diem"};
//        return this.getListOfArray(sql, cols, makh);
//    }
//    public List<Object[]> getLuongNguoiHoc (){
//        String sql = "{CALL sp_LuongNguoiHoc}";
//        String[] cols = {"Nam","SoLuong", "DauTien", "Cuoicung"};
//        return this.getListOfArray(sql, cols);
//    }
//    public List<Object[]> getDiemChuyenDe (){
//        String sql = "{CALL sp_DiemChuyenDe}";
//        String[] cols = {"ChuyenDe", "SoHV", "ThapNhat", "CaoNhat", "TrungBinh"};
//        return this.getListOfArray(sql, cols);
//    }
//    public List<Object[]> getDoanhThu (Integer year){
//        String sql = "{CALL sp_DoanhThu(?)}";
//        String[] cols = {"ChuyenDe", "SoKH", "SoHV", "DoanhThu", "ThapNhat", "CaoNhat", "TrungBinh"};
//        return this.getListOfArray(sql, cols, year);
//    }
public List<Object[]> getDoanhThu (Integer year){
        String sql = "{CALL sp_doanhthu(?)}";
        String[] cols = {"thang", "Tong so ban", "Tong gia ban"};
        return this.getListOfArray(sql, cols, year);
    }
    public List<Object[]> getSanPham (){
        String sql = "{CALL sp_sanpham}";
        String[] cols = {"Ma SP", "Ten SP", "So luong da ban", "So luong con lai"};
        return this.getListOfArray(sql, cols);
    }
}
