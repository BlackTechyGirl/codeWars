import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {
    @Test
    void canDetectOdd(){
        List<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(8);
        nums.add(10);
        nums.add(12);
        nums.add(14);

        assertEquals(1, Detector.detect(nums));
    }

}
