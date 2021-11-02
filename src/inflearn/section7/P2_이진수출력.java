package inflearn.section7;

public class P2_이진수출력 {

    public static void recursion(int n) {

        if (n == 0) return;
        else {
            recursion(n / 2);
            System.out.print(n % 2);
        }
    }

    public static void main(String[] args) {

        recursion(11);
    }
}
