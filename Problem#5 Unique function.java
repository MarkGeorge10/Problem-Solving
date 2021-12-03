/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList();
        
        arr.add("-1");
        arr.add("0");
        arr.add("1");
        arr.add("1");
        arr.add("5");
        arr.add("1");
        arr.add("1");
        
        
        unique(arr);
    }
    
    
    static void unique(ArrayList<String> arr)
    {
       HashMap<String, Integer> capitalCities = new HashMap<String, Integer>();
       Integer countElements = 0;
        // Pick all elements one by one
        for (int i = 0; i < arr.size(); i++)
        {
            
           
            // Check if the picked element
            // is already printed
            int j;
            countElements = 1;
            for (j = 0; j < i; j++){
                // System.out.println("i "+i );
                // System.out.println( "j " + j);
                
                 if (arr.get(i).equals(arr.get(j))){
                     countElements++;
                     
                  //   arr.remove(i);
                   // arr.remove("apples");
                      
                 }
                
            }
            capitalCities.put(arr.get(i), countElements);

            
          
               
         
        }
        
        
          for (String key : capitalCities.keySet()) {
             // System.out.println("key: " + key + " value: " + capitalCities.get(key));
              
              if(capitalCities.get(key) > 1){
                  
                  for(int k =0; k<= capitalCities.get(key)-1; k++){
                  
                  
                  arr.remove(key);
                  
                }
                  
              }
              
            }
           
             
        
        
        
         for (int f = 0; f < arr.size(); f++){
                 System.out.println(arr.get(f));
              }
    }
	

 
       
    
}
