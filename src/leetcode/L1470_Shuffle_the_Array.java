package leetcode;

import java.util.Arrays;

public class L1470_Shuffle_the_Array {

//    public static int[] shuffle(int[] nums, int n) {
//
//        int[] arr = new int[n * 2];
//        int pos1 = 0;
//        int pos2 = n;
//        int idx = 0;
//
//        while (idx <= n * 2 - 1) {
//            arr[idx] = nums[pos1];
//            idx++;
//            pos1++;
//            arr[idx] = nums[pos2];
//            idx++;
//            pos2++;
//        }
//
//        return arr;
//    }

    public static int[] shuffle(int[] nums, int n) {

        int[] arr = new int[n * 2];

        for (int i=0; i<n; i++) {
            arr[2 * i] = nums[i];
            arr[2 * i + 1] = nums[i + n];
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] nums1 = {2, 5, 1, 3, 4, 7};
        int[] nums2 = {1, 2, 3, 4, 4, 3, 2, 1};
        int[] nums3 = {1, 1, 2, 2};
        int n1 = 3;
        int n2 = 4;
        int n3 = 2;

        System.out.println(Arrays.toString(shuffle(nums1, n1)));
        System.out.println(Arrays.toString(shuffle(nums2, n2)));
        System.out.println(Arrays.toString(shuffle(nums3, n3)));
    }
}
