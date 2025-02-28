package com.example.Test4.Bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NhanVienService {
    private List<NhanVien> danhSachNhanVien = new ArrayList<>();

    public void themNV(NhanVien nhanVien){
        danhSachNhanVien.add(nhanVien);
    }

    public List<NhanVien> timTen(String ten){
        return danhSachNhanVien.stream().filter(nhanVien -> nhanVien.getFirstName().equals(ten)).collect(Collectors.toList());
    }
}
