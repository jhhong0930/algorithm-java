package leetcode;

public class L11_Container_With_Most_Water {

    public static int maxArea(int[] height) {

        int lt = 0;
        int rt = height.length - 1;
        int max = 0;
        int sum;

        while (lt < rt) {
            sum = (rt - lt) * Math.min(height[lt], height[rt]);
            if (sum > max) max = sum;
            if (height[lt] < height[rt]) lt++;
            else rt--;
        }

        return max;
    }

    public static void main(String[] args) {

//        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
//        int[] height2 = {1, 1};
        int[] height3 = {2, 3, 10, 5, 7, 8, 9};

//        System.out.println(maxArea(height1));
//        System.out.println(maxArea(height2));
        System.out.println(maxArea(height3));
    }
}
