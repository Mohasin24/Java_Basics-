/* 
 Array :- Array is a data structure used to store homogeneous elements in sequential and indexed format
*/
/* 
 1. The memory allocation in for array is strictly dynamic in nature.
 2. Like C, C++ types of array in java are of two types :
    1. Single dimensional
    2. Multi dimensional
 3. In java array objects are in heap. Heaps objects are not contineous , that is why array object in java may not contineous as in C and C++ it is totally depends on JVM    
 4. If we did not initialise the array then it gets initialise with default value of data-type.(0/0.0, etc;)
 5. Arrays are mutable i.e we can change it  
 6. Arrays are internally consider as a pointer in a C/C++;
*/

/* 
 Syntax :
        data-type [] var-name = new data-type[size];
        or
        data-type var-name[] = new data-type[size];

        direct intiliasation

        data-type var-name[] = {0, 1, 2};

*/
import java.lang.*;
import java.util.*;

class arrays 
{
    public static void display()
    {
        int rollNo[]  = {1,2,3,4,5,6};

        for(int i = 0; i<6; i++)
        {
            System.out.println("Roll no. "+rollNo[i]);
        }
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        int size =0;
        // int marks[] = new int[size]; // this will not work as our code executes line by line, array size will be zero
        System.out.print("Number of students :  ");
        size = sc.nextInt();

        // array
        int marks[] = new int[size]; // it gets initialise by the size value

        // initialise the array
        for(int i = 0; i<size; i++)
        {
            System.out.print("Enter marks of student no. " + (i+1) + " :  ");
            marks[i] = sc.nextInt();
        }

        // display array elements

        for(int i = 0; i<size; i++)
        {
            System.out.println("Marks of student no. " + (i+1) +" is :  "+ marks[i]);
        }

        display();
    }    
}
