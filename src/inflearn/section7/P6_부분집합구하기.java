package inflearn.section7;

public class P6_부분집합구하기 {

    static int n;
    static int[] ch;

    public static void dfs(int l) {

        if (l == n + 1) {

            String temp = "";

            for (int i=1; i<=n; i++) {
                if (ch[i] == 1) temp += (i + " ");
            }

            if (temp.length() > 0) System.out.println(temp);
        } else {
            ch[l] = 1;
            dfs(l + 1); // 왼쪽
            ch[l] = 0;
            dfs(l + 1); // 오른쪽
        }
    }

    public static void main(String[] args) {

        n = 3;
        ch = new int[n + 1];
        dfs(1);
    }
}
