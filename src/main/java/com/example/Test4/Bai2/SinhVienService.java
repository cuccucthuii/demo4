package com.example.Test4.Bai2;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SinhVienService {
    private List<SinhVien> danhSachSinhVien;

    public SinhVienService(){
        danhSachSinhVien = new ArrayList<>();
    }

    // Them Sinh Vien Moi
    public void themSinhVien(SinhVien sinhVien){
        danhSachSinhVien.add(sinhVien);
    }

    // Sua thong tin sinh vien
    public boolean suaSinhVien(SinhVien sv, String tenMoi, int tuoiMoi, float diemMoi, int kyMoi, String nganhMoi){
        if (tenMoi == null || tenMoi.trim().isEmpty() || nganhMoi == null || nganhMoi.trim().isEmpty() ){
            System.out.println("Khong duoc de null");
            return false;
        }
        if (tuoiMoi < 18 || tuoiMoi > 30 || kyMoi < 1 || kyMoi > 6 ){
            System.out.println("Khong duoc de null");
            return false;
        }
        if (diemMoi < 0 || diemMoi > 10){
            System.out.println("Khong duoc de null");
            return false;
        }
        sv.setTen(tenMoi);
        sv.setTuoi(tuoiMoi);
        sv.setDiem(diemMoi);
        sv.setKy(kyMoi);
        sv.setChuyenNganh(nganhMoi);
        System.out.println("Sua thong tin sv thanh cong!");
        return true;
    }

    public boolean xoaSinhVien(String maSV){
        return danhSachSinhVien.removeIf(sinhVien -> sinhVien.getMaSV().equals(maSV));
    }

    public List<SinhVien> timKiemSinhVien(String ma){
        return danhSachSinhVien.stream().filter(sinhVien -> sinhVien.getMaSV().equals(ma)).collect(Collectors.toList());
    }


    public boolean checkMa(String maSV){
        return danhSachSinhVien.stream().anyMatch(sinhVien -> sinhVien.getMaSV().equals(maSV));
    }

}
