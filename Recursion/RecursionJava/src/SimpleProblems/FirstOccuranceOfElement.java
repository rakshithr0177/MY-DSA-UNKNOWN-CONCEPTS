package SimpleProblems;

public class FirstOccuranceOfElement {
    public static void main(String[] args) {
        int [] arr = {2,3 ,6 ,9,3, 2, 6, 2,4 };
        System.out.println(firstOccurance(arr , 3 , 0));
    }

    public static int firstOccurance(int [] arr , int data ,int i){
        if(i == arr.length){
            return -1 ;
        }
        if(arr[i] == data){
            return i ;
        }
        else{
            return firstOccurance(arr , data , i+1);
        }
    }

}
