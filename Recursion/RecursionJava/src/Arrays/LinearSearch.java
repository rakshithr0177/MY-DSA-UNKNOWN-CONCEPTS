package Arrays;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {3,6,4,5,7,4,5,6,4};
        ArrayList<Integer> ans  = returnListWithoutPassInArg(arr,4,0);
        System.out.println(ans);
    }
    public static int search(int arr[] ,int target ,int index){
        if (index == arr.length){
            return -1;
        }else if(arr[index] == target){
            return index;
        }
        return search(arr,target,index+1);
    }

    public static ArrayList<Integer> searchIndex(int arr[] , int target ,int index ,ArrayList<Integer> ans){
        if (index == arr.length){
            return ans;
        }else if(arr[index] == target){
            ans.add(index);
        }
        return searchIndex(arr,target,index+1,ans);
    }

    public static  ArrayList<Integer> returnListWithoutPassInArg(int arr[] , int target ,int index ){
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length){
            return list;
        }else if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansFromBellowCalls = returnListWithoutPassInArg(arr,target,index+1);
        list.addAll(ansFromBellowCalls);

        return list;

    }

}
