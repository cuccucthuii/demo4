package Test.TestSoNguyen;

import com.example.Test4.Bai1.SoNguyen;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSoNguyen {
    private SoNguyen soNguyen = new SoNguyen();

    @Test
    public void setSoNguyen01(){
        boolean ketQua = soNguyen.soNguyen(12);
        Assertions.assertTrue(ketQua);
    }
}
