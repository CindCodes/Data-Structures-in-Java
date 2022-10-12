public class Main {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    public void push(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public void deleteNthNode(Node head,int n){
        Node fast=head;
        Node slow=head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        if(fast==null){
            return;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return;
    }
    public static void main(String[] args){
        Main nums=new Main();
        nums.push(18);
        nums.push(5);
        nums.push(7);
        nums.push(1);
        nums.push(3);
        nums.push(2);

        nums.deleteNthNode(nums.head,3);
        System.out.println("Linked List after 3rd element from end deleted: ");
        nums.display();
    }
}
