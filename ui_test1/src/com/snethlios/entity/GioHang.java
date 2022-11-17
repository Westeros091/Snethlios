/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snethlios.entity;

/**
 *
 * @author ASUS
 */
public class GioHang {

    private String maSp;
    private String tenSp;
    private String loai;
    private Double donGia;
    private int soLuong;
    private String mau;
    private int kichThuoc;
    private String hang;
    private String hinh;

    public GioHang() {
    }

    public GioHang(String maSp, String tenSp, String loai, Double donGia, int soLuong, String mau, int kichThuoc, String hang, String hinh) {
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.loai = loai;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.mau = mau;
        this.kichThuoc = kichThuoc;
        this.hang = hang;
        this.hinh = hinh;
    }

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public Double getDonGia() {
        return donGia;
    }

    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public int getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(int kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

}
