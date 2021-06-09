import java.util.Stack;

public class PracticeHeight {


/**
 *                          1
 *                        /   \
 *                      2       3
 *                    /   \       \
 *                   4     8       5
 *                                /  \
 *                               6    7
 *
 *             Spiral View of binary tree - (1, 3, 2, 4, 5, 6, 7, 9, 8)
 */

    public static void main(String[] args) {
        Node root = new Node(1);
        root.leftNode = new Node(2);
        root.rightNode = new Node(3);
        root.rightNode.rightNode = new Node(5);
        root.rightNode.rightNode.leftNode = new Node(6);
        root.rightNode.rightNode.rightNode = new Node(7);
        root.leftNode.leftNode = new Node(4);
        root.leftNode.rightNode = new Node(8);

        System.out.println("Height : " + height(root));

        System.out.println("No. of Nodes : " + numberOfNodes(root));

    }

    private static int height(Node root) {
        if (root == null){
            return 0;
        }
        else {
            int lh = height(root.leftNode);
            int rh = height(root.rightNode);
            return Math.max(lh, rh) + 1;
        }

    }

    private static int numberOfNodes(Node root) {
        if (root == null){
            return 0;
        }
        else {
            int lh = numberOfNodes(root.leftNode);
            int rh = numberOfNodes(root.rightNode);
            return lh + rh + 1;
        }

    }
}

