/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.snethlios.entity;

/**
 *
 * @author Admin
 */
public class KhachHang {

    private String makh;
    private String tenkh;
    private String diaChi;
    private String dienThoai;
    private boolean gioiTinh;
    private String ghichu;

    public KhachHang() {
    }

    public KhachHang(String makh, String tenkh, String diaChi, String dienThoai, boolean gioiTinh, String ghichu) {
        this.makh = makh;
        this.tenkh = tenkh;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
        this.gioiTinh = gioiTinh;
        this.ghichu = ghichu;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }
    
}
