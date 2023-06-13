class Node{
    int data;
    Node next;

    Node(int data)
    {
        this.data=data;
    }
}

public class MiddleOfLinkedList {

    public static Node findMiddle(Node head)
    {
        // Write your code here.
        //This is the famous fast and slow pointer approach!
        Node fast=head;
        Node slow=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
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

        Node ans=findMiddle(head);

        display(ans);

    }
}
