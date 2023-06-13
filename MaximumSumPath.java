//https://www.codingninjas.com/codestudio/problems/maximum-path-sum-between-two-leaves_8230713?challengeSlug=striver-sde-challenge&leftPanelTab=1

class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		TreeNode(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}

	}

public class MaximumSumPath {

    static long res;
    static long count;

    //Will Count for the leaf TreeNode

    public static void leaves(TreeNode root){
        if(root==null)
            return;
        leaves(root.left);
        leaves(root.right);
        if(root.left==null && root.right==null)
       		count++;
    }

    public static long findMaxSumPath(TreeNode root) {
		// Write your code here.
        if(root==null)
            return -1;
       res=-1;
       count=0;
       leaves(root);
        if(count==0 || count==1)                     //if leafTreeNode count is 1, will have to return =1....as per the question.
            return -1;
       findMaxSumPathHelper(root);
        return res;
	}

    public static long findMaxSumPathHelper(TreeNode root) {
		// Write your code here.
        if(root==null)
            return 0;
        long left=findMaxSumPathHelper(root.left);
        long right=findMaxSumPathHelper(root.right);
        
        long temp=Math.max(left,right)+root.data;
		temp=Math.max(left+right+root.data,temp);  
            
        res= Math.max(temp,res);
        return Math.max(left,right)+root.data;
	}


    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.right.left=new TreeNode(5);
        root.right.right=new TreeNode(8);

        long ans=findMaxSumPath(root);
        System.out.println("Max Path Sum Of BT is "+ans);
    }
}
