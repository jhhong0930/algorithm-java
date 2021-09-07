package boj.dataStructure;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class B2164_카드2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> card = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());

        for (int i=1; i<=n; i++) {
            card.add(i);
        }

        while (card.size() != 1) {

            card.poll();
            int temp = card.poll();
            card.add(temp);
        }

        System.out.println(card.peek());

        br.close();
    }

}
