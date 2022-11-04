public class MedianInMatrix {
    public static void main(String[] args) {
        int [][] A ={
                {1,3,6},
                {2,6,9},
                {3,6,9}
        };
        int ans  = findMedian(A);
        System.out.println(ans);
    }

    public static int findMedian(int[][] A) {
        int row  = A.length;
        int col = A[0].length;

        int start = A[0][0];
        int end = A[row - 1][col - 1];

        while(start <= end){
            int mid = start +(end - start)/2;
            int count = 0 ;
            for (int[] ints : A) {
                count = count + countLessOrEqualToMid(ints, mid);
            }

            if (count <= (row*col)/2){
                start = mid + 1;
            }else{
                end = mid - 1 ;
            }
        }
        return start;
    }

    private static int countLessOrEqualToMid(int[] row, int mid) {
        int s = 0 ;
        int e = row.length-1;

        while(s <= e){
            int md = s + (e-s)/2;
            if (row[md] <= mid){
                s = md + 1;
            }
            else{
                e = md - 1;
            }
        }
        return s;
    }
}
