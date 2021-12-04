/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    //Insert rows and columns
		 Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows (1-10): ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns (1-10): ");
        int cols = input.nextInt();

        int[][] inputMatrix = new int[rows][cols];

        // Assign random values to the Matrix
        for (int row = 0; row < inputMatrix.length; row++)
            for (int col = 0; col < inputMatrix[row].length; col++) {
                inputMatrix[row][col] = (int) (Math.random() * 1000);
            }

        System.out.println("matrix:");
        printMatrix(inputMatrix);

        int[][] resultMatrix = transposeMatrix(inputMatrix);


        System.out.println("Transposed matrix:");
        transposeMatrix(resultMatrix);
        printMatrix(resultMatrix);
	}
	
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
    
	public static int[][] transposeMatrix(int[][] matrix){
	    
	    int rows = matrix[0].length;
        int Cols = matrix.length;
        
    
        int[][] transposedMatrix = new int[rows][Cols];
    
        for(int x = 0; x < rows; x++) {
            for(int y = 0; y < Cols; y++) {
                transposedMatrix[x][y] = matrix[y][x];
            }
        }
    
        return transposedMatrix;
    }

}
