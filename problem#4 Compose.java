/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.util.function.Function;

public class Main
{
	public static void main(String[] args) {
	   
      
        compose(6);
      
	}
	
	static double compose(int value){
	  Function<Integer, Integer> inc = t -> t +1;
      Function<Integer, Integer> square = t -> t  * t;
      
      Function<Integer, Integer> FirstIncThenSquare = square.compose(inc);
      
      System.out.println(FirstIncThenSquare.apply(value));
      
      return FirstIncThenSquare.apply(value);
	}
	
   
    
}
