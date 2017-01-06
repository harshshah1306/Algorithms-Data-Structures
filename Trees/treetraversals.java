package trees;
//recursive approach

import java.util.LinkedList;
import java.util.Queue;
import static javafx.application.Platform.exit;

class Nodes
{
   int key;
   Nodes left,right;
   public Nodes(int item)
   {
       key=item;
       left=null;
       right=null;
   }

}
public class treetraversals {
    static Nodes root;
    public treetraversals()
    {
        root=null;
    }
    
    public static void main(String[] args) {
           treetraversals tree=new treetraversals();
           tree.root=new Nodes(1);
           tree.root.left=new Nodes(2);
           tree.root.right=new Nodes(3);
           tree.root.left.left=new Nodes(4);
           tree.root.left.right=new Nodes(5);
           tree.inorder(root);
           System.out.println("-----------PREORDER----------");
           tree.preorder(root);
           System.out.println("-----------POSTORDER-----------");
           tree.postorder(root);
    }
    
    void inorder (Nodes root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.println(root.key);
        inorder(root.right); 
    }
    
    void preorder(Nodes root)
    {
        if(root!=null)
        {
            System.out.println(root.key);
        }
        if(root.left!=null)
        {
            preorder(root.left);
        }
        if(root.right!=null)
        {
            preorder(root.right);
        }
    }
    
    void postorder(Nodes root)
    {
        if(root.left!=null)
        {
            postorder(root.left);
        }
        if(root.right!=null)
        {
            postorder(root.right);
        }
        System.out.println(root.key);
    }
    
    void levelordertraversal(Nodes root)
    {
        Queue<Nodes> q=new LinkedList<Nodes>();
        q.add(root);
        while(!q.isEmpty())
        {
            Nodes temp=q.poll();
            System.out.println(temp.key+" ");
            if(temp.left!=null)
            {
                q.add(temp.left);
            }
            if(temp.right!=null)
            {
                q.add(temp.right);
            }
        }
    }
    
    
    }
    
    
    
}
