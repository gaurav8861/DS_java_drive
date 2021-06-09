import java.util.*;

public class PracticeTest {

    private static PracticeTest obj = null;

    private PracticeTest(){


    }
    public static PracticeTest getSingletonObj(){
        if (obj != null){
            obj = new PracticeTest();
            return obj;
        }else{
            return obj;
        }
    }


    public static void getArr(){
        List<Integer> lst = Arrays.asList(1, 2, 3, 4, 7, 11, -6, 2, 5);
        Collections.sort(lst);
        int j = 1;
        for (int i =0 ; i< lst.size(); i++){
            if(lst.get(i) >= j){
                j = lst.get(i);
                if (lst.contains(j+1)){
                    j = j+1;
                }else {
                    System.out.println(j+1);
                    break;
                }
            }
        }

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.leftNode = new Node(2);
        root.rightNode = new Node(3);
        root.leftNode.leftNode = new Node(4);
        root.leftNode.rightNode = new Node(5);
        root.leftNode.leftNode.leftNode = new Node(6);
        root.leftNode.rightNode.rightNode = new Node(7);
        root.rightNode.rightNode = new Node(8);
        root.rightNode.rightNode.rightNode = new Node(9);

        /***
         *                                   1
         *                                 /   \
         *                                2     3
         *                               /  \     \
         *                              4    5     8
         *                             /      \     \
         *                            6        7     9
         */

        // 6, 7, 9
        System.out.println("leaf nodes of binary tree iterative");
        Integer count = leafNodesOfBinaryTreeIterative(root);
        System.out.println(count);

        System.out.println("leaf nodes of binary tree recursive");
        Integer count1 = leafNodesOfBinaryTreeRecursive(root);
        System.out.println(count1);
    }

    private static Integer leafNodesOfBinaryTreeIterative(Node root) {
        if (root == null)
            return 0;
        Stack<Node> stack = new Stack<>();
        Integer count = 0;
        stack.add(root);
        while (!stack.isEmpty()){
            Node n = stack.pop();
            if (n.leftNode == null && n.rightNode == null){
                count++;
            }
            if (n.leftNode != null){
                stack.add(n.leftNode);
            }
            if (n.rightNode != null){
                stack.add(n.rightNode);
            }
        }
        return count;
    }
    private static Integer leafNodesOfBinaryTreeRecursive(Node root) {
        if (root == null)
            return 0;
        else if (root.leftNode == null && root.rightNode == null){
            return 1;
        }
        return leafNodesOfBinaryTreeRecursive(root.leftNode) + leafNodesOfBinaryTreeRecursive(root.rightNode);
    }

}



