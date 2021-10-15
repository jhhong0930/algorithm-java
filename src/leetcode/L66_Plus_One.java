package leetcode;

import java.util.Arrays;

public class L66_Plus_One {

    static int[] plusOne(int[] digits) {

//        StringBuilder sb = new StringBuilder();
//
//        Long temp = 0L;
//
//        for (int i=0; i<digits.length; i++) {
//            sb.append(digits[i]);
//        }
//
//        try {
//            temp = Long.parseLong(sb.toString()) + 1;
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//
//        String tempStr = String.valueOf(temp);
//        int length = tempStr.length();
//
//        int[] answer = new int[length];
//
//        for (int i=0; i<length; i++) {
//            answer[i] = tempStr.charAt(i) - '0';
//        }
//
//        return answer;

        int length = digits.length;

        if (length == 1 && digits[0] == 9) return new int[] {1, 0};

        for (int i=length-1; i>=0; i--) {

            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits;
            }
        }

        if (digits[0] == 0) {

            int[] answer = new int[length + 1];

            answer[0] = 1;

            return answer;
        }

        return digits;
    }

    public static void main(String[] args) {

        int[] digits1 = {1, 2, 3};
        int[] digits2 = {9};

        System.out.println(Arrays.toString(plusOne(digits1)));
        System.out.println(Arrays.toString(plusOne(digits2)));
    }
}
