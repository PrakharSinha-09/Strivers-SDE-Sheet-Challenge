class Node{
    int data;
    Node left;
    Node right;

    public Node(int key)
    {
        this.data=key;
    }
}

public class DiameterOfBinartyTree {

    public static int getDiameter(Node root){
        int[] diameter=new int[1];
        diameter[0]=Integer.MIN_VALUE;
        helper(root,diameter);
        return diameter[0];
    }

    public static int helper(Node root,int[] diameter){
        if(root==null){
            return 0;
        }

        int leftHeight=helper(root.left, diameter);
        int rightHeight=helper(root.right, diameter);
        diameter[0]=Math.max(diameter[0],leftHeight+rightHeight);
        return 1+Math.max(leftHeight, rightHeight);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.right.left=new Node(5);
        root.right.right=new Node(8);

        int ans=getDiameter(root);
        System.out.println("Diameter Of BT is "+ans);
    }
}
