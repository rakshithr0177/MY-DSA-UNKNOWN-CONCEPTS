//https://www.codingninjas.com/codestudio/problems/print-like-a-wave_893268?leftPanelTab=0


public class PrintLikeWave {
    public static void main(String[] args) {
        int arr[][] = new int[3][4];
        arr = new int[][]{
                {1, 2, 3, 4},
                {5 ,6 ,7 ,8},
                {9 ,10 ,11 ,12}
        };

        int ans [] = wavePrint(arr, 3, 4);
        for (int i: ans) {
            System.out.print(i + " ");
        }
    }

    public static int[] wavePrint(int arr[][], int nRows, int mCols) {
        // Write your code here.
        int size = nRows*mCols;
        int ans[]= new int[size];
        int k=0;
        int count =1;
        for(int i = 0 ; i < mCols ; i++){
            if(count%2!=0){
                for(int j =0 ;j < nRows ; j++){
                    ans[k++]=arr[j][i];
                }
            }
            else{
                for(int j =nRows-1 ;j >= 0 ; j--){
                    ans[k++]=arr[j][i];
                }
            }
            count++;
        }
        return ans;
    }
}
