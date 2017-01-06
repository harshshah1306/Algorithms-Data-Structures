//Program to calculate the size of the binary tree, i.e the number of Nodes in the tree
package trees;

class Node
{
    int key;
    Node left,right;
    public Node(int item)
    {
        key=item;
        left=null;
        right=null;
    }
    
}

public class binarytreesize {
    static Node root;
    
    public binarytreesize()
    {
        root=null;
    }
    
    public static void main(String[] args) {
        binarytree tree=new binarytreesize();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        System.out.println(tree.root.left.key);
        int sizeoftree=tree.Size(root);
        System.out.println(sizeoftree);
        
    }
    
    public int Size(Node root)
    {
        if(root==null)
        {
           return 0; 
        }
        return Size(root.left)+1+Size(root.right);
    }
    
}
