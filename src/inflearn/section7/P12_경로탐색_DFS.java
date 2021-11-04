package inflearn.section7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class P12_경로탐색_DFS {

    static int n, m, answer=0;
    static int[][] graph;
    static int[] ch;
    public void dfs(int v){
        if(v==n) answer++;
        else{
            for(int i=1; i<=n; i++){
                if(graph[v][i]==1 && ch[i]==0){
                    ch[i]=1;
                    dfs(i);
                    ch[i]=0;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {

        P12_경로탐색_DFS t = new P12_경로탐색_DFS();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        graph=new int[n+1][n+1];
        ch=new int[n+1];

        for (int i=0; i<m; i++) {
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            graph[a][b]=1;
        }

        ch[1]=1;
        t.dfs(1);
        System.out.println(answer);
    }
}
