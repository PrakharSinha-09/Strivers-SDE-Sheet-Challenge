// https://www.codingninjas.com/codestudio/problems/delete-node-in-a-linked-list_8230813?challengeSlug=striver-sde-challenge&leftPanelTab=0

class Node{
    int data;
    Node next;

    Node(int data)
    {
        this.data=data;
    }
}

public class DeleteNodeInLinkedList {

    public static void deleteNode(Node node) {
		// Write your code here.
        node.data = node.next.data;
        node.next = node.next.next;
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

        deleteNode(head2);
        display(head4);
    }
}
