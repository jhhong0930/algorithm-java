package leetcode;

public class L70_Climbing_Stairs {

    public int climbStairs(int n) {

        int mem1 = 1;
        int mem2 = 2;

        if( n < 3) return n;

        for( int i = 3 ; i <= n ; i++){
            mem2 = mem1 + mem2;
            mem1 = mem2-mem1;
        }

        return mem2;
    }
}
