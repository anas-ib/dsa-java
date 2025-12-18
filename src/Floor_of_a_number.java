public class Floor_of_a_number {
    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 6, 54, 75, 77, 89};
        int target = 10;
        int floor = findfloor(nums, target);
        //if loop is used to make it work for all conditions
        // 1. target is in array, 2. target between elements, 3. target less than min element.
        if (floor >= 0) {
            // the smallest value greater than target is ceiling value
            System.out.println("Ceiling found at index " + floor + " and The value is " + nums[floor]);
        } else System.out.println("Ceiling not found");

    }

    public static int findfloor(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }
}