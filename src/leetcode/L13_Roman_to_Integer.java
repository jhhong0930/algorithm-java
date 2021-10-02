package leetcode;

import java.util.HashMap;
import java.util.Map;

public class L13_Roman_to_Integer {

    static int romanToInt(String s) {

        /*
        - I = 1
        - V = 5
        - X = 10
        - L = 50
        - C = 100
        - D = 500
        - M = 1000
        - I + V = 4,   I + X = 9
        - X + L = 40,  X + C = 90
        - C + D = 400, C + M = 900
         */

        Map<String, Integer> map = new HashMap<>(7);
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        String[] temp = s.split("");

        int i = s.length() - 1;

        int sum = 0;
        int target; // 현재 문자열
        int left;   // 현재 문자열의 왼쪽

        while (0 <= i) {

            target = map.get(temp[i]);

            if (i > 0) { // OutOfBounds 방어

                left = map.get(temp[i - 1]);

                if (left < target) { // 왼쪽 값이 작으면
                    sum += target - left;
                    i -= 2;
                } else {
                    sum += target;
                    i--;
                }

            } else { // i == 0
                sum += target;
                i--;
            }

        }

        return sum;

        /*
        int ans = 0, num = 0;

        for (int i = s.length()-1; i >= 0; i--) {

            switch(s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }

            if (4 * num < ans) ans -= num;

            else ans += num;
        }

        return ans;
        */
    }

    public static void main(String[] args) {

        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("IX"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }

}
