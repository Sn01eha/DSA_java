//trees

import java.util.*;
public class Main {
    public static void main(String[] args) {
      MyTree tree = new MyTree();
      tree.root = new Node(1);
      tree.root.left = new Node(2);
      tree.root.right = new Node(3);
      tree.root.left.left = new Node(4);
      tree.root.left.right = new Node(5);
      System.out.print("Inorder Traversal of binary tree: ");
      tree.inorderTraversal(tree.root);
      System.out.println("\n-------------------------------------------------------------");
      System.out.print("Preorder Traversal of binary tree: ");
      tree.preorderTraversal(tree.root);
      System.out.println("\n-------------------------------------------------------------");
      System.out.print("Postorder Traversal of binary tree: ");
      tree.postorderTraversal(tree.root);
  }
}
class Node{
  int data;
  Node left;
  Node right;
  public Node(int data){
    this.data=data;
    left=right=null;
  }
}

class MyTree{
  Node root;
  // inorder traversal--- left->root->right
  public void inorderTraversal(Node node){
    if(node!=null){
      inorderTraversal(node.left);
      System.out.print(node.data+" ");
      inorderTraversal(node.right);
    }
  }
  // preorder traversal--- root->left->right
  public void preorderTraversal(Node node){
    if(node!=null){
      System.out.print(node.data+" ");
      preorderTraversal(node.left);
      preorderTraversal(node.right);
    }
  }
  // postorder traversal--- right->left->root
  public void postorderTraversal(Node node){
    if(node!=null){
      postorderTraversal(node.right);
      postorderTraversal(node.left);
      System.out.print(node.data+" ");
    }
  }
  
}