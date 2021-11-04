package inflearn.section7;

import java.util.LinkedList;
import java.util.Queue;

//class Node {
//
//    int data;
//    Node lt, rt;
//
//    public Node(int val) {
//        data = val;
//        lt = rt = null;
//    }
//}

public class P10_말단노드까지의_가장_짧은_경로_BFS {

    Node root;

    public int bfs(Node root) {

        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int l = 0;

        while (!q.isEmpty()) {

            int len = q.size();

            for (int i=0; i<len; i++) {

                Node cur = q.poll();

                if (cur.lt == null && cur.rt == null) return l;
                if (cur.lt != null) q.offer(cur.lt);
                if (cur.rt != null) q.offer(cur.rt);
            }

            l++;
        }

        return 0;
    }

    public static void main(String args[]) {

        P10_말단노드까지의_가장_짧은_경로_BFS tree = new P10_말단노드까지의_가장_짧은_경로_BFS();
        tree.root=new Node(1);
        tree.root.lt=new Node(2);
        tree.root.rt=new Node(3);
        tree.root.lt.lt=new Node(4);
        tree.root.lt.rt=new Node(5);
        System.out.println(tree.bfs(tree.root));
    }
}
