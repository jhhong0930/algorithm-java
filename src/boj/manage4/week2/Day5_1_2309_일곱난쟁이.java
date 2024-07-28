package boj.manage4.week2;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/2309
 */
public class Day5_1_2309_일곱난쟁이 {
    private static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        for (int i=0; i<n-1; i++) {
            swapped = false;
            for (int j=0; j<n-1-i; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;

                    swapped = true;
                }
            }
            // 모든 패스에서 swap 이 발생하지 않았다면 정렬된 것이므로 멈춘다.
            if (!swapped) break;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] heights = new int[9];
        int sum = 0;
        for (int i=0; i<heights.length; i++) {
            System.out.printf("%d 번 난쟁이의 키를 입력하세요: ", i+1);
            heights[i] = sc.nextInt();
            sum += heights[i];
        }

        boolean found = false;
        for (int i=0; i<heights.length-1; i++) {
            for (int j=i+1; j<heights.length; j++) {
                if (sum - heights[i] - heights[j] == 100) {
                    heights[i] = 0;
                    heights[j] = 0;
                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        bubbleSort(heights);

        for (int i=2; i<heights.length; i++) {
            System.out.println(heights[i]);
        }

    }
}
