/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

public class Main
{
    static class Node
    {
        int value;
        Node left, right;
        public Node(int value){
            this.value = value;
            this.right = this.left = null;
        }
    }

	public static void main(String[] args) {
	    
	   /*
	                 1
	               /   \
	             2      3
	            / \    / \
	           4   5  6   7
	                 /
	                8 
	   */
	    
	    
	    
	    Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left.right = new Node(8);
        
        
     
        int sum = summationNode(root);
        System.out.println("Sum of all the elements is: " + sum);
      
	}
	

 
    /* sum  all the elements*/
    static int summationNode(Node root)
    {
        if (root == null){
            return 0;
        }
        return (root.value + summationNode(root.left) +
                           summationNode(root.right));
    }
	
    
}
