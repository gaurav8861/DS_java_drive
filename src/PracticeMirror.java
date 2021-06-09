public class PracticeMirror {


    /**
     *                          1
     *                        /   \
     *                      2       3
     *                    /   \       \
     *                   4     8       5
     *                                /  \
     *                               6    7
     *
     *             inorder binary tree - (4, 2, 8, 1, 3, 6, 5, 7)
     *
     *
     *                              1
     *                            /    \
     *                           3      2
     *                          /      /  \
     *                         5      8    4
     *                       /  \
     *                      7    6
     *
     *             inorder binary tree - (7, 5, 6, 3, 1, 8, 2, 4)
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

        System.out.println("Before Mirror : ");
        inorderTraversal(root);
        System.out.println("After Mirror : ");
        System.out.println();
        mirror(root);
        inorderTraversal(root);

    }

    public static void inorderTraversal(Node root){
        if (root == null){
            return;
        } else {
            inorderTraversal(root.leftNode);
            System.out.print(root.data + " ");
            inorderTraversal(root.rightNode);
        }
    }


    public static void mirror(Node root){
        if (root == null){
            return;
        } else {
            mirror(root.leftNode);
            mirror(root.rightNode);

            Node tmp = root.leftNode;
            root.leftNode = root.rightNode;
            root.rightNode = tmp;
        }
    }
}
