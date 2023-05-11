//Hilkia Kennan Latjandu - 2602174485
//question a and b

public class Main {
    static class Node {
        Node left;
        Node right;
        int num;

        Node(int num) {
            this.num = num;
            left = null;
            right = null;
        }
    }
    public int countitem(Node node) {
        if (node == null) {
            return 0;
        } else {
            int leftCount = countitem(node.left);
            int rightCount = countitem(node.right);

            return node.num + leftCount + rightCount;
        }
    }
    public int countkey(Node node) {
        if (node == null) {
            return 0;
        } else {
            int leftCount = countkey(node.left);
            int rightCount = countkey(node.right);

            return 1 + leftCount + rightCount;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(8);
        root.right.left = new Node(12);
        root.right.right = new Node(18);

        Main tree = new Main();
        int sumitem = tree.countitem(root);
        int sumkey = tree.countkey(root);
        System.out.println("sum of the items in binary tree : " + sumitem);
        System.out.println("sum of the keys in binary tree : " + sumkey);
    }
}
