package leetcode;

public class L125_Valid_Palindrome {

    public static boolean isPalindrome(String s) {

        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]|/s", "");
        char[] arr = s.toCharArray();

        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            if (arr[l] != arr[r]) return false;
            else {
                l++;
                r--;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

}
