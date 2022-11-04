public class ReverseStringWord {
    public static void main(String[] args) {
        String s ="pqr.mno";
        String ans=reverseWords(s);
        System.out.println(ans);

    }
     static String reverseWords(String S)
    {
        int i = S.length()-1;
        int j = S.length()-1;
        String ans = "";


        while(i>=0){
            while(S.charAt(i) != '.'){
                i--;
                if(i<0){
                    break;
                }
            }
            ans = ans + S.substring(i+1,j+1)+".";
            j=i-1;
            i--;

        }

        return ans.substring(0,ans.length()-1);

    }
}
