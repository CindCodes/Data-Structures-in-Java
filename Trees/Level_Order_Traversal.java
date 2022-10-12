public class Trees{
  public static void main(String args[]){
    Trees binaryTree=new Trees();
    binaryTree.root=new Node(4);
    binaryTree.root.left=new Node(2);
    binaryTree.root.right=new Node(6);
    binaryTree.root.left.left=new Node(1);
    binaryTree.root.left.right=new Node(3);
    binaryTree.root.right.left=new Node(5);
    binaryTree.root.right.right=new Node(7);

    binaryTree.printLevelOrder();
    System.out.println("");
  }
  Node root;
  int heightOfNode(Node root){
    if(root==null){
      return 0;
    }
    else{
      int leftTreeHeight=heightOfNode(root.left);
      int rightTreeHeight=heightOfNode(root.right);
    
      if(leftTreeHeight>rightTreeHeight){
        return (leftTreeHeight+1);
      }
      else{
        return (rightTreeHeight+1);
      }
    }
  }
  void printCurrentLevelNode(Node root, int levelOfNode){
    if(root==null){
      return;
    }
    if(levelOfNode==1){
      System.out.print(root.data+" ");
    }
    else if(levelOfNode>1){
      printCurrentLevelNode(root.left,levelOfNode-1);
      printCurrentLevelNode(root.right,levelOfNode-1);
    }
  }
   public void printLevelOrder(){
    int h=heightOfNode(root);
    int i;
    for(i=1;i<=h;i++){
      printCurrentLevelNode(root,i);
      }
    }
  }
  class Node{
  int data;
  Node left, right;

  public Node(int item){
    data=item;
    left=null;
    right=null;
    }
  }
