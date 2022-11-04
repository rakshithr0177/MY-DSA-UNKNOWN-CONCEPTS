public class InsertionSort {
    public static void main(String[] args) {
        int arr[] ={4,2,5,3,1};
        sorting(arr);
        for (int i: arr) {
            System.out.println(i);
        }
    }

    public static void sorting(int []arr){

        for(int i = 1 ; i< arr.length ; i++){
            int var = arr[i];
            int j = i - 1 ;
            while(j >= 0 && arr[j]>var){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = var;
        }
    }
}
