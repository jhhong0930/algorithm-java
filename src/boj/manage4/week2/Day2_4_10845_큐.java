package boj.manage4.week2;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/10845
 */
public class Day2_4_10845_큐 {
    private static int QUEUE_SIZE = 10000;
    private static int[] queue = new int[QUEUE_SIZE];
    private static int front = 0;
    private static int back = -1;
    private static int size = 0;

    private static void push(int x) {
        if (size < QUEUE_SIZE) {
            back = (back + 1) % QUEUE_SIZE;
            queue[back] = x;
            size++;
        }
    }

    private static boolean isEmpty() {
        return size == 0;
    }

    private static int empty() {
        return isEmpty() ? 1 : 0;
    }

    private static int pop() {
        if (isEmpty()) {
            return -1;
        } else {
            int num = queue[front];
            queue[front] = 0;
            front = (front + 1) % QUEUE_SIZE;
            size--;
            return num;
        }
    }

    private static int front() {
        if (isEmpty()) {
            return -1;
        } else {
            return queue[front];
        }
    }

    private static int back() {
        if (isEmpty()) {
            return -1;
        } else {
            return queue[back];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1 ~ 10,000 사이의 명령 개수를 입력하세요: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i=1; i<=n; i++) {
            String command = sc.nextLine();
            switch (command) {
                case "push":
                    int num = sc.nextInt();
                    sc.nextLine();
                    push(num);
                    break;
                case "pop":
                    System.out.println(pop());
                    break;
                case "size":
                    System.out.println(size);
                    break;
                case "empty":
                    System.out.println(empty());
                    break;
                case "front":
                    System.out.println(front());
                    break;
                case "back":
                    System.out.println(back());
            }
        }
    }
}
