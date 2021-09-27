package leetcode;

import java.util.Arrays;

public class L189_Rotate_Array {

    static void rotate(int[] nums, int k) {

        for (int i=0; i<k; i++) {
            nums = change(nums);
        }

        System.out.println(Arrays.toString(nums));
    }

    static int[] change(int[] nums) {

        int[] temp = new int[nums.length];

        int last = nums.length - 1;

        for (int i=0; i<nums.length; i++) {
            if (i == last) {
                temp[0] = nums[last];
            } else {
                temp[i + 1] = nums[i];
            }
        }

        return temp;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int[] nums2 = {-1, -100, 3, 99};

        int k1 = 3;
        int k2 = 2;

        rotate(nums1, k1);
        rotate(nums2, k2);
    }

}
