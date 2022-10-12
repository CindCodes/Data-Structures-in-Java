class Node{
    int data;
    Node left,right;

    public Node(int x){
        data=x;
        left=null;
        right=null;
    }
}
class Main {
    static int count = 0;
    public static Node insert(Node root, int x)
    {
        if (root == null)
            return new Node (x);
        if (x < root.data)
            root.left = insert(root.left, x);
        else if (x > root.data)
            root.right = insert(root.right, x);
        return root;
    }
    public static Node NthSmallest(Node root, int k){
        if (root == null)
            return null;
        Node left = NthSmallest(root.left, k);
        if (left != null)
            return left;
 
        count++;
        if (count == k)
            return root;
        return NthSmallest(root.right, k);
    }
    public static void printNthSmallest(Node root, int n)
    {
        Node res = NthSmallest(root, n);
        if (res == null)
            System.out.println("There are less than n nodes in the BST");
        else
            System.out.println("N-th Smallest Element is " + res.data);
    }
    public static void main(String[] args){
        Node root=null;
        int keys[]={4,2,6,1,3,5,7};
        for (int x:keys)
            root=insert(root,x);
        int n=3;
        printNthSmallest(root,n);
    }
}
