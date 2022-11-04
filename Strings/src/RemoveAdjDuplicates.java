
//This is wrong can be solved using stack so wait
public class RemoveAdjDuplicates {
    public static void main(String[] args) {
        String s = "aaaaaaaa";
        String ans = removeDuplicates(s);
        System.out.println(ans);
    }
    public static String removeDuplicates(String s) {
        int i = 0 , j = 1 ;

        if(s.length()==1){
            return s;
        }

        while(j<s.length() ){
            String temp = s.substring(i,j+1);
            if(temp.charAt(0)==temp.charAt(1)){
                s=s.replaceFirst(temp,"");
                i--;
                j--;
            }else{
                i++;
                j++;
            }
            if (i<0){
                i=0;
                j=1;
            }
        }
        return s;
    }
}
