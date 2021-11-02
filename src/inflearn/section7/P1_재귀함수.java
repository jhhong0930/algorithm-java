package inflearn.section7;

public class P1_재귀함수 {

    public static void recursion(int n) {

        if (n == 0) return;
        else {
            recursion(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {

        recursion(3);
    }
}
