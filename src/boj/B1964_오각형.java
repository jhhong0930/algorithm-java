package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1964_오각형 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 5;
        int div = 45678;

        for (int i=1; i<n; i++) {
            sum = (sum + (i + 2) * 3 - 2) % div;
        }

        System.out.println(sum);
    }

}
