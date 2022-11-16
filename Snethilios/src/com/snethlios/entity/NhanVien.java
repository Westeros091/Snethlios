/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.snethlios.entity;

/**
 *
 * @author HUYNH DUC HOAN
 */
public class NhanVien {
    private String maNV;
    private String tenNV;
    private String matKhau;
    private boolean vaiTro;
    private String email;
    private String diaChi;
    private String SDT;
    private String CCCD;
    private String hinh;

    public NhanVien() {
    }

    public NhanVien(String maNV, String tenNV, String matKhau, boolean vaiTro, String email, String diaChi, String SDT, String CCCD, String hinh) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.matKhau = matKhau;
        this.vaiTro = vaiTro;
        this.email = email;
        this.diaChi = diaChi;
        this.SDT = SDT;
        this.CCCD = CCCD;
        this.hinh = hinh;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public boolean getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(boolean vaiTro) {
        this.vaiTro = vaiTro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    
}
