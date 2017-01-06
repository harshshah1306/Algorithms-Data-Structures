//This program is to print the nodes level by level on a new line.
package trees;
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
public class levelordertraversal {
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
           System.out.println("Level traversal");
           tree.newlineordertraversal(root);
           
    }

void newlineordertraversal(Nodes root)
    {
        Queue<Nodes> queue=new LinkedList<>();    
        queue.add(root);
        while(true)
        {
            int nodecount=queue.size();
            if(nodecount==0)
            {
                break;
            }
            System.out.println();
            while(nodecount>0)
            {
               Nodes temp=queue.poll();
                
               System.out.print(temp.key+" ");
               if(temp.left!=null)
               {
                   queue.add(temp.left);
               }
               if(temp.right!=null)
               {
                  queue.add(temp.right);
                   
               }
               nodecount--;
            
            }
    
        }
    }
}  
