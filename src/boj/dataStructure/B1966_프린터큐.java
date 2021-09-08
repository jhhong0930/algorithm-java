package boj.dataStructure;

import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B1966_프린터큐 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i=0; i<t; i++) {

            LinkedList<int[]> queue = new LinkedList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());

            for (int j=0; j<n; j++) {
                queue.offer(new int[]{j, Integer.parseInt(st.nextToken())});
            }

            int count = 0;

            while (!queue.isEmpty()) {

                int[] front = queue.poll();
                boolean isMax = true;

                for (int k=0; k<queue.size(); k++) {

                    if (front[1] < queue.get(k)[1]) {

                        queue.offer(front);

                        for (int l=0; l<k; l++) {
                            queue.offer(queue.poll());
                        }

                        isMax = false;
                        break;
                    }

                }

                if (!isMax) continue;
                count++;

                if (front[0] == m) break;
            }

            sb.append(count).append("\n");
        }

        System.out.println(sb);
    }

}
