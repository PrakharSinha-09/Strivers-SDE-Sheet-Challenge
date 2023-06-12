class Node{
    int data;
    Node left;
    Node right;

    public Node(int key)
    {
        this.data=key;
    }
}

public class CheckBalanceBinaryTree {

    public static boolean isBalanced(Node root){
        if(root==null)
            return true;
        
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);

        if(Math.abs(leftHeight-rightHeight)<=1 && isBalanced(root.left) && isBalanced(root.right)){
            return true;
        }

        return false;
    }

    public static int height(Node root){
        if(root==null){
            return 0;
        }

        int leftHeight=height(root.left);
        int rightHeight=height(root.right);

        return 1+Math.max(leftHeight,rightHeight);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.right.left=new Node(5);
        root.right.right=new Node(8);

        boolean ans=isBalanced(root);
        System.out.println(ans);
    }
}
