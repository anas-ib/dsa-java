import java.util.Arrays;

public class FirstandLastPosition {
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};

        ans[0] = search(nums,target,true);

        if(ans[0]!=-1){
            ans[1] = search(nums,target,false);
        }
        return ans;
    }

    public static int search(int nums[], int target, boolean fsi){
        // FSI = find Start Index

        int start = 0;
        int ans = -1;
        int end = nums.length - 1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(nums[mid]>target){
                end = mid - 1;
            }
            else if(nums[mid]<target){
                start = mid + 1;
            }
            else{
                ans = mid;
                if(fsi){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
    public static void main(String []args){
        int nums[] = {5,7,7,8,8,10};
        int target = 8;
        int[] result = searchRange(nums,target);
        System.out.println(Arrays.toString(result));
    }
}
