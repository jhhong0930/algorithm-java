package inflearn.section6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Point implements Comparable<Point> {

    public int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {

        if (this.x == o.x) return this.y - o.y;
        else return this.x - o.x;
    }
}

public class P7_좌표정렬 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Point> list = new ArrayList<>();

        for (int i=0; i<n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            list.add(new Point(x, y));
        }

        Collections.sort(list);

        for (Point o : list) System.out.println(o.x + " " + o.y);
    }
}
