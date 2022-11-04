import java.util.ArrayList;

public class MergeSortArr {
    public static void main(String[] args) {
        ArrayList<Integer> num1 = new ArrayList<>();
        num1.add(1);
        num1.add(3);
        num1.add(5);
        num1.add(7);
        ArrayList<Integer> num2 = new ArrayList<>();
        num2.add(2);
        num2.add(4);
        num2.add(6);
        ArrayList<Integer> ans = new ArrayList<>();
        ans = merge(num1, num1.size(), num2 , num2.size());
        System.out.println(ans);

    }

    public static ArrayList<Integer>  merge(ArrayList<Integer> num1 , int m ,ArrayList<Integer> num2 , int n){
        ArrayList<Integer> num = new ArrayList<>();
        int i = 0 ;
        int j  = 0 ;
        while(i<num1.size() && j< num2.size()){
            if(num1.get(i)< num2.get(j)){
                num.add(num1.get(i));
                i++;
            }else{
                num.add(num2.get(j));
                j++;
            }
        }
        while(i != num1.size()){
            num.add(num1.get(i));
            i++;
        }
        while(j != num2.size()){
            num.add(num2.get(j));
            j++;
        }
        return num ;
    }

    public static int [] merge1(int arr1[] , int arr2[]){
        int i = 0 ;

        while (i<arr1.length && arr1[i]!=0){
            if(arr1[i]>arr2[0]){
                if (arr2.length>1){
                    if(arr2[0]>arr2[1]){
                        int temp = arr2[0];
                        arr2[0] =arr2[1];
                        arr2[1]=temp;
                    }
                }

            }
            i++;
        }

        int j = 0 ;
        while(i< arr1.length){
            arr1[i] = arr2[j];
            i++;
            j++;
        }

        return arr1;
    }
}

