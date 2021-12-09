package boj.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B10773_제로 {

    public static void main(String[] args) throws IOException {

        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i=0; i<k; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) stack.pop();
            else stack.push(num);
        }

        for (int x : stack) sum += x;
        System.out.println(sum);
    }
}
