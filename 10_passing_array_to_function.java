/* 
 1. Any changes to array by the any function changes value inside original array.  
*/
import java.lang.*;
import java.util.*;

class passing_array_to_function 
{   
    public static void changeArray(int arr[])
    {
        arr[0] = 151;
    }
    public static void main(String[] args) 
    {
        int arr[] = {21,51,101};

        System.out.println(Arrays.toString(arr));
        changeArray(arr);
        System.out.println(Arrays.toString(arr));
    }    
}
