package SimpleProblems;

public class PrintZigZag {

    public static void pzz(int n){
        if (n == 0){
            return;
        }
        System.out.println("pre" + n);
        pzz(n-1);
        System.out.println("in" + n);
        pzz(n-1);
        System.out.println("post"+ n);
    }

    public static void main(String[] args) {
        int n =  2 ;
        pzz(n);
    }
}
