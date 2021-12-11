package secondhand;

import java.util.*;

public class Test2 {

    public static int solution(int[] v) {

        int sum = 0;
        Deque<Integer> deque = new ArrayDeque<>();
        Arrays.sort(v);
        deque.add(v[0]);

        int lt = 1;
        int rt = v.length - 1;

        while (true) {
            deque.addFirst(v[rt]);
            rt--;
            if (lt == rt) break;
            deque.addLast(v[rt]);
            rt--;
            if (lt == rt) break;
            deque.addFirst(v[lt]);
            lt++;
            if (lt == rt) break;
            deque.addLast(v[lt]);
            lt++;
            if (lt == rt) break;
        }

        deque.addFirst(v[rt]);

        List<Integer> list = new ArrayList<>(deque);

        System.out.println(list);

        for (int i=0; i<list.size()-1; i++) {
            sum += Math.abs(list.get(i) - list.get(i + 1));
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] v = {20, 8, 10, 1, 4, 15};
        System.out.println(solution(v));
    }
}
