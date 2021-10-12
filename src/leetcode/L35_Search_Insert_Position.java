package leetcode;

public class L35_Search_Insert_Position {

    static int searchInsert(int[] nums, int target) {

        int numsLen = nums.length;

        for (int i=0; i<numsLen; i++) {

            if (nums[i] == target) {
                return i;
            } else if (nums[i] > target) {
                return i;
            }
        }

        return numsLen;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 3, 5, 6};
        int target1 = 5;

        int[] nums2 = {1, 3, 5, 6};
        int target2 = 7;

        System.out.println(searchInsert(nums1, target1));
        System.out.println(searchInsert(nums2, target2));
    }

}
