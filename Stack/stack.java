package Stack;
import java.util.*;
class Stack
{
    Stack next;
    int data;
    public Stack()
    {
        
    }
    public Stack(int d)
    {
        data=d;
    }
}

public class stacks {
    private static Stack top;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack s=new Stack();
        push(10);
        push(11);
        System.out.println(top.next.next);
    }
    public static void push(int num)
    {   
        Stack n=new Stack(num);
        n.next=top;
        top=n;
    }
    public static int pop()
    {
        if(top==null)
        {
            throw new EmptyStackException();
        }
        int item;
        item=top.data;
        top=top.next;
        return item;
    }
    public static int peek()
    {
        if(top==null)
        {
            throw new EmptyStackException();
        }
        return top.data;
    }
    
}
