package Test.TestBai3;

import com.example.Test4.Bai3.ThuongTrungThu;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestThuongTrungThu {
    private ThuongTrungThu thuongTrungThu;

    @Test
    public void setThuongTrungThu01(){
        Assertions.assertEquals("Thuong 10 trieu",thuongTrungThu.tinhThuong(5));
    }

    @Test
    public void setThuongTrungThu02(){
        Assertions.assertEquals("Thuong 12 trieu", thuongTrungThu.tinhThuong(10));
    }
}
