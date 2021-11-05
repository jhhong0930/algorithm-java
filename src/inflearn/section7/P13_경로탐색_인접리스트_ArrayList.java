package inflearn.section7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class P13_경로탐색_인접리스트_ArrayList {

    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;

    public void dfs(int v) {

        if (v == n) answer++;
        else {
            for (int nv : graph.get(v)) {
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    dfs(nv);
                    ch[nv] = 0;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {

        P13_경로탐색_인접리스트_ArrayList t = new P13_경로탐색_인접리스트_ArrayList();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        graph = new ArrayList<ArrayList<Integer>>();

        for (int i=0; i<=n; i++) {
            graph.add(new ArrayList<Integer>());
        }

        ch = new int[n+1];
        for (int i=0; i<m; i++) {
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            graph.get(a).add(b);
        }

        ch[1] = 1;
        t.dfs(1);
        System.out.println(answer);
    }
}
