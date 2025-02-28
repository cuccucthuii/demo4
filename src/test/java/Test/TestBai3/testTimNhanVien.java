package Test.TestBai3;

import com.example.Test4.Bai3.NhanVien;
import com.example.Test4.Bai3.NhanVienService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class testTimNhanVien {
    private NhanVien nv1, nv2;
    private NhanVienService service;

    @BeforeEach
    public void setUp(){
        service = new NhanVienService();
        nv1 = new NhanVien(1,"XNC","Phan","Kien","Top",12.0);
        nv2 = new NhanVien(2,"CCH","Luyen","Nha","Mid",61.0);
        service.themNV(nv1);
        service.themNV(nv2);
    }

    @Test
    public void timNV(){
        List<NhanVien> list = service.timTen("Phan");
        Assertions.assertFalse(list.isEmpty());
        System.out.println(list);
    }
}
