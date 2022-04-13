package leetcode;

import java.util.Arrays;

public class L344_Reverse_String {

    public static void reverseString(char[] s) {

        int l = 0;
        int r = s.length - 1;

        while (l < r) {
            char tmp = s[l];
            s[l] = s[r];
            s[r] = tmp;
            l++;
            r--;
        }

        System.out.println(Arrays.toString(s));
    }

    public static void main(String[] args) {

        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);

    }
}
