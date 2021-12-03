/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
        // Input string
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
        System.out.print("Enter a string: ");
        String str= sc.nextLine(); //reads string.
        //String str = "abbba";
 
        // passing bool function till holding true
        if (checkPalindrome(str))
 
            // It is a palindrome
            System.out.print("It's a Palindrome");
        else
 
            // Not a palindrome
            System.out.print("It is not a Palindrome");	}
	
	 // Method
    // Returning true if string is palindrome
    static boolean checkPalindrome(String input)
    {
 
        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = input.length() - 1;
        
        if(j%2 == 0){ // check length of string if it is odd so It's not a plindrome otherwise need to check o n each character
            return false;
        }
        else{
             // While there are characters to compare
            while (i < j) {
     
                // If there is a mismatch
                if (input.charAt(i) != input.charAt(j)){
                    return false;
                }
     
                // Increment first pointer and
                // decrement the other
                i++;
                j--;
            }
     
            // Given string is a palindrome
            return true;
        }
 
       
    }
}
