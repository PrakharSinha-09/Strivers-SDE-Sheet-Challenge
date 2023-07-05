import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data=data;
    }
}

public class ZigZagTraversal {

    static ArrayList<Integer> zigzag(Node root){
        ArrayList<Integer> ans=new ArrayList<>();
        
        Queue<Node> qu=new LinkedList<>();
        qu.add(root);
        boolean flag=true;
        
        Node curr=null;
        while(curr!=null){
            int size=qu.size();
            ArrayList<Integer> inner=new ArrayList<>();
            for(int i=0;i<size;i++){
                Node temp=qu.poll();

                if(temp.left!=null){
                    qu.add(temp.left);
                }
                if(temp.right!=null){
                    qu.add(temp.left);
                }

                if(flag){
                    inner.add(temp.data);
                }
                else{
                    inner.add(0,temp.data);
                }
            }
            flag=!flag;
            ans.addAll(inner);
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
