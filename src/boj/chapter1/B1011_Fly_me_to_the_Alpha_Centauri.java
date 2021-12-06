package boj.chapter1;

import java.util.Scanner;

public class B1011_Fly_me_to_the_Alpha_Centauri {

    public static int solution(int x, int y) {

//        int dist = y - x;
//        if (dist == 1) return 1;
//        if (dist == 2) return 2;
//
//        dist -= 2;
//        if (dist == 1) return 3;
//
//        int temp = 2;
//        int answer = 2;
//
//        while (dist > 0) {
//            if (dist < temp) {
//                answer++;
//                break;
//            }
//            dist -= temp;
//            temp++;
//            answer++;
//        }
//
//        return answer;

        int dist = y - x;
        int max = (int) Math.sqrt(dist);

        if (max == Math.sqrt(dist)) return max * 2 - 1;
        else if (dist <= max * max + max) return max * 2;
        else return max * 2 + 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i=0; i<t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(solution(x, y));
        }
    }
}
