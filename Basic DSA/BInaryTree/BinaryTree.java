import java.util.*;
import java.util.LinkedList;

////// 1. Binary Tree Operations from given Preorder Sequence

public class BinaryTree{

    // CREATING A NODE CLASS.
    static class Node{
        int val;
        Node left, right;

        Node (int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    // A Function to build tree from given preorder sequence
    static class BinaryTreeBuild{
        static int idx = -1;
        public static Node buildTree(int [] nodes){
            idx++;
            if (nodes[idx] == -1){
                return null;
            }
            // set the curr val as a new node and then traverse to set its left and right vals.
            Node newRootNode = new Node(nodes[idx]);
            newRootNode.left = buildTree(nodes);
            newRootNode.right = buildTree(nodes);
            // return the root
            return newRootNode;
        }
    }

    // 2.	Tree Traversals
    // Preorder:
    public static void preOrder(Node root){
        // base case if ever null-leaf node found to return recurssion.
        if (root == null) return;

        // Root -> Left -> Right
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // Inorder:
    public static void inOrder(Node root){
        // base case if ever null-leaf node found to return recurssion.
        if (root == null) return;

        // Left -> Root -> Right
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    // Postorder:
    public static void postOrder(Node root){
        // base case if ever null-leaf node found to return recurssion.
        if (root == null) return;

        // Left -> Right -> Root
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }

    // LevelOrder
    public static void levelOrder(Node root){
        if (root == null){return;}

        // a queue of node because we are printing the nodes of the tree.
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        que.add(null);

        while (!que.isEmpty()){
            Node current = que.remove();
            if (current == null){
                System.out.println();
                if (que.isEmpty()){
                    break;
                }
                else{
                    que.add(null);
                }
            }
            else{
                System.out.print(current.val + " ");

                if(current.left != null){
                    que.add(current.left);
                }

                if(current.right != null){
                    que.add(current.right);
                }
            }
        }
    }

    // Height of the Tree
    public static int treeHeight(Node root){
        if(root == null) return 0;

        int leftHeight = treeHeight(root.left);
        int rightHeight = treeHeight(root.right);

        return Math.max(leftHeight, rightHeight)+1;
    }

    // Count the nodes in the tree.
    public static int countNodes(Node root){
        if(root == null) return 0;
        
        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);

        return leftCount + rightCount + 1;
    }

    // Sum of the Nodes
    public static int sumOfNodes(Node root){
        if(root == null) return 0;

        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum + rightSum + root.val;
    }

    // Diameter of the tree O(n) approach
    static class TreeInfo {
        int height;
        int diameter;

        TreeInfo(int height, int diameter){
            this.height = height;
            this.diameter = diameter;
        }
    }
    
    public static TreeInfo diameterOfBinaryTree(Node root) {
        if (root == null) return new TreeInfo(0,0);

        TreeInfo leftTree = diameterOfBinaryTree(root.left);
        TreeInfo rightTree = diameterOfBinaryTree(root.right);

        int finalHeight = Math.max(leftTree.height, rightTree.height) +1;
        
        int DiameterLeft = leftTree.diameter;
        int DiameterRight = rightTree.diameter;
        int DiameterAll = leftTree.height + rightTree.height +1;

        int finalDiameter = Math.max(Math.max(DiameterRight, DiameterLeft), DiameterAll);

        TreeInfo finalAns = new TreeInfo(finalHeight, finalDiameter);
        return finalAns;

    }

    public static void main(String [] args){
        int [] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTreeBuild tree = new BinaryTreeBuild();
        Node root = tree.buildTree(nodes);
        System.out.println("Root Node: " + root.val);

        System.out.println("Preorder Traversal: ");
        preOrder(root);
        System.out.println();

        System.out.println("Inorder Traversal: ");
        inOrder(root);
        System.out.println();

        System.out.println("Postorder Traversal: ");
        postOrder(root);
        System.out.println();

        System.out.println("Levelorder Traversal: ");
        levelOrder(root);
        System.out.println();

        int height = treeHeight(root);
        System.out.println("Height of the Tree: " + height);
        System.out.println();

        int count = countNodes(root);
        System.out.println("Count of the Nodes: " + count);
        System.out.println();

        int summ = sumOfNodes(root);
        System.out.println("Sum of the Nodes: " + summ);
        System.out.println();

        TreeInfo tif = diameterOfBinaryTree(root);
        System.out.println("Diameter of the Binary Tree: " + tif.diameter);
        System.out.println();
    }
}