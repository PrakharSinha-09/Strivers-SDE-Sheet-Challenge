
class Node{
    int data;
    Node left;
    Node right;

    public Node(int key)
    {
        this.data=key;
    }
}

public class MaximumDepthOfBinaryTree {

    public static int maxDepth(Node root){
        if(root==null){
            return 0;
        }

        int leftHeight=maxDepth(root.left);
        int rightHeight=maxDepth(root.left);

        return 1+Math.max(leftHeight,rightHeight);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.right.left=new Node(5);
        root.right.right=new Node(8);

        int ans=maxDepth(root);
        System.out.println("The Maximum Depth is "+ans);
    }
}
