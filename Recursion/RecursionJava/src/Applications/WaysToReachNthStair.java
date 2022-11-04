package Applications;

public class WaysToReachNthStair {
    public static void main(String[] args) {
        System.out.println(countDistinctWayToClimbStair(4));
    }
    public static int countDistinctWayToClimbStair(long nStairs) {
        if (nStairs < 0 ){
            return 0;
        }
        if (nStairs == 0 ){
            return 1;
        }
        int ans = countDistinctWayToClimbStair(nStairs-1)+countDistinctWayToClimbStair(nStairs-2);
        return ans;
    }
}
