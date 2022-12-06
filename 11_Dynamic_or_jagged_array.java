/* 
    array.length :- this method gives the number of elements that an array holds

    dynamic or jagged array :- number of elements in each row is different
*/

import java.lang.*;

class array
{
    public static void main(String[] args) 
    {   
        int arr[][] = {
            {1,2,3,4},
            {58, 65},
            {21, 51, 101, 151,201,251}
        };

        for(int i = 0; i<arr.length;i++)
        {
            for(int j = 0; j<arr[i].length; j++)
            {
                System.out.print(arr[i][j]+", ");
            }
            System.out.println();

            // arr[i].length gives total no. of coloumn in individual row
            // arr.length gives total no. of rows 
        }
    }
}