public class PeakofmountainArray {

    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,5,4,3,2,1};
        int result = peakIndexInMountainArray(arr);
        System.out.println(result);
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while(left<right){
            int mid = left + (right - left)/2;

            if(arr[mid] < arr[mid+1]){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }
        return left;
    }
}