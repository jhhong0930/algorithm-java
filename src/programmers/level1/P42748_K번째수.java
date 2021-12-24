package programmers.level1;

import java.util.Arrays;

public class P42748_K번째수 {

    public static int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];

        for (int i=0; i<commands.length; i++) {

            int start = commands[i][0] - 1;
            int end = commands[i][1] - 1;
            int target = commands[i][2] - 1;
            int[] temp = new int[end - start + 1];

            int idx = 0;
            for (int j=start; j<=end; j++) temp[idx++] = array[j];
            sort(temp);

            answer[i] = temp[target];
        }

        return answer;
    }

    static int[] sort(int[] arr) {

        for (int i=0; i<arr.length-1; i++) {

            int idx = i;

            for (int j=i+1; j<arr.length; j++) if (arr[j] < arr[idx]) idx = j;

            if (idx != i) {
                int temp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = temp;
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println(Arrays.toString(solution(array, commands)));
    }
}
