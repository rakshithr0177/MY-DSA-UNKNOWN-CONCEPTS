public class Algo {

    public static int power(int m, int n) {
        if (n == 0)
            return 1;
        return m * power(m, n - 1);
    }
    
    public static int algo(int m,int n) {
		int mul=0;
		int r;
		int s;
		int i=0;
		while(n!=0) {
			r=n%10;
			n=n/10;
			mul=mul*(power(10,i));
            int j = i;
            int w = m;
			while(w!=0) {
				s=w%10;
				w=w/10;
				mul=(r*s)*power(10,j)+mul;
				j++;
			}
			i++;
		}
		return mul;
	}
	
	public static void main(String[] args) {
        System.out.println(algo(120,2));
		System.out.println(2/10);
	}
}
