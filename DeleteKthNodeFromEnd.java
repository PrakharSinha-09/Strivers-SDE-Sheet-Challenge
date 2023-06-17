//Deleting kth Node from the end

class Node{
    int data;
    Node next;

    Node(int data)
    {
        this.data=data;
    }
}

public class DeleteKthNodeFromEnd {
    public static int lengthLL(Node head){
        if(head==null){
            return 0;
        }

        if(head.next==null){
            return 1;
        }

        Node temp=head;
        int count=0;

        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    public static Node removeKthNode(Node head, int k)
    {
        // Write your code here.
        int len=lengthLL(head);
        if(len==0){
            return null;
        }

        int del=len-k+1;

        if(del==1){
            head=head.next;
            return head;
        }

        Node prev=null;
        Node curr=head;
        int i=1;
        while(i!=del){
            prev=curr;
            curr=curr.next;
            i++;
        }
        prev.next=curr.next;

        return head;
    }

    static void display(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("NULL");
    }

    public static void main(String[] args) {
        Node head=new Node(12);
        Node head2=new Node(45);
        Node head3=new Node(56);
        Node head4=new Node(58);

        head.next=head2;
        head2.next=head3;
        head3.next=head4;
        head4.next=null;

        Node ptr=removeKthNode(head, 2);
        display(ptr);
    }
}
