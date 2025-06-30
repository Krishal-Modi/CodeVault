/*
   
    * 2D Array in Java
    * A two-dimensional array is an array of arrays, where each element is itself an array.
    * It can be visualized as a table with rows and columns.
    * Shape	Rows × Columns

 */
import java.util.Scanner;

public class TwoDimensionalArray {
    
        public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        // int[][] arr = new int[3][4];
        // OR
        // int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};    
        // OR

        int i = 3, j = 3;
        int[][] arr = new int[i][j];


        System.out.println("Enter The Element of 2D Array (3x3):");
        for(i = 0;i<=2;i++){
            for(j = 0;j<=2;j++){
                System.out.println("Element at position [" + i + "][" + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Output : ");

        for(i=0;i<=2;i++){
            for(j=0;j<=2;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); 
        }

        
    }

}
