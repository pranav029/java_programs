import java.util.*;
class node{
    int data;
    node next;
    node(int data)
    {
        this.data=data;
        this.next=null;
    }
    node insert(node head,int data)
    {
        if(head==null)return new node(data);
        node temp=head;
        while(temp.next!=null)temp=temp.next;
        temp.next=new node(data);
        return head;
    }
    private node rev_helper(node head,node left)
    {
        if(head==null)return left;
        node temp=head.next;
        head.next=left;
        return rev_helper(temp,head);
    }
    node reverse(node head)
    {
        return rev_helper(head,null);
    }
    void print(node head)
    {
       node temp=head;
       while(temp!=null){
           System.out.print(temp.data+" ");
           temp=temp.next;
       }
       System.out.println();
    }
}
public class linked_rev {
    public static void main(String args[])
    {
        node head=null,T;
        T=new node(0);
        head=T.insert(head,1);
        head=T.insert(head,2);
        head=T.insert(head,3);
        head=T.insert(head,4);
        head=T.insert(head,5);
        head=T.insert(head,6);

        T.print(head);
        head=T.reverse(head);
        T.print(head);
    }
}
