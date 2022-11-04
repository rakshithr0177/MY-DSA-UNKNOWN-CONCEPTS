package Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,4,5};
        int ans[] = firstLastPosition(arr,3);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
    public static int[] firstLastPosition(int[]arr ,int  target){
        int [] ans = new int[2];
        ans[0] = firstPosition(arr ,target);
        ans[1] = LastPosition(arr, target);
        return ans ;
    }

    public static int  firstPosition(int[]arr ,int  target){
        int start = 0;
        int end = arr.length-2;
        int ans = -1;
        int mid;

        while(start<=end){
            mid = (start+end)/2;
            if (arr[mid]==target) {
                ans = mid;
                end =  mid - 1 ;
            }
            if(arr[mid]>target){
                end = mid - 1;
            }
            if(arr[mid]<target){
                start = mid + 1;
            }
        }
        return ans;
    }
    public static int  LastPosition(int[]arr ,int  target) {
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        int mid;

        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == target) {
                ans = mid;
                start = mid + 1;
            }
            if (arr[mid] > target) {
                end = mid - 1;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            }
        }
        return ans;
    }
}
