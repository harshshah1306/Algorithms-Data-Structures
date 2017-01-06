package trees;

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
public class InorderMorris {
    static Node root;
    public InorderMorris()
    {
        root=null;
    }
    public static void main(String[] args) {
        InorderMorris tree=new InorderMorris();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);
        tree.root.right.left=new Node(6);
        tree.root.right.right=new Node(7);
        tree.InorderMorris(root);
        
    }
   
   
    public void InorderMorris(Node root)
    {
        Node current=root;
        while (current!=null)
        {
            if(current.left==null)
            {
                System.out.println(current.key);
                current=current.right;
            }
            else
            {
                
                Node temp=current.left;
                while(temp.right!=null && temp.right!=current)
                {
                    temp=temp.right;
                }
                if(temp.right==null)
                {
                    
                    temp.right=current;
                    current=current.left;
                }
                else
                {   
                    temp.right=null;
                    System.out.println(current.key+" ");
                    current=current.right;
                }
                    
            }
            
            
        }
    }
}
 /* 
    
    1. Initialize current as root 
    2. While current is not NULL
   If current does not have left child
      a) Print current’s data
      b) Go to the right, i.e., current = current->right
   Else
      a) Make current as right child of the rightmost node in current's left subtree
      b) Go to this left child, i.e., current = current->left
    */
    
    
    /*
    Steps: Make root as current, then if left child exits, make the left child as the temp(predecessor) of current
    then, find the rightmost predessor, using the below while condition(if it is null, maintain a link to the current as 
    temp.right=current, so as next time linked is maintained. If the link already exist we know that the part is already visited
    so remove the link, visit that part and move right
    )
    */
    
    
