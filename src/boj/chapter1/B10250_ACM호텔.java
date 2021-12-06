package boj.chapter1;

import java.util.Scanner;

public class B10250_ACM호텔 {

    public static int solution(int h, int w, int n) {

        int floor = n % h;
        int room = n / h + 1;

        if (n % h == 0) { // 꼭대기 층 일경우
            floor = h;
            room = n / h;
        }

        return floor * 100 + room;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i=0; i<t; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();

            System.out.println(solution(h, w, n));
        }
    }
}
