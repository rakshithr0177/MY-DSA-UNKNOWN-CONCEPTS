//https://leetcode.com/problems/reverse-words-in-a-string/
public class ReverseWordsInString {
    public static void main(String[] args) {
        String s ="  hello world  ";
        String ans=reverseWords(s);
        System.out.println(ans);
    }
    public static String reverseWords(String s) {
        String ans ="";
        int i = s.length()-1 ;
        int j = s.length()-1;
        while(i>=0) {
            while (s.charAt(i) == ' ') {
                i--;
                if (i < 0) {
                    break;
                }
            }
            j = i;

            if (i >= 0) {
                while (s.charAt(i) != ' ') {
                    i--;
                    if (i < 0) {
                        break;
                    }
                }

                ans = ans + s.substring(i + 1, j + 1) + " ";

                i--;

            }
        }

        return ans.substring(0,ans.length()-1);
    }
}
