//https://leetcode.com/problems/remove-all-occurrences-of-a-substring/


public class RemoveAllOccurancesOfSubstring {
    public static void main(String[] args) {
        String s ="daabcbaabcbc";
        String part ="abc";
        System.out.println(removeOccurrences(s,part));

    }
    public static String removeOccurrences(String s, String part) {

        while(s.contains(part)){
            s=s.replaceFirst(part,"");
        }
        return s;
    }


//    public String removeOccurrences(String s, String part) {
//        return s.contains(part) ? removeOccurrences(s.replaceFirst(part, ""), part) : s;
//    }
}
