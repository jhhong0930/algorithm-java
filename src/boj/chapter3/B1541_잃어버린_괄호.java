package boj.chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1541_잃어버린_괄호 {

    public static int solution(String str) {

        String[] splitWithMinus = str.split("-");
        int sum = Integer.MIN_VALUE;

        for (int i=0; i<splitWithMinus.length; i++) {

            int temp = 0;
            String[] splitWithPlus = splitWithMinus[i].split("\\+");

            for (int j=0; j<splitWithPlus.length; j++) temp += Integer.parseInt(splitWithPlus[j]);

            if (sum == Integer.MIN_VALUE) sum = temp;
            else sum -= temp;
        }

        return sum;
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(solution(str));
    }
}
