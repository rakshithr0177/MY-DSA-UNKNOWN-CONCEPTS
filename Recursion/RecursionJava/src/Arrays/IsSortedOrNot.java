package Arrays;

public class IsSortedOrNot {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,6,7,8,8,9};
        System.out.println(sortedTest(arr,0));
    }

   public static boolean sortedTest(int arr[] , int index){
        if(index == arr.length-1){
            return true;
        }
        boolean compare = arr[index] <= arr[index+1] ;
        boolean recCall = sortedTest(arr , index+1);
        return compare && recCall;
   }
}
