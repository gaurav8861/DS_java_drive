import java.util.*;
import java.util.stream.Collectors;

public class LeftViewOfBinaryTree {

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

        System.out.println("Left view of binary tree");
        List<Integer> map = leftViewOfBinaryTree(root);
        System.out.println(map);
    }

    public static List<Integer> leftViewOfBinaryTree(Node root){
        if (root == null){
            return null;
        }
        Queue<Node> queue = new LinkedList<Node>();
        Map<Integer, List<Node>> map = new HashMap<>();
        Map<Node, Integer> dst = new HashMap<>();
        queue.add(root);
        List<Node> lst = new ArrayList<>();
        lst.add(root);
        map.put(0, lst);
        dst.put(root, 0);
        while (!queue.isEmpty()){
            root = ((LinkedList<Node>) queue).pop();
            if (root.leftNode != null){
                addNodeToMap(root.leftNode, dst.get(root) + 1, map);
                dst.put(root.leftNode, dst.get(root) + 1);
                queue.add(root.leftNode);
            }
            if (root.rightNode != null){
                addNodeToMap(root.rightNode, dst.get(root)+1, map);
                dst.put(root.rightNode, dst.get(root) + 1);
                queue.add(root.rightNode);
            }
        }
        return map.entrySet().stream()
                .map(x -> x.getValue().get(0).data)
                .collect(Collectors.toList());
    }

    public static void addNodeToMap(Node n, Integer index, Map<Integer, List<Node>> map){
        List<Node> lst = null;
        if (map.get(index) != null){
            lst = map.get(index);
            lst.add(n);
            map.put(index, lst);
        }else {
            lst = new ArrayList<>();
            lst.add(n);
            map.put(index, lst);
        }
    }
}
