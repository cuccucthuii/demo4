package com.example.Test4.Bai2;

public class SinhVien {
    private String maSV;
    private String ten;
    private int tuoi;
    private float diem;
    private int ky;
    private String chuyenNganh;

    public SinhVien(String maSV, String ten, int tuoi, float diem, int ky, String chuyenNganh) {
        this.maSV = maSV;
        this.ten = ten;
        this.tuoi = tuoi;
        this.diem = diem;
        this.ky = ky;
        this.chuyenNganh = chuyenNganh;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public int getKy() {
        return ky;
    }

    public void setKy(int ky) {
        this.ky = ky;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSV='" + maSV + '\'' +
                ", ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", diem=" + diem +
                ", ky=" + ky +
                ", chuyenNganh='" + chuyenNganh + '\'' +
                '}';
    }
}
