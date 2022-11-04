package SimpleProblems;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int n = rd.nextInt(); ;
        int ans = factorial(n);
        System.out.println(ans);
    }
    public static int factorial(int n ){
        if (n == 0){
            return 1;
        }
        int smallerProblem =  factorial(n-1);
        int largerProblem =  n * smallerProblem ;

        return largerProblem;
    }

}
