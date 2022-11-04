public class SelectionSort {
    public static void main(String[] args) {
        int arr[] ={4,2,5,3,1};
        sorting(arr);
        for (int i:
             arr) {
            System.out.println(i);
        }
    }
    public static void sorting(int []arr){
        int temp = 0 ;
        for (int i = 0; i <= arr.length-2; i++) {
            int min = i ;
            int j = i + 1;
            while(j < arr.length){
                if (arr[j] < arr[min]) {
                    min = j ;
                }
                j++;
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
