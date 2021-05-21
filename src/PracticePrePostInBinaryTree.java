import java.util.*;

/**
 *                          1
 *                        /   \
 *                      2       3
 *                    /   \   /   \
 *                   4     5  6    7
 *                        /         \
 *                       8           9
 *
 * 		Pre : n-l-r (1, 2, 4, 5, 8, 3, 6, 7, 9)
 * 		Post : l-r-n (4, 8, 5, 2, 6, 9, 7, 3, 1)
 * 		In-order : l-n-r (4, 2, 8, 5, 1, 6, 3, 7, 9)
 */
public class PracticePrePostInBinaryTree {
	public static void main(String[] args) {
		Node root = new Node(1);
		root.leftNode = new Node(2);
		root.rightNode = new Node(3);
		root.leftNode.leftNode = new Node(4);
		root.leftNode.rightNode = new Node(5);
		root.rightNode.leftNode = new Node(6);
		root.rightNode.rightNode = new Node(7);
		root.rightNode.rightNode.rightNode = new Node(9);
		root.leftNode.rightNode.leftNode = new Node(8);
//
////		System.out.println("pre order");
////		preOrderTraversalRecursive(root);
////		System.out.println();
////
////		System.out.println("post order");
////		postOrderTraversalRecursive(root);
////		System.out.println();
////
////		System.out.println("in order");
////		inOrderTraversalRecursive(root);
////		System.out.println();
//
////		System.out.println("pre order - Iterative");
////		preOrderTraversalIterative(root);
////		System.out.println();
//
//		System.out.println("in order - Iterative");
//		postOrderTraversalIterative(root);
//		System.out.println();
//		List<Integer> arr = new ArrayList<>();
//		arr.add(1);
//		arr.add(2);
//		arr.add(3);
//		arr.add(4);
//		arr.add(5);
//		System.out.println(rotateLeft(4, arr));

//		String[] strings = {
//				"lekgdisnsbfdzpqlkg","eagemhdygyv","jwvwwnrhuai","urcadmrwlqe","mpgqsvxrijpombyv","mpgqsvxrijpombyv","urcadmrwlqe","mpgqsvxrijpombyv","eagemhdygyv","eagemhdygyv","jwvwwnrhuai","urcadmrwlqe","jwvwwnrhuai","kvugevicpsdf","kvugevicpsdf","mpgqsvxrijpombyv","urcadmrwlqe","mpgqsvxrijpombyv","exdafbnobg","qhootohpnfvbl","suffrbmqgnln","exdafbnobg","exdafbnobg","eagemhdygyv","mpgqsvxrijpombyv","urcadmrwlqe","jwvwwnrhuai","lekgdisnsbfdzpqlkg","mpgqsvxrijpombyv","lekgdisnsbfdzpqlkg","jwvwwnrhuai","exdafbnobg","mpgqsvxrijpombyv","kvugevicpsdf","qhootohpnfvbl","urcadmrwlqe","kvugevicpsdf","mpgqsvxrijpombyv","lekgdisnsbfdzpqlkg","mpgqsvxrijpombyv","kvugevicpsdf","qhootohpnfvbl","lxyqetmgdbmh","urcadmrwlqe","urcadmrwlqe","kvugevicpsdf","lxyqetmgdbmh","urcadmrwlqe","lxyqetmgdbmh","jwvwwnrhuai","qhootohpnfvbl","qhootohpnfvbl","jwvwwnrhuai","lekgdisnsbfdzpqlkg","kvugevicpsdf","mpgqsvxrijpombyv","exdafbnobg","kvugevicpsdf","lekgdisnsbfdzpqlkg","qhootohpnfvbl","exdafbnobg","qhootohpnfvbl","exdafbnobg","mpgqsvxrijpombyv","suffrbmqgnln","mpgqsvxrijpombyv","qhootohpnfvbl","jwvwwnrhuai","mpgqsvxrijpombyv","qhootohpnfvbl","lekgdisnsbfdzpqlkg","eagemhdygyv","jwvwwnrhuai","kvugevicpsdf","eagemhdygyv","eagemhdygyv","lxyqetmgdbmh","qhootohpnfvbl","lxyqetmgdbmh","exdafbnobg","qhootohpnfvbl","qhootohpnfvbl","exdafbnobg","suffrbmqgnln","mpgqsvxrijpombyv","urcadmrwlqe","eagemhdygyv","lxyqetmgdbmh","urcadmrwlqe","suffrbmqgnln","qhootohpnfvbl","kvugevicpsdf","lekgdisnsbfdzpqlkg","lxyqetmgdbmh","mpgqsvxrijpombyv","jwvwwnrhuai","lxyqetmgdbmh","lxyqetmgdbmh","lekgdisnsbfdzpqlkg","qhootohpnfvbl"
//
//				};
//		String[] queries = {"exdafbnobg","eagemhdygyv","mpgqsvxrijpombyv","kvugevicpsdf","lekgdisnsbfdzpqlkg","kvugevicpsdf","exdafbnobg","qhootohpnfvbl","eagemhdygyv","kvugevicpsdf","suffrbmqgnln","jwvwwnrhuai","lekgdisnsbfdzpqlkg","lekgdisnsbfdzpqlkg","mpgqsvxrijpombyv","jwvwwnrhuai","kvugevicpsdf","lekgdisnsbfdzpqlkg","exdafbnobg","suffrbmqgnln","qhootohpnfvbl","eagemhdygyv","exdafbnobg","suffrbmqgnln","jwvwwnrhuai","qhootohpnfvbl","eagemhdygyv","exdafbnobg","exdafbnobg","jwvwwnrhuai","qhootohpnfvbl","lxyqetmgdbmh","qhootohpnfvbl","suffrbmqgnln","lxyqetmgdbmh","qhootohpnfvbl","eagemhdygyv","jwvwwnrhuai","eagemhdygyv","qhootohpnfvbl","mpgqsvxrijpombyv","qhootohpnfvbl","jwvwwnrhuai","exdafbnobg","eagemhdygyv","eagemhdygyv","kvugevicpsdf","kvugevicpsdf","jwvwwnrhuai","urcadmrwlqe","lxyqetmgdbmh","qhootohpnfvbl","exdafbnobg","exdafbnobg","eagemhdygyv","qhootohpnfvbl","exdafbnobg","exdafbnobg","lekgdisnsbfdzpqlkg","jwvwwnrhuai","eagemhdygyv","urcadmrwlqe","kvugevicpsdf","lekgdisnsbfdzpqlkg","jwvwwnrhuai","eagemhdygyv","lekgdisnsbfdzpqlkg","exdafbnobg","kvugevicpsdf","jwvwwnrhuai","exdafbnobg","lxyqetmgdbmh","exdafbnobg","lxyqetmgdbmh","jwvwwnrhuai","mpgqsvxrijpombyv","eagemhdygyv","urcadmrwlqe","kvugevicpsdf","qhootohpnfvbl","jwvwwnrhuai","eagemhdygyv","urcadmrwlqe","urcadmrwlqe","exdafbnobg","qhootohpnfvbl","exdafbnobg","eagemhdygyv","exdafbnobg","jwvwwnrhuai","eagemhdygyv","jwvwwnrhuai","mpgqsvxrijpombyv","urcadmrwlqe","urcadmrwlqe","eagemhdygyv","eagemhdygyv","jwvwwnrhuai","suffrbmqgnln","eagemhdygyv"};
//		for (int i : matchingStrings(strings, queries)){
//			System.out.println(i);
//		}


//		System.out.println("Level order");
//		levelOrderTraversalIterative(root);
//		System.out.println();

//		List<String> l = new ArrayList<>();
//		l.add("1 97");
//		l.add("2");
//		l.add("1 20");
//		l.add("2");
//		l.add("1 26");
//		l.add("1 20");
//		l.add("2");
//		l.add("3");
//		l.add("1 91");
//		l.add("3");
//
//		System.out.println(getMax(l));
		List<Integer> h1, h2, h3 = new ArrayList<>();
//		h1.addAll([3, 2, 1, 1, 1]);
//		h2.addAll([4, 3, 2]);
//		h3.addAll([1, 1, 4, 1]);
//		System.out.println(equalStacks(h1, h2, h3));
	}

	private static void preOrderTraversalRecursive(Node root) {
		if (root == null){
			return;
		}else{
			System.out.print(root.data + " ");
			preOrderTraversalRecursive(root.leftNode);
			preOrderTraversalRecursive(root.rightNode);
		}
	}

	private static void postOrderTraversalRecursive(Node root) {
		if (root == null){
			return;
		}else{
			postOrderTraversalRecursive(root.leftNode);
			postOrderTraversalRecursive(root.rightNode);
			System.out.print(root.data + " ");
		}
	}

	private static void inOrderTraversalRecursive(Node root) {
		if (root == null){
			return;
		}else{
			inOrderTraversalRecursive(root.leftNode);
			System.out.print(root.data + " ");
			inOrderTraversalRecursive(root.rightNode);
		}
	}

	private static void preOrderTraversalIterative(Node root) {
		Stack<Node> stack = new Stack<Node>();
		stack.add(root);
		while (!stack.isEmpty()){
			Node n1 = stack.pop();
			System.out.print(n1.data + " ");
			if (n1.rightNode != null){
				stack.add(n1.rightNode);
			}
			if (n1.leftNode != null){
				stack.add(n1.leftNode);
			}
		}
	}

//	private static void postOrderTraversalIterative(Node root) {
//		Stack<Node> stack = new Stack<Node>();
//		stack.add(root);
//		Node n1 = root;
//		while (!stack.isEmpty()){
//			if (n1.rightNode != null) {
//				stack.add(n1.rightNode);
//			}
//			if (n1.leftNode != null){
//				stack.add(n1.leftNode);
//			}
//			n1 = stack.pop();
//			System.out.print(n1.data + " ");
//			List<Integer> i = new ArrayList<>();
//			for(int j = arr.size() - 1  ; j >= 0 ; j--){
//				int tmp = i.get(j);
//				i[j+1] = tmp;
//			}
//		}
//	}
	private static void levelOrderTraversalIterative(Node root) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()){
			Node n1 = ((LinkedList<Node>) queue).pop();
			System.out.print(n1.data + " ");
			if (n1.leftNode != null){
				queue.add(n1.leftNode);
			}
			if (n1.rightNode != null){
				queue.add(n1.rightNode);
			}
		}
	}
	public static List<Integer> rotateLeft(int d, List<Integer> arr) {
		if(d == 0){
			return arr;
		}
		for(int i = 0; i < d ; i++){
			int tmp = arr.get(0);
			for(int j =0 ; j< arr.size(); j++){
				if(j+1 <= arr.size()-1){
					arr.set(j, arr.get(j+1));
				}
			}
			arr.set(arr.size()-1, tmp);
		}
		return arr;
	}
//	public static void shift_left(List<Integer> arr, int shift) {
//		if(shift == 0){
//			return;
//		}
//		for(int i = 0; i < shift ; i++){
//			int tmp = arr.get(0);
//			for(int j =0 ; j< arr.size(); j++){
//				if(j+1 <= arr.size()-1){
//					arr.set(j, arr.get(j+1));
//				}
//			}
//			arr.set(arr.size()-1, tmp);
//			int[] lst = new int[5];
//			lst.
//
//
//
//			}
//		}
//	}

	static int[] matchingStrings(String[] strings, String[] queries) {

		Map<Integer, String> map = new LinkedHashMap<>();
		Map<String, Integer> map1 = new LinkedHashMap<>();
		int[] lst = new int[queries.length];
		for(int j=0; j<queries.length; j++){
			map.put(j, queries[j]);
			map1.put(queries[j], 0);
		}
		for(String str : strings){
			if(map1.get(str) != null){
				map1.put(str, map1.get(str)+1);
			}
		}
		int i = 0;
		for(Integer m : map.keySet()){
			String s = map.get(m);
			lst[i] = map1.get(s);
			i++;
		}
		return lst;
	}

	public static List<Integer> getMax(List<String> operations) {
		// Write your code here
		Stack<Integer> lst = new Stack<>();
		List<Integer> l = new ArrayList<>();
		int max = 0;
		for(String s : operations){
			String[] type = s.split(" ");
			switch(type[0]){
				case "1":
					lst.add(Integer.parseInt(type[1]));
					if(lst.peek() > max){
						max = Integer.parseInt(type[1]);
					}
					break;
				case "2":
					int item = lst.pop();
					if(item == max){
						max = 0;
						for(int i : lst){
							if(i > max){
								max = i;
							}
						}
					}
					break;
				case "3":
					l.add(max);
					break;
			}
		}
		return l;
	}

//	public static void equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
//		Map<String, String> map = getMaxHeight(h1, h2, h3);
//		Boolean b = true;
//		while (b){
//			if(h1 == h2 && h2 == h3){
//				return h1.size();
//			}
//			int max = Integer.parseInt(map.get("value"));
//			String key = map.get("key");
//			if(key == "h1"){
//
//			}
//
//		}
//	}
//	public static Map<String, String> getMaxHeight(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
//		int h1_size = h1.size();
//		int h2_size = h2.size();
//		int h3_size = h3.size();
//
//		Map<String, String> map = new HashMap<>();
//
//		int max = h3_size;
//		map.put("key", "h3");
//
//		if((h1_size>h2_size) && (h1_size>h3_size)){
//			max = h1_size;
//			map.put("key", "h1");
//		}else if ((h2_size>h1_size) && (h2_size>h1_size)){
//			max = h2_size;
//			map.put("key", "h2");
//		}
//		map.put("value", max+"");
//		return map;
//	}

}