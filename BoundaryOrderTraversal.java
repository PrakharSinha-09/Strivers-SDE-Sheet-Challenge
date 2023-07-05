import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data=data;
    }
}

public class BoundaryOrderTraversal {
    static ArrayList<Integer> boundaryTraversal(Node root){
        ArrayList<Integer> ans=new ArrayList<>();
        if(root!=null){
            ans.add(root.data);
        }
        leftBoundary(root, ans);
        leafTraverse(root, ans);
        rightBoundary(root, ans);

        return ans;
    }

    static boolean isLeaf(Node root){
        if(root.left==null && root.right==null){
            return true;
        }
        return false;
    }

    static void leftBoundary(Node root,ArrayList<Integer> ans){
        Node curr=root.left;

        while(curr!=null){
            if(!isLeaf(curr)){
                ans.add(curr.data);
            }

            if(curr.left!=null){
                curr=curr.left;
            }

            else if(curr.right!=null){
                curr=curr.right;
            }
        }
    }
    static void leafTraverse(Node root,ArrayList<Integer> ans){
        Node curr=root;
        if(isLeaf(curr)){
            ans.add(curr.data);
            return;
        }

        if(curr.left!=null){
            leafTraverse(curr.left, ans);
        }
        if(curr.right!=null){
            leafTraverse(curr.right, ans);
        }
    }
    static void rightBoundary(Node root,ArrayList<Integer> ans){
        Node curr=root.right;
        ArrayList<Integer> ans1=new ArrayList<>();

        while(curr!=null){
            if(!isLeaf(curr)){
                ans1.add(curr.data);
            }

            if(curr.right!=null){
                curr=curr.right;
            }
            else if(curr.left!=null){
                curr=curr.left;
            }

        }

        Collections.reverse(ans1);
        ans.addAll(ans1);
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.right.left=new Node(5);
        root.right.right=new Node(8);
        System.out.println("nk");

        ArrayList<Integer> ans=boundaryTraversal(root);
        System.out.println(ans);
    }
}
