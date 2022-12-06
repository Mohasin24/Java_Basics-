/* 
 1. In syntax no. of coloumns are mandatory and no. of coloumns are optional
 2. No. of coloumns in individual rows can be vary
*/
import java.lang.*;
import java.util.*;

class Array_2D_Array
{
    public static void main(String[] args) 
    {   
        Scanner sc = new Scanner(System.in);
        //Syntax for 2D array
        int arr[][] = new int[3][4];  // allowed
        // int arr[][] = new int[3][];  // allowed
        // int arr[][] = new int[][4];  // not allowed

        /* Also can be
        
        int arr[][] = {

            {11,21,51},
            {1,2,3},
            {101,151,211}
        };

        */

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j<4; j++)
            {
              System.out.print("Enter element at row : " + (i) + " and coloumn : "+ (j) + " :  ");
              arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i<3; i++)
        {
            for(int j =0; j<4; j++)
            {
                System.out.println("Element at row : " + (i) + " and coloumn : "+ (j) + " is :  "+arr[i][j]);
            }
        }
    }
}