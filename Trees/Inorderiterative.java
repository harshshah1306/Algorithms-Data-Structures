package trees;
import java.util.Stack;
class Node
{
    int key;
    Node left,right;
    public Node(int item)
    {
        key=item;
        left=right=null;
    }
            
}
public class Inorderiterative {
    static Node root;
    public Inorderiterative()
    {
        root=null;
    }
    
    public static void main(String[] args) {
        
        Inorderiterative tree=new Inorderiterative();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);
        tree.root.right.left=new Node(6);
        tree.root.right.right=new Node(7);
        tree.Inorder(root);
        
        
    }
    
    public void Inorder(Node root)
    {   
        Stack<Node> stack=new Stack<Node>();
        Node current=root;
        while(current!=null)
        {
            stack.push(current);
            current=current.left;
        }
        System.out.println("here");
        
        while(stack.size()>0)
        {
            
            current=stack.pop();
            System.out.println(current.key+" ");
            if(current.right!=null)
            {
                current=current.right;
                while(current!=null)
                {
                    stack.push(current);
                    current=current.left;
                }
           
            }
               
        }
            
    }  
    
    
}

/*1) Create an empty stack S.
2) Initialize current node as root
3) Push the current node to S and set current = current->left until current is NULL
4) If current is NULL and stack is not empty then 
     a) Pop the top item from stack.
     b) Print the popped item, set current = popped_item->right 
     c) Go to step 3.
5) If current is NULL and stack is empty then we are done.
*/
