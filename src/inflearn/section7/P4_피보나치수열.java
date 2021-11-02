package inflearn.section7;

public class P4_피보나치수열 {

    // v1
//    public static int recursion(int n) {
//
//        if (n == 1 || n == 2) return 1;
//        else return recursion(n - 2) + recursion(n - 1);
//
//    }
//
//    public static void main(String[] args) {
//
//        int n = 7;
//        for (int i=1; i<=n; i++) {
//            System.out.println(recursion(7));
//        }
//    }

    // v2
//    static int[] fibo;
//
//    public static int recursion(int n) {
//
//        if (n == 1 || n == 2) return fibo[n] = 1;
//        else return fibo[n] = recursion(n - 2) + recursion(n - 1);
//
//    }
//
//    public static void main(String[] args) {
//
//        int n = 45;
//        fibo = new int[n + 1];
//        recursion(n);
//        for (int i=1; i<=n; i++) {
//            System.out.print(fibo[i] + " ");
//        }
//    }

    // v3 memoization
    static int[] fibo;

    public static int recursion(int n) {

        if (fibo[n] > 0) return fibo[n];
        if (n == 1 || n == 2) return fibo[n] = 1;
        else return fibo[n] = recursion(n - 2) + recursion(n - 1);

    }

    public static void main(String[] args) {

        int n = 45;
        fibo = new int[n + 1];
        recursion(n);
        for (int i=1; i<=n; i++) {
            System.out.print(fibo[i] + " ");
        }
    }
}
