import java.util.ArrayList;
import java.util.List;

public class Detector {
    public static int detect(List<Integer> nums) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for(int num : nums){
            if(num % 2 == 0){
                even.add(num);
            }else {
                odd.add(num);
            }
        }
        if (even.size() == 1){
            return even.get(0);
        } else {
            return odd.get(0);
        }
    }
}
