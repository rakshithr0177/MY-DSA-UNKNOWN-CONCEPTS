import java.util.Locale;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {

        s= s.toLowerCase();
        if(s.length()<=1){
            return true;
        }

        StringBuilder str = new StringBuilder();

        for (int i = 0 ; i < s.length() ; i++){
            if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))){
                str.append(s.charAt(i));
            }
        }

        int start = 0 ;
        int end = str.length()-1;
        while(start < end){
            if (str.charAt(start)!=str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

}
