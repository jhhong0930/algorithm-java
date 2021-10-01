package leetcode;

public class L9_Palindrome_Number {

    static boolean isPalindrome(int x) {

        if (x < 0) return false;

        String temp = String.valueOf(x);

        StringBuilder sb = new StringBuilder(temp);

        String reverse = sb.reverse().toString();

        return temp.equals(reverse);

//        if (x < 0 || (x != 0 && x % 10 == 0)) return false;
//
//        int temp = 0;
//
//        while (temp < x) {
//            temp = temp * 10 + x % 10;
//            x /= 10;
//        }
//
//        return (x == temp || x == temp / 10);
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(-101));
    }

}
