package inflearn.section7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P14_그래프_최단거리_BFS {

    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch, dis;

    public void bfs(int v) {

        ch[v] = 1;
        dis[v] = 0;
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(v);

        while (!queue.isEmpty()) {
            int cv = queue.poll();
            for (int nv : graph.get(cv)) {
                if(ch[nv] == 0){
                    ch[nv] = 1;
                    queue.offer(nv);
                    dis[nv] = dis[cv]+1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        P14_그래프_최단거리_BFS t = new P14_그래프_최단거리_BFS();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        graph=new ArrayList<ArrayList<Integer>>();

        for(int i=0; i<=n; i++) {
            graph.add(new ArrayList<Integer>());
        }

        ch = new int[n + 1];
        dis = new int[n + 1];
        for (int i=0; i<m; i++) {
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            graph.get(a).add(b);
        }

        t.bfs(1);
        for (int i=2; i<=n; i++) {
            System.out.println(i + " : " + dis[i]);
        }
    }
}
