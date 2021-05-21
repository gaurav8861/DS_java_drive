
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Solution {

    /*
    
    class Node
        int data;
        Node left;
        Node right;
    */
    public static void topView(Node root) {
        if(root == null){
            return;
        }

        Map<Integer, List<Node>> map = new TreeMap<>();
        Map<Node, Integer> dist = new HashMap<>();
        List<Node> lst = new ArrayList<>();
        lst.add(root);
        map.put(0, lst);
        dist.put(root, 0);
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node n = ((LinkedList<Node>) queue).pop();
            if(n.leftNode != null){
                dist.put(n.leftNode, dist.get(n)-1);
                addToMap(n.leftNode, dist.get(n)-1, map);
                queue.add(n.leftNode);
            }
            if(n.rightNode != null){
                dist.put(n.rightNode, dist.get(n)+1);
                addToMap(n.rightNode, dist.get(n)+1, map);
                queue.add(n.rightNode);
            }
        }
        for (Integer i : map.keySet()){
            System.out.print(map.get(i).get(0).data + " ");
        }


    }
    public static void addToMap(Node n, int key, Map<Integer, List<Node>> map){
        List<Node> lst = null;
        if (map.get(key) != null){
            lst = map.get(key);
            lst.add(n);
        }else{
            lst = new ArrayList<>();
            lst.add(n);
            map.put(key, lst);
        }
    }

    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.leftNode, data);
                root.leftNode = cur;
            } else {
                cur = insert(root.rightNode, data);
                root.rightNode = cur;
            }
            return root;
        }
    }

    public static void print(Node root) {
        if(root == null) {
            return;
        } else {
            System.out.println(root.data);
            print(root.leftNode);
            print(root.rightNode);
        }
    }

    public static int height(Node root) {
        if(root == null) {
            return 0;
        } else {
            int lh = height(root.leftNode);
            int rh = height(root.rightNode);
            if (root.leftNode == null && root.rightNode == null)
                return Math.max(lh, rh);
            else return Math.max(lh, rh) + 1;
        }
    }

    public static void main(String[] args) throws IOException {
//        Node root = new Node(3);
//        root.leftNode = new Node(2);
//        root.rightNode = new Node(5);
//        root.leftNode.leftNode = new Node(1);
//        root.rightNode.leftNode = new Node(4);
//        root.rightNode.rightNode = new Node(6);
//        root.rightNode.rightNode.rightNode = new Node(7);
//
//        System.out.println(height(root));



//        Scanner sc = new Scanner(System.in);
//        int numberOfQueries = sc.nextInt();
//        Queue<Integer> queue = new LinkedList<>();
//        List<String> queries = new ArrayList<>();
//        for(int i=0; i<= numberOfQueries; i++){
//            String s = sc.nextLine("\n");
//            System.out.println(s);
//            queries.add(s);
//        }
//        for(String str : queries){
//            System.out.println(queries.size());
//            String[] query=str.split(" ");
//            int query_int = Integer.parseInt(query[0]);
//            switch (query_int){
//                // enqueue
//                case 1:
//                    queue.add(Integer.parseInt(query[1]));
//                    break;
//                 //dequeue
//                case 2:
//                    ((LinkedList<Integer>) queue).pop();
//                    break;
//                 //print
//                case 3:
//                    System.out.println(queue.peek());
//                    break;
//            }
        }
    }
