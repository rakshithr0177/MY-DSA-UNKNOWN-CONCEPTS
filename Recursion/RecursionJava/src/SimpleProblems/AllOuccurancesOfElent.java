package SimpleProblems;

import java.util.Arrays;

public class AllOuccurancesOfElent {
    public static void main(String[] args) {
        int [] arr = {2,3 ,6 ,9,3, 2, 6, 2,4 };
        int []ans = allOccurance(arr , 2 , 0 , 0);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] allOccurance(int []arr , int data ,int i , int count){
        if(i == arr.length){
            return new int[count];
        }
        if(arr[i] == data){
            int [] f = allOccurance(arr , data , i+1 ,count+1);
            f[count] = i;
            return f;
        }else{
            int [] s = allOccurance(arr , data  , i+1  , count);
            return s ;
        }
    }
}
