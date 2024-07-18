package boj.manage4.week1;

import java.util.Scanner;

public class Day2_Fourth_11945_뜨거운붕어빵 {
    public static void solution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 1) return;
//        int m = sc.nextInt();
        sc.nextLine();

        for (int i=1; i<=n; i++) {
            String line = sc.nextLine();
            System.out.println(new StringBuilder(line).reverse());
        }
    }

    public static void main(String[] args) {
        solution();
    }
}
