import java.util.ArrayList;
import java.util.Collections;

public class AddArrays {
    public static void main(String[] args) {
        ArrayList <Integer> ans = new ArrayList<>();
        int arr1[]={9,9,9};
        int arr2[]={9,9,9};
        ans = addArr(arr1,arr2);
        System.out.println(ans);
    }

    public static ArrayList<Integer> reverse(ArrayList<Integer> ans){

        int i = 0;
        int j = ans.size()-1;

        while(i<j){
            Collections.swap(ans,i,j);
            i++;
            j--;
        }
        return ans ;
    }




    public static ArrayList<Integer> addArr(int arr1[] , int arr2[]){

        int i = arr1.length-1;
        int j = arr2.length-1 ;
        ArrayList<Integer> ans = new ArrayList<>();

        int carry = 0 ;

        while(i >=0 && j >= 0){
            int sum = carry + arr1[i] + arr2[j];
            carry = sum / 10 ;
            sum = sum % 10 ;
            ans.add(sum);
            i--;
            j--;
        }

        while(i >=0 ){
            int sum = carry + arr1[i] ;
            carry = sum / 10 ;
            sum = sum % 10 ;
            ans.add(sum);
            i--;
        }

        while(j >=0 ){
            int sum = carry + arr2[j] ;
            carry = sum / 10 ;
            sum = sum % 10 ;
            ans.add(sum);
            j--;
        }

        if (carry != 0){
            ans.add(carry);
        }

        return reverse(ans);
    }
}
