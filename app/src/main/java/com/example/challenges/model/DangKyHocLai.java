package com.example.challenges.model;

public class DangKyHocLai {

    private int id;
    private String trang_thai;
    private String ten_mon;
    private String tien;

    public DangKyHocLai(int id, String trang_thai, String ten_mon, String tien) {
        this.id = id;
        this.trang_thai = trang_thai;
        this.ten_mon = ten_mon;
        this.tien = tien;
    }

    public String getTen_mon() {
        return ten_mon;
    }

    public void setTen_mon(String ten_mon) {
        this.ten_mon = ten_mon;
    }

    public DangKyHocLai() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTrang_thai() {
        return trang_thai;
    }

    public void setTrang_thai(String trang_thai) {
        this.trang_thai = trang_thai;
    }

    public String getTien() {
        return tien;
    }

    public void setTien(String tien) {
        this.tien = tien;
    }
}
