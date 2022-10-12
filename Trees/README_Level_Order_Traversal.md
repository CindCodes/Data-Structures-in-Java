/* A Java program that returns all the nodes of the Binary Tree in Level Order Traversal from left to right. Output should be 4 2 6 1 3 5 7. This task is accomplished by utilizing the Queue and Binary Tree data structure to meet the O(n) time and space complexity.

The class used to represent Tree node is given: 
class Node{ int data; Node left, right;
  public Node(int item){ data=item; left=null; right=null; } }

Binary Tree Nodes are given: 
tree.root=new Node(4); 
tree.root.left=new Node(2); 
tree.root.right=new Node(6); 
tree.root.left.left=new Node(1); 
tree.root.left.right=new Node(3); 
tree.root.right.left=new Node(5); 
tree.root.right.right=new Node(7);
*/
