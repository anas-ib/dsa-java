// Ceiling of a number = the target itself (if present)
// or the smallest element greater than the target.
//
// Case 1: If target exists in the array,
// binary search finds it and we return that index.
//
// Case 2: If target does not exist,
// binary search ends when start > end.
// At that point, `start` points to the smallest element
// greater than the target — which is the ceiling.


public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] nums = {1,2,4,5,6,54,75,77,89};
        int target = 10;
        int ceiling = findCeiling(nums,target);
        if(ceiling< nums.length) {
            // the smallest value greater than target is ceiling value
            System.out.println("Ceiling found at index " + ceiling + " and The value is " + nums[ceiling]);
        }
        else System.out.println("Ceiling not found");

    }

    public static int findCeiling(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        while(left <= right){
            int mid = (left+right)/2;

            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                left = mid+1;
            }
            else{
                right = mid -1;
            }
        }
        return left;
    }
}


