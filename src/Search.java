public class Search {

    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 7, 9, 10};
        int target = 10;

        int result = linearSearch(nums, target);
        int result2 = binarySearch(nums, target);

        if (result != -1) {
            System.out.println("Linear Element found at index " + result);
        } else {
            System.out.println("Linear Element not found");
        }

        if (result2 != -1) {
            System.out.println("Binary Element found at index " + result2);
        } else {
            System.out.println("Binary Element not found");
        }
    }

    // -------- Linear Search --------
    public static int linearSearch(int[] nums, int target) {

        int steps = 0;

        for (int i = 0; i < nums.length; i++) {
            steps++;
            if (nums[i] == target) {
                System.out.println("Steps taken for Linear Search: " + steps);
                return i;
            }
        }

        System.out.println("Steps taken for Linear Search: " + steps);
        return -1;
    }

    // -------- Binary Search --------
    public static int binarySearch(int[] nums, int target) {

        int steps = 0;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            steps++;
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                System.out.println("Steps taken for Binary Search: " + steps);
                return mid;
            }

            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println("Steps taken for Binary Search: " + steps);
        return -1;
    }
}
