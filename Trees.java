package JAVA;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Stack;

class Tree{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    static Node root;
    public void implementation(){
        root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        
        
        Node c = new Node(4);
        Node d  =new Node(5);
        a.left = c;
        a.right = d;

        Node e = new Node(6);
        Node f = new Node(7);
        b.left = e;
        b.right = f;

        Node g = new Node(8);
        Node h = new Node(9);
        c.left = g;
        d.right = h;

        Node i = new Node(10);
        Node j = new Node(11);
        e.left = i;
        f.right = j;

        
    }
}
public class Trees {
    static void preTravere(Tree.Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preTravere(root.left);
        preTravere(root.right);
    }
    static void inTraverse(Tree.Node root){
        if(root==null) return;
        inTraverse(root.left);
        System.out.print(root.data+" ");
        inTraverse(root.right);
    }
    static void postTraverse(Tree.Node root){
        if(root==null) return;
        postTraverse(root.left);
        postTraverse(root.right);
        System.out.print(root.data+" ");
    }

    static void dfsAlgorithm(Tree.Node root){
        Stack<Tree.Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Tree.Node temp = stack.peek();
            if(temp.left!=null) {
                stack.push(temp.left);
                temp.left = null;
            }

            else{
                Tree.Node t = stack.pop();
                System.out.print(t.data+" ");
                if(temp.right!=null) stack.push(t.right);
            }
        }
    }
    static void bfsAlgorithm(Tree.Node root){
        Queue<Tree.Node> queue = new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Tree.Node temp = queue.peek();
            if(temp.left!=null) queue.add(temp.left);
            if(temp.right!=null) queue.add(temp.right);
            System.out.print(temp.data+" ");    
            queue.remove();
        }
    }
    static int max(int a , int b , int c){
        if(a>b && a>c) return a;
        else if(b>c) return b;
        else return c;
    }
    static int findmax(Tree.Node root){
        if(root==null) return Integer.MIN_VALUE;
        return max(root.data,findmax(root.left), findmax(root.right));
    }
    static int findHeight(Tree.Node root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0;
        return 1+Math.max(findHeight(root.left), findHeight(root.right));
    }
    static int sum(Tree.Node root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return root.data;
        return sum(root.left)+sum(root.right)+root.data;
    }
    static int diameter(Tree.Node root){
        if(root==null) return 0;
        int k = findHeight(root.left);
        int p = findHeight((root.right));
        int d = k+p;
        if(root.left!=null) d++;
        if(root.right!=null) d++;
        int k1 = diameter(root.left);
        int p1 = diameter(root.right);
        return max(d, k1, p1);  

    }
    static int size(Tree.Node root){
        if(root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }

    static boolean balance(Tree.Node root){
        if(root==null) return true;
        if(findHeight(root.left)!=findHeight(root.right)) return false;
        return balance(root.left) && balance(root.right); 
    }
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.implementation();
        System.out.println("Print our element in pre order : ");
        preTravere(Tree.root);
        System.out.println();
        System.out.println("Print our element in In Order : ");
        inTraverse(Tree.root);
        System.out.println();
        System.out.println("Print our element in Post Order : ");
        postTraverse(Tree.root);
        System.out.println();
        System.out.println("Print our element in In Order Using DFS Algorithm : ");
        dfsAlgorithm(Tree.root);
        System.out.println();
        tree.implementation();
        System.out.println("Print Our Element in Level Order Using BFS Algorithm : ");
        bfsAlgorithm(Tree.root);
        System.out.println();
        System.out.println("MAximim value in tree = "+findmax(Tree.root));
        System.out.println("Height of the tree = "+findHeight(Tree.root));

        System.out.println("Sum of the tree = "+sum(Tree.root));

        System.out.println("Diameter of the tree = "+diameter(Tree.root));

        System.out.println("Size of the Tree = "+size(Tree.root));
        System.out.println(balance(Tree.root));
    }
}
