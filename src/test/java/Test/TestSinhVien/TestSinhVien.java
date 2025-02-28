package Test.TestSinhVien;

import com.example.Test4.Bai2.SinhVien;
import com.example.Test4.Bai2.SinhVienService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestSinhVien {
    private SinhVien sv1, sv2;
    private SinhVienService service;

    @BeforeEach
    public void setUp(){
        service = new SinhVienService();
        sv1 = new SinhVien("PH52044","Phan Chi Kien", 20, 10.0f,5,"PTPM");
        sv2 = new SinhVien("PH52047","Dinh Tri Nhat Hung", 20, 10.0f,5,"PTPM");
        service.themSinhVien(sv1);
        service.themSinhVien(sv2);
    }
    // Them moi sinh vien
    @Test
    public void themSinhVien01(){
        SinhVien sv3 = new SinhVien("PH52049","Dinh Tri Nhat", 20, 10.0f,5,"PTPM");
        service.themSinhVien(sv3);
        System.out.println("Them moi sv thanh cong");
    }
    // Sua thong tin sinh vien hop le
    @Test
    public void suaThongTinPass(){
        Boolean ketQua = service.suaSinhVien(sv1,"Phan Ahihi", 19, 8.0f,5,"UDPM");
        Assertions.assertTrue(ketQua);
    }
    // sua thong tin sv khong hop le
    @Test
    public void suaThongTinFalse(){
        Boolean ketQua = service.suaSinhVien(sv2,"", 99, 10.0f,5,"PTPM");
        Assertions.assertFalse(ketQua);
    }

    // Xoa thong tin sv hop le
    @Test
    public void xoaSinhVien01(){
        boolean ketQua = service.xoaSinhVien("PH52047");
        Assertions.assertTrue(ketQua);
        Assertions.assertFalse(service.checkMa("PH52047"));
    }

    // xoa thong tin sv khong hop le
    @Test
    public void xoaSinhVien02(){
        boolean ketQua = service.xoaSinhVien("PH123");
        Assertions.assertFalse(ketQua);
        Assertions.assertFalse(service.checkMa("PH123"));
    }

    @Test
    public void timKiemSV(){
        List<SinhVien> ketQua = service.timKiemSinhVien("PH52044");
        Assertions.assertFalse(ketQua.isEmpty());
        System.out.println(ketQua);
    }
}
