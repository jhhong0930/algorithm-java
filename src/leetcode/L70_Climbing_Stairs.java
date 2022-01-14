package leetcode;

public class L70_Climbing_Stairs {

//    public static int climbStairs(int n) {
//
//        int mem1 = 1;
//        int mem2 = 2;
//
//        if (n < 3) return n;
//
//        for (int i=3; i<=n; i++){
//            mem2 = mem1 + mem2;
//            mem1 = mem2 - mem1;
//        }
//
//        return mem2;
//    }

    public static int climbStairs(int n) {

        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i=2; i<=n; i++) dp[i] = dp[i - 1] + dp[i - 2];
        return dp[n];
    }

    public static void main(String[] args) {

        System.out.println(climbStairs(2));
        System.out.println(climbStairs(3));
        System.out.println(climbStairs(10));
    }
}
