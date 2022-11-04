package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class AgressiveCows {
    public static void main(String[] args) {
        int []arr = {4,2,1,3,6};
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int i: arr) {
            ans.add(i);
        }
        System.out.println(aggressiveCows(ans, 2));
    }

    public static int aggressiveCows(ArrayList<Integer> stalls, int k) {
        int ans =  -1 ;

        Collections.sort(stalls); // this is to search the possible solution in the number line

        int maxDistance = Collections.max(stalls)-Collections.min(stalls);


        int start = 0 ; // This is just an assumption
        int end = maxDistance;
        int mid  = start + (end - start) / 2;

        while(start <= end){

            if (isPossibleSol(stalls , k , mid )){
                ans  = mid ;
                start = mid + 1; // Because as we go right side distance increases thereby cows cannot fight
            }else {
                end = mid - 1;
            }
            mid  = start + (end - start) / 2;
        }
        return ans ;
    }

    public static boolean isPossibleSol(ArrayList<Integer> stalls, int k, int mid) {
        int cowCount = 1;
        int lastPos = stalls.get(0);

        for (int i = 0; i < stalls.size(); i++) {
            if(stalls.get(i)-lastPos >= mid){
                cowCount++;
                if(cowCount == k){
                    return true;
                }
                lastPos = stalls.get(i);
            }
        }
        return false;
    }
}
