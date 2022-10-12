public class linkedList{
    static Node head;
    static class Node{
      int data;
      Node next;
      Node(int x){
        data=x;
        next=null;
      }
    }
  Node reverse(Node node){
    Node prev=null;
    Node curr=node;
    Node next=null;
    while(curr!=null){
      next=curr.next;
      curr.next=prev;
      prev=curr;
      curr=next;
    }
    node=prev;
    return node;
  }
  void printList(Node node){
    while(node!=null){
      System.out.print(node.data+" ");
      node=node.next;
    }
  }
  public static void main(String[] args){
    linkedList obj=new linkedList();
    obj.head=new Node(1);
    obj.head.next=new Node(2);
    obj.head.next.next=new Node(3);
  
    System.out.println("Original Linked List:");
    obj.printList(head);
    head=obj.reverse(head);
    System.out.println("");
    System.out.println("Reversed Linked List:");
    obj.printList(head);
    }
  }
