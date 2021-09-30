package leetcode;

public class L7_Reverse_Integer {

    static int reverse(int x) {

        if (x == Integer.MIN_VALUE) return 0;

        if (x < 0) {

            StringBuffer sb = new StringBuffer(String.valueOf(Math.abs(x)));

            String temp = sb.reverse().toString();

            long answer = Long.parseLong(temp);

            if (answer > Integer.MAX_VALUE || answer < Integer.MIN_VALUE) {
                return 0;
            } else {
                return (int) answer;
            }

        } else {

            StringBuffer sb = new StringBuffer(String.valueOf(x));

            String temp = sb.reverse().toString();

            long answer = Long.parseLong(temp);

            if (answer > Integer.MAX_VALUE || answer < Integer.MIN_VALUE) {
                return 0;
            } else {
                return (int) answer;
            }
        }

    }

    public static void main(String[] args) {

        System.out.println(reverse(-2147483648));
    }

}
