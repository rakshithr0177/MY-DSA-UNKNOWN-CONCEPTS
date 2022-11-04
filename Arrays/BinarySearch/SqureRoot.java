package Arrays;

public class SqureRoot {
    public static void main(String[] args) {
        SqureRoot o = new SqureRoot();
        int n = o .mySqrt(37);
        double z = o.morePrecision(3,37,n);
        System.out.println(z);
    }

    public int mySqrt(int x) {
        int ans = 0;
        int start = 0 ;
        int end  = x ;
        double  mid;
        while(start<=end){
            mid = (start+ end)/2;
            if(mid*mid == x){
                return (int)mid;
            }
            else if (mid*mid > x ){
                end =  (int)mid - 1;
            }
            else{
                ans =  (int)mid ;
                start = (int)mid + 1;
            }
        }
        return ans;
    }

    public double morePrecision(int precision , int x ,int tempAns){
        double ans = tempAns;
        double factor = 1;

        for (int i = 0; i < precision; i++) {
            factor = factor / 10 ;
            for (double j = ans; j * j < x ; j=j+factor) {
                ans = j ;
            }
        }

        return ans ;
    }
}
