public class tempCodeRunnerFile {
        public static void main(String[] args) {
                String str = "name";
                int j = str.length() - 1;
                int i = 0;
                char temp;
                while(i<j){
                        temp = str.charAt(i);
                        str.substring(i,i+1)=str.charAt(j);
                }
        }
}