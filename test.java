import java.util.*;
class node{
    int data;
    node l_child,r_child;
    node(int data)
    {
        this.data=data;
        this.l_child=null;
        this.r_child=null;
    }
}

public class test{
    static node insert(node root,int data)
    {
        if(root==null)return new node(data);

        if(data<=root.data)
         root.l_child=insert(root.l_child,data);
         else
         root.r_child=insert(root.r_child,data);

         return root;
    }
    static void display(node root)
    {
        if(root==null)return;
        display(root.l_child);
        System.out.print(root.data+" ");
        display(root.r_child);
    }
    public static void main(String args[])
    {
        Scanner kuch_bhi=new Scanner(System.in);
        node root=null;
        System.out.println("Enter number of elements:");
        int n=kuch_bhi.nextInt();
        for(int i=0;i<n;i++)
        {
            int s=kuch_bhi.nextInt();
            root=insert(root,s);
        }
        display(root);
    }
}
