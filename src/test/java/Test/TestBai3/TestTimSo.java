package Test.TestBai3;

import com.example.Test4.Bai3.TimSoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTimSo {
    private TimSoService service = new TimSoService();

    @Test
    public void testTimSo(){
        int[] daySo = {1,3,7};
        Assertions.assertEquals(3,service.timSo(daySo));
    }

}
