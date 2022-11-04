package Strings;

public class SkipChar {
    public static void main(String[] args) {
        String s = "bacccad";
        skip("",s,'a');
        String ans =skip2(s,'a');
        System.out.println(ans);
        System.out.println(skipString("bbaacappletdsd","apple"));
    }

    public static  void skip(String processed , String  unprocessed ,char charToSkip){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);

        if (ch == charToSkip){
            skip(processed,unprocessed.substring(1),charToSkip);
        }
        else{
            skip(processed+ch,unprocessed.substring(1),charToSkip);
        }
    }
    public static  String skip2( String  unprocessed ,char charToSkip){
        if (unprocessed.isEmpty()){
            return "";
        }
        char ch = unprocessed.charAt(0);

        if (ch == charToSkip){
            return skip2(unprocessed.substring(1),charToSkip);
        }
        else{
            return ch+skip2(unprocessed.substring(1),charToSkip);
        }
    }

    public static  String skipString( String  unprocessed ,String ToSkip){
        if (unprocessed.isEmpty()){
            return "";
        }
        char ch = unprocessed.charAt(0);

        if (unprocessed.startsWith(ToSkip)){
            return skipString(unprocessed.substring(ToSkip.length()),ToSkip);
        }
        else{
            return ch + skipString(unprocessed.substring(1),ToSkip);
        }
    }
}
