package BstApplication;

/**
 * @GauravKumar
 *
 * 1. Custom binary search tree implementation
 * 2. Insert node in BST using two different impl i.e Iterative and Recursive
 * 3. InOrder Traversal
 */
public class CustomBST {
    public BstNode head = null;
    class BstNode{
        int data;
        BstNode left;
        BstNode right;
    }

    public boolean insertNode(int data){
        BstNode node = head;
        boolean is_added = false;
        if(head == null){
            head = new BstNode();
            head.data = data;
            is_added = true;
        } else {
            while (node != null){
                if (node.data > data){
                    if (node.left == null){
                        BstNode newNode = new BstNode();
                        newNode.data = data;
                        node.left = newNode;
                        is_added = true;
                        break;
                    } else {
                        node = node.left;
                    }
                }else{
                    if (node.right == null){
                        BstNode newNode = new BstNode();
                        newNode.data = data;
                        node.right = newNode;
                        is_added = true;
                        break;
                    } else {
                        node = node.right;
                    }
                }
            }
        }
        return is_added;
    }
    public boolean insertNodeRecursive(int data){
        BstNode node = this.head;
        if (node == null){
            this.head = insertNodeRecursive(node, data);
            return true;
        }
        if (insertNodeRecursive(node, data) != null)
            return true;
        return false;
    }
    public BstNode insertNodeRecursive(BstNode node, int data){
        if (node == null){
            return createObject(data);
        }
        if (node.data >= data){
            node.left = insertNodeRecursive(node.left, data);
        } else{
            node.right = insertNodeRecursive(node.right, data);
        }
        return node;
    }

    private BstNode createObject(int data){
        BstNode obj = new BstNode();
        obj.data = data;
        return obj;
    }

    public void printInOrderTraversal(){
        inOrderTraversalRecursive(this.head);
        System.out.println();
    }
    private void inOrderTraversalRecursive(BstNode n){
        if (n == null){
            return;
        }
        inOrderTraversalRecursive(n.left);
        System.out.print(n.data + " ");
        inOrderTraversalRecursive(n.right);
    }

}


class Driver{
    public static void main(String[] args) {

        CustomBST bst = new CustomBST();
        bst.insertNode(10);
        bst.insertNode(5);
        bst.insertNode(15);
        bst.insertNode(2);
        bst.insertNode(3);
        bst.insertNode(78);
        bst.insertNode(98);
        bst.insertNode(12);
        bst.insertNode(100);
        bst.insertNode(79);
        bst.insertNode(79);
        bst.printInOrderTraversal();

        CustomBST bst1 = new CustomBST();
        bst1.insertNodeRecursive(10);
        bst1.insertNodeRecursive(5);
        bst1.insertNodeRecursive(15);
        bst1.insertNodeRecursive(2);
        bst1.insertNodeRecursive(3);
        bst1.insertNodeRecursive(78);
        bst1.insertNodeRecursive(98);
        bst1.insertNodeRecursive(12);
        bst1.insertNodeRecursive(100);
        bst1.insertNodeRecursive(79);
        bst1.insertNodeRecursive(79);

        bst1.printInOrderTraversal();
    }

}