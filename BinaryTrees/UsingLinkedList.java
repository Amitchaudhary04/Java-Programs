package BinaryTrees;
import java.util.*;

public class UsingLinkedList {
    public static void main(String[] args) {
        /*
                    N1
                /       \
              N2          N3
             /          /    \
           N4         N6         N7
         /    \
       N8       N9
         */
        BinaryTreeLL binaryTree = new BinaryTreeLL();
        BinaryNode n1 = new BinaryNode();
        n1.value = "N1";
        BinaryNode n2 = new BinaryNode();
        n2.value = "N2";
        BinaryNode n3 = new BinaryNode();
        n3.value = "N3";
        BinaryNode n4 = new BinaryNode();
        n4.value = "N4";
        BinaryNode n5 = new BinaryNode();
        n5.value = "N5";
        BinaryNode n6 = new BinaryNode();
        n6.value = "N6";
        BinaryNode n7 = new BinaryNode();
        n7.value = "N7";
        BinaryNode n8 = new BinaryNode();
        n8.value = "N8";
        BinaryNode n9 = new BinaryNode();
        n9.value = "N9";

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;
        n4.left = n8;
        n4.right = n9;

        binaryTree.root = n1;
        binaryTree.preOrder(binaryTree.root);
        System.out.println();
        binaryTree.inOrder(binaryTree.root);
        System.out.println();
        binaryTree.postOrder(binaryTree.root);
        System.out.println();
        binaryTree.levelOrder();
        System.out.println();
        binaryTree.search("N11");
    }

    public static class BinaryNode {
        public String value;
        public BinaryNode left;
        public BinaryNode right;
        public int height;
    }

    public static class BinaryTreeLL {
        BinaryNode root;

        public BinaryTreeLL() {
            this.root = null;
        }

        public void preOrder(BinaryNode node) {
            if (node == null) {
                return;
            }
            System.out.print(node.value + " ");
            preOrder(node.left);
            preOrder(node.right);
        }

        public void inOrder(BinaryNode node) {
            if (node == null) {
                return;
            }
            inOrder(node.left);
            System.out.print(node.value + " ");
            inOrder(node.right);
        }

        public void postOrder(BinaryNode node) {
            if (node == null) {
                return;
            }
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.value + " ");
        }

        public void levelOrder() {
            if (root == null) return;

            Queue<BinaryNode> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {
                BinaryNode presentNode = queue.poll();
                System.out.print(presentNode.value + " ");

                if (presentNode.left != null) {
                    queue.add(presentNode.left);
                }
                if (presentNode.right != null) {
                    queue.add(presentNode.right);
                }
            }
        }
        public void search(String value){
            Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
            queue.add(root);
            while(!queue.isEmpty()){
                BinaryNode presentNode = queue.remove();
                if(presentNode.value==value){
                    System.out.println("The value : "+value+" is found in Tree");
                    return;
                }
                else{
                    if(presentNode.left!=null){
                        queue.add(presentNode.left);

                    }
                    if(presentNode.right!=null){
                        queue.add(presentNode.right);
                    }
                }
            }
            System.out.println("The value : "+value+" is not found in Tree");
        }
    }
}
