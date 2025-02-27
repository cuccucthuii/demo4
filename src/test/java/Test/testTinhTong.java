package Test;

import com.example.Test4.Bai1.TinhTong;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testTinhTong {
    private TinhTong tt = new TinhTong();

    // tinh tong thuong
    @Test
    public void tinhTong(){
        int[] daySo = {1,2,3,4,5};
        Assertions.assertEquals(15,tt.tinhTong(daySo));
    }

    // Tinh Tong So Chan
    @Test
    public void tinhTongChan(){
        int[] daySo = {1,2,3,4,5,6};
        Assertions.assertEquals(12,tt.tinhTongChan(daySo));
    }

    // Tinh Tong So Le
    @Test
    public void tinhTongLe(){
        int[] daySo = {1,2,3,4,5,6};
        Assertions.assertEquals(9, tt.tinhTongLe(daySo));
    }

    // tinh tong chan dk 6
    @Test
    public void tinhTongChanDK6(){
        int[] daySo = {1,2,3,4,5,6,7,8,9,10,12};
        Assertions.assertEquals(24,tt.tinhTongChanDK6(daySo));
    }

    // Tinh Tong le dk 5
    @Test
    public void tinhTongLeDK5(){
        int[] daySo = {1,2,3,4,5,6,7,8,9,10,11,15,25};
        Assertions.assertEquals(31,tt.tinhTongLeDK5(daySo));
    }
}
