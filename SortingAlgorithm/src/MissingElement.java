import java.util.Arrays;

public class MissingElement {
    public static void main(String[] args) {
        int []arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] nums) {

        int i =  0;

        Arrays.sort(nums);

        while(i < nums.length){

            if(nums[i] != i){
                return i;
            }
            i++;
        }
        return -1;
    }

}
