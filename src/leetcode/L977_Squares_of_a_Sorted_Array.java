package leetcode;

import java.util.Arrays;

public class L977_Squares_of_a_Sorted_Array {

    static int[] sortedSquares(int[] nums) {

        int[] answer = new int[nums.length];

        for (int i=0; i< nums.length; i++) {
            answer[i] = Math.abs(nums[i]) * Math.abs(nums[i]);
            System.out.println(answer[i]);
        }

        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {

        int[] nums1 = {-4, -1, 0, 3, 10};
        int[] nums2 = {-7, -3, 2, 3, 11};

        System.out.println(Arrays.toString(sortedSquares(nums1)));
        System.out.println(Arrays.toString(sortedSquares(nums2)));
    }

}
