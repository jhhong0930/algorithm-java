package inflearn.section7;

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

public class P9_말단노드까지의_가장_짧은_경로_DFS {

    Node root;

    public int dfs(int l, Node root) {

        if (root.lt == null && root.rt == null) return l;
        else return Math.min(dfs(l + 1, root.lt), dfs(l + 1, root.rt));
    }

    public static void main(String args[]) {

        P9_말단노드까지의_가장_짧은_경로_DFS tree = new P9_말단노드까지의_가장_짧은_경로_DFS();
        tree.root=new Node(1);
        tree.root.lt=new Node(2);
        tree.root.rt=new Node(3);
        tree.root.lt.lt=new Node(4);
        tree.root.lt.rt=new Node(5);
        System.out.println(tree.dfs(0, tree.root));
    }
}
