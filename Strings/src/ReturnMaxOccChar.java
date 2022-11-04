public class ReturnMaxOccChar {
    public static void main(String[] args) {
        String str = "Rakshith.R";
        char ans = getMaxOccurringChar(str);
        System.out.println(ans);
    }
    public static char getMaxOccurringChar(String str){
        char ans = ' ' ;
        int asciiSize = 256;
        int count[] = new int[asciiSize];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        int max = -1;
        for (int i = 0; i < str.length(); i++) {
            if(max < count[str.charAt(i)]){
                max = count[str.charAt(i)];
                ans = str.charAt(i);
            }
        }

        return ans;
    }

}
