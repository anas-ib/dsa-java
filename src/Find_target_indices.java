import java.util.ArrayList;
import java.util.List;

public class Find_target_indices {
    public static List<Integer> targetIndices(int[] nums, int target) {

        int smallerCount = 0;  // Count elements < target
        int equalCount = 0;    // Count elements == target

        for(int num : nums) {
            if(num < target) {
                smallerCount++;
            } else if(num == target) {
                equalCount++;
            }
        }
        List<Integer> result = new ArrayList<>();
        while(equalCount>0){
            result.add(smallerCount);
            smallerCount++;
            equalCount--;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 5, 2, 3};
        System.out.println(targetIndices(nums1, 2));  // [1, 2]
    }
}