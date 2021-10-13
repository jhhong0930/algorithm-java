package leetcode;

public class L53_Maximum_Subarray {

    static int maxSubArray(int[] nums) {

//        int sum = 0;
//
//        int min = Integer.MIN_VALUE;
//
//        for (int i=0; i<nums.length; i++) {
//
//            sum += nums[0];
//
//            if (sum < nums[i]) sum = nums[i];
//
//            if (sum > min) min = sum;
//        }
//
//        return min;

        int sum = nums[0];

        int current = sum;

        for (int i=1; i<nums.length; i++) {

            current = Math.max(nums[i] + current, nums[i]);

            sum = Math.max(current, sum);
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums2 = {1};
        int[] nums3 = {5, 4, -1, 7, 8};

        System.out.println(maxSubArray(nums1));
        System.out.println(maxSubArray(nums2));
        System.out.println(maxSubArray(nums3));
    }

}
