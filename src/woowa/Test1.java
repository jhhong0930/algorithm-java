package woowa;

public class Test1 {

    public static int[] solution(int[] arr) {

//        Map<Integer, Integer> map = new HashMap<>();
//
//        for (int i=0; i<arr.length; i++) {
//            if (map.containsKey(arr[i])) {
//                int count = (int) map.get(arr[i]);
//                map.put(arr[i], count + 1);
//            } else {
//                map.put(arr[i], 1);
//            }
//        }

        int[] answer = new int[3];

        int countA = 0;
        int countB = 0;
        int countC = 0;

        for (int i : arr) {
            if (i == 1) countA++;
            if (i == 2) countB++;
            if (i == 3) countC++;
        }

        if (countA == countB && countB == countC) {
            return answer;
        } else {

            int max = countA;
            if (countA < countB) max = countB;
            if (countB < countC) max = countC;

            return new int[]{max - countA, max - countB, max - countC};
        }

    }

    public static void main(String[] args) {

        int[] arr1 = {2, 1, 3, 1, 2, 1};

        System.out.println(solution(arr1));
    }
}
