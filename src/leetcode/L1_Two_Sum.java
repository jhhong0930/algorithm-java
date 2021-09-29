package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class L1_Two_Sum {

    static int[] twoSum(int[] nums, int target) {

        int[] answer = new int[2];

        // PASS Runtime: 58ms, Memory: 38.9MB
//        for (int i=0; i< nums.length; i++) {
//            for (int j=i+1; j< nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    answer[0] = i;
//                    answer[1] = j;
//                }
//            }
//        }

        // FAIL 44/55
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for (int i=0; i<nums.length; i++) {
//            map.put(i, nums[i]);
//        }
//
//        for (int i=0; i<nums.length-1; i++) {
//            if (map.get(i) + map.get(i + 1) == target) {
//                answer[0] = i;
//                answer[1] = i + 1;
//            }
//        }

        // PASS Runtime: 1ms, Memory: 39MB
        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i < nums.length; i++) {

            int match2 = target - nums[i];

            if (map.containsKey(match2)) {
                return new int[] {i, map.get(match2)};
            }

            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {

        int[] nums1 = {2, 7, 11, 15};
        int[] nums2 = {3, 2, 4};
        int[] nums3 = {3, 3};
        int[] nums4 = {3, 2, 3};

        int target1 = 9;
        int target2 = 6;
        int target3 = 6;
        int target4 = 6;

        System.out.println(Arrays.toString(twoSum(nums1, target1)));
        System.out.println(Arrays.toString(twoSum(nums2, target2)));
        System.out.println(Arrays.toString(twoSum(nums3, target3)));
        System.out.println(Arrays.toString(twoSum(nums4, target4)));
    }

}
