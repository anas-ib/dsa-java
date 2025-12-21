import java.util.Arrays;

public class searcInsertPosition {

    public static void main(String []args){
        int nums[] = {5,7,7,8,8,10};
        int target = 11;
        int result = searchInsert(nums,target);
        System.out.println(result);
    }

    public static int searchInsert(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}