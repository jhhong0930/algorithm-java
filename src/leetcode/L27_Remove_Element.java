package leetcode;

import java.util.Arrays;

public class L27_Remove_Element {

    static int removeElement(int[] nums, int val) {

        int count = 0;

//        for (int i=0; i<nums.length; i++) {
//
//            if (nums[i] == val) {
//                count++;
//            } else {
//                nums[i - count] = nums[i];
//            }
//        }

        for (int x : nums) {

            if (x != val) {

                nums[count] = x;

                count++;
            }
        }

        System.out.println(Arrays.toString(nums));

//        return nums.length - count;
        return count;
    }

    public static void main(String[] args) {

        int[] nums1 = {3, 2, 2, 3};
        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};

        int val1 = 3;
        int val2 = 2;

        System.out.println(removeElement(nums1, val1));
        System.out.println(removeElement(nums2, val2));

    }

}
