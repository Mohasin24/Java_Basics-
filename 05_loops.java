/*
Loops concept is also same in java like in C & C++
There are three types of loops as 
1. for()
2. while()
3. de while()
*/

/*
Below is demo code which prints the star pattern using the loops

    *   
    * *
    * * *
    * * * *
*/
import java.lang.*;
import java.util.*;

public class loops {
    public static void main(String arg[]) {
        Scanner sobj = new Scanner(System.in);

        int iNum = 0;

        System.out.print("Enter the number : ");
        iNum = sobj.nextInt();

        // for loop

        for (int i = 0; i < iNum; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // while loop
        System.out.println("while loop :-");
        int k = 1; // initialisation

        // condition
        while (k <= 10) {
            // Logic

            if (k == 3) {
                k++;
                continue; // continue will skip the execution of 3
            }
            System.out.println(k);;
            k++;
        }
        // =================================================================================================

        System.out.println("do while loop :-");

        int j = 10; // initialisation

        do {
            System.out.println("do while gets executed at least one's irrespective of condition"); // logic

        } while (j < 10); // condition

        // here the codition becomes false still printf gets executed

    }
}
