package boj.chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2869_달팽이는_올라가고_싶다 {

    public static int solution(int a, int b, int v) {

//        int location = 0;
//        int cnt = 0;
//
//        while (location <= v) {
//            location += a;
//            if (location >= v) break;
//            location -= b;
//            cnt++;
//        }
//
//        return cnt;

        int answer = (v - b) / (a - b);
        if ((v - b) % (a - b) != 0) answer++;
        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        System.out.println(solution(a, b, v));
    }
}
