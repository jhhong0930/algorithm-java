package boj.dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B1936_후위표기식2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Double> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        double[] operand = new double[n];
        char[] input = br.readLine().toCharArray();

        for (int i = 0; i < n; i++) operand[i] = Integer.parseInt(br.readLine());

        for (char c : input) {

            if (Character.isAlphabetic(c)) {
                int item = (int) c - 65;
                stack.push(operand[item]);
            } else {

                Double result = 0.d;
                Double pop1 = stack.pop();
                Double pop2 = stack.pop();

                switch (c) {

                    case '+':
                        result = pop2 + pop1;
                        break;

                    case '-':
                        result = pop2 - pop1;
                        break;

                    case '*':
                        result = pop2 * pop1;
                        break;

                    case '/':
                        result = pop2 / pop1;
                        break;
                }

                stack.push(result);

            }

        }

        System.out.printf("%.2f", stack.pop());
    }

}
