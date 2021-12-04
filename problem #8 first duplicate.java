/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    /*
	         Time complexity & Space complexity is => 
	                              best case: O(1),
	                             worst case: O(N^2)
	                           average case: O(N^2)
	                           
	            
	    */
	    
	   ArrayList<Integer> arr = new ArrayList<>();
	   arr.add(1);
	   arr.add(1);
	   arr.add(0);
	   
	   arr.add(2);
	   arr.add(4);
	   arr.add(5);
	   
	   
	   for(int i = 0; i < arr.size(); i++){
	       for(int j = i+1; j < arr.size(); j++){
	           
	           if(arr.get(i) == arr.get(j)){
	               System.out.println((arr.get(i) +" == "+ arr.get(j)));
	                System.out.println("Array size is "+ arr.size());
	               System.out.println("First duplicate after internal looping "+ (j+1) + " and outer looping "+ (i+1));
	               break;
	           }
	           
	       }
	   }

      
	}
	
    
}
