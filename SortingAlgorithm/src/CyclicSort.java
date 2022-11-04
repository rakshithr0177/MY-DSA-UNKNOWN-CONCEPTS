import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int []arr = { 3, 2,4 ,5 ,1 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int []arr){
        int i = 0  ;
        while(i< arr.length){
            int correct = arr[i] - 1;
            if(arr[correct] != arr[i]){
               int k = arr[i];
               arr[i] = arr[correct];
               arr[correct] = k;
            }else{
                i++;
            }
        }
    }
}
