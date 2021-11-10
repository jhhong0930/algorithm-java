package inflearn.section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P3_가위바위보 {

    public static void solution(int n, int[] a, int[] b) {

//        for (int i=0; i<n; i++) {
//
//            switch (a[i]) {
//                case 1:
//                    if (b[i] == 1) {
//                        System.out.println("D");
//                    } else if (b[i] == 2) {
//                        System.out.println("B");
//                    } else {
//                        System.out.println("A");
//                    }
//                    break;
//                case 2:
//                    if (b[i] == 1) {
//                        System.out.println("A");
//                    } else if (b[i] == 2) {
//                        System.out.println("D");
//                    } else {
//                        System.out.println("B");
//                    }
//                    break;
//                case 3:
//                    if (b[i] == 1) {
//                        System.out.println("B");
//                    } else if (b[i] == 2) {
//                        System.out.println("A");
//                    } else {
//                        System.out.println("D");
//                    }
//                    break;
//            }
//        }

        for (int i=0; i<n; i++) {

            if (a[i] == b[i]) System.out.println("D");
            else if (a[i] == 1 && b[i] == 3) System.out.println("A");
            else if (a[i] == 2 && b[i] == 1) System.out.println("A");
            else if (a[i] == 3 && b[i] == 2) System.out.println("A");
            else System.out.println("B");
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] a = new int[n];
        int[] b = new int[n];

        for (int i=0; i<n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        for (int i=0; i<n; i++) {
            b[i] = Integer.parseInt(br.readLine());
        }

        solution(n, a, b);
    }
}
