//https://leetcode.com/problems/remove-all-occurrences-of-a-substring/
public class PermutationInString {
    public static void main(String[] args) {
        String s1 = "ab", s2 = "eidboaoo";
        boolean s =checkInclusion(s1,s2);
        System.out.println(s);
    }

    public static boolean isEqual(int [] count1 ,int [] count2){
        for (int i = 0; i < count1.length; i++) {
            if (count1[i]!=count2[i]){
                return false;
            }
        }
        return true;
    }



    public static boolean checkInclusion(String s1, String s2) {

        int countS1[]= new int[26];

        for (int i = 0; i < s1.length(); i++) {
            int index = s1.charAt(i)-'a';
            countS1[index]++;
        }

        int windowSize = s1.length();
        int i = 0;
        int[] countSlidWin = new int[26];
        while(i < windowSize){
            int index = s2.charAt(i)-'a';
            countSlidWin[index]++;
            i++;
        }
        if (isEqual(countS1,countSlidWin)){
            return true;
        }
        while(i < s2.length()){

            int index = s2.charAt(i)-'a';
            countSlidWin[index]++;

            index = s2.charAt(i-windowSize)-'a';
            countSlidWin[index]--;

            if (isEqual(countS1,countSlidWin)){
                return true;
            }
            i++;
        }
        return false;
    }
}
