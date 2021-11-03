package inflearn.section7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class P8_송아지찾기 {

    int answer = 0;
    int[] dis = {1, -1, 5};
    int[] ch;
    Queue<Integer> q = new LinkedList<>();

    public int bfs(int s, int e) {

        ch = new int[10001];
        ch[s] = 1;
        q.offer(s);
        int l = 0;

        while (!q.isEmpty()) {

            int len = q.size();

            for (int i=0; i<len; i++) {

                int x = q.poll();

//                if (x == e) return l;

                for (int j=0; j<3; j++) {

                    int nx = x + dis[j];
                    if (nx == e) return l + 1;
                    if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {
                        ch[nx] = 1;
                        q.offer(nx);
                    }
                }
            }

            l++;
        }

        return 0;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int s = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());

        P8_송아지찾기 t = new P8_송아지찾기();

        System.out.println(t.bfs(s, e));
    }
}
