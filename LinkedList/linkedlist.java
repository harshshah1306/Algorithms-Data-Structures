package linkedlist;
import java.util.*;

class Node
{
    Node next=null;
    int data;
    public Node(int d)
    {
        data=d;
    }
}
public class linkedlist {
    static Node newhead=new Node(0);
    static Node temp=newhead;
    public static void main(String[] args) {
        Node head=new Node(2);
        Node l1=new Node(5);
        Node l2=new Node(6);
        Node l3=new Node(6);
        head.next=l1;
        l1.next=l2;
        l2.next=l3;
        
        Node head2=new Node(2);
        Node l1s=new Node(5);
        Node l2s=new Node(5);
        Node l3s=new Node(5);
        head2.next=l1s;
        l1s.next=l2s;
        l2s.next=l3s;
        boolean ans=checkpalindrome(head2);
        System.out.println(ans);
    }
    static boolean checkpalindrome(Node head)
    {
        Stack<Integer> s=new Stack<Integer>();
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null)
        {
            s.push(slow.data);
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast!=null)
        {
            slow=slow.next;
        }
        while(slow!=null)
        {
            if(slow.data !=s.pop())
            {
                return false;
            }
            else
                slow=slow.next;
        }
        return true;
    }
    
    static Node add(Node l1,Node l2,int carry)
    {   
        if(l1==null&&l2==null&&carry==0)
        {
            return newhead.next;
        }
        int val=0;
        if(l1!=null)
        {
            val=val+l1.data;
        }
       if(l2!=null)
       {
           val=val+l2.data;
       }
       val=val+carry;
       int value=val%10;
       carry=(val>=10?1:0);
        System.out.println(carry+"CArry");
       Node n=new Node(value);
       temp.next=n;
       temp=n;
        System.out.println(n.data+"new value");
       if(l1.next!=null|| l2.next!=null)
       {
           add(l1==null?null:l1.next,l2==null?null:l2.next,carry);
       }
       return newhead.next;
    }
    static Node deletemiddle(Node head)
    {
        Node slow=head;
        Node fast=head;
        Node prev=null;
        if(slow==null||slow.next==null)
        {
            return head;
        }
        while(fast.next!=null&&fast.next.next!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=slow.next;
        return head;
    }
    static Node removeduplicates(Node head)
    {
        Node temp=head;
        Node prev=null;
        HashSet<Integer> set=new HashSet<Integer>();
        while(temp!=null)
        {
            if(set.contains(temp.data))
            {
                prev.next=temp.next;
            }
            else
            {
                set.add(temp.data);
                prev=temp;//tricky part need to add to the previous only when its for the first time
            }
            temp=temp.next;
        }
        return head;
    }
    static void print(Node head)
    {Node temp=head;
       
        while(temp!=null)
        {
            if(temp.next==null)
            System.out.print(temp.data);
            else
                System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
    static void appendtotail(Node head,int d)
    {
        Node tail=new Node(d);
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=tail;
        temp=head;
    }
    static Node delete(Node head, int key)
    {
        Node temp=head;
        if(temp.data==key)
        {
            return head.next;
        }
        while(temp.next!=null)
        {
            if(temp.next.data==key)
            {
                temp.next=temp.next.next;
                return head;
            }
            temp=temp.next;
        }
        
        return head;
    }
}
