package com.example.Test4.Bai3;

public class ThuongTrungThu {
    public static String tinhThuong(double soNam){
        if (soNam < 3){
            return ("Thuong 3 trieu");
        }else if (soNam <= 6){
            return ("Thuong 10 trieu");
        }else if (soNam <= 10){
            return ("Thuong 20 trieu");
        }else if (soNam > 10){
            return ("Thuong 40 trieu");
        }else{
            return ("So nam khong hop le");
        }
    }
}
