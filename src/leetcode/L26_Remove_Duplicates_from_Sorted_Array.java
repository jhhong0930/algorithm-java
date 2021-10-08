package leetcode;

public class L26_Remove_Duplicates_from_Sorted_Array {

    static int removeDuplicates(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            }

            nums[count] = nums[i];
            count++;
        }
        return count;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 1, 2};
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        System.out.println(removeDuplicates(nums1));
        System.out.println(removeDuplicates(nums2));
    }

}
