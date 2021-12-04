/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	   
        String inputStr = "aaaaaaaaaabbbaxxxxyyyzyx";
       

        System.out.println(runLengthEncode(inputStr));
      
	}
	
    public static String runLengthEncode(String text) {
        String encodedString = "";
    
        for (int i = 0, count = 1; i < text.length(); i++) {
            if (i + 1 < text.length() && text.charAt(i) == text.charAt(i + 1)){
                count++;
            }
            else {
                encodedString = encodedString.concat(Character.toString(text.charAt(i)))
                        .concat(Integer.toString(count));
                count = 1;
            }
        }
        return encodedString;
    }
    
    

}
