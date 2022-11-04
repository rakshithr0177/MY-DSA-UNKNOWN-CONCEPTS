public class BubbleSort {
    public static void main(String[] args) {
        int arr[] ={4,2,5,3,1};
        sorting(arr);
        for (int i:
                arr) {
            System.out.println(i);
        }
    }
    public static void sorting(int []arr){
        int temp = 0;
        boolean swapped = false;
        for (int i = 0; i < arr.length-1; i++) {
            int j = 0;
            while(j < arr.length - i  - 1 ){
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true ;
                }
                j++;
            }
            if (swapped){
                break;
            }
        }

    }
}
