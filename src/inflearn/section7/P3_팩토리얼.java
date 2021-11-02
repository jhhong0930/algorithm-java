package inflearn.section7;

public class P3_팩토리얼 {

    public static int recursion(int n) {

        if (n == 0) return 1;
        else return n * recursion(n - 1);
    }

    public static void main(String[] args) {

        System.out.println(recursion(5));
    }
}
