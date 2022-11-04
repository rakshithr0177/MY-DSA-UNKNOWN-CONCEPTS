package SimpleProblems;

public class LastOccuranceOfElement {
    public static void main(String[] args) {
        int [] arr = {2,2};
        System.out.println(lastOccurance(arr , 2 , 0));
    }
    public static int lastOccurance(int []arr , int data , int i){
        if(i == arr.length){
            return -1 ;
        }

        int indOfSmallArray = lastOccurance(arr , data , i + 1 );

        if(indOfSmallArray == -1){
            if(arr[i] == data){
                return i ;
            }
            else{
                return indOfSmallArray;
            }
        }
        else{
            return indOfSmallArray ;
        }
    }

}
