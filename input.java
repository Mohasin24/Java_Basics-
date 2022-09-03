/*
We can accept input in java in two ways :
1. Using BufferdReader
2. Using Scanner class
*/

/*
1. Here we will use scanner class to accept input
2. We have to import util package to use the scanner class
*/

/*
Syntax:
        Scanner sobj = new Scanner(System.in)
*/

import java.lang.*;
import java.util.*;

class input {
        public static void main(String arg[]) {
                Scanner sobj = new Scanner(System.in);

                String name;
                char div;
                int age = 0;
                double sal = 0.0;

                // System.out.println("Please enter your name :-");
                // System.out.print("Please enter your full name :-\n");
                System.out.print("Please enter your name :- ");
                name = sobj.nextLine();

                System.out.print("Enter your age :-  ");
                age = sobj.nextInt();

                System.out.print("Enter your division :-  ");
                div = sobj.next().charAt(0);
                /*
                by using the charAt command and passing ‘0’ as the index, you’re only taking a 
                single character as input and storing it into a variable. The return value of 
                the input line will be a single character.
                */

                System.out.print("Enter your salary :-  ");
                sal = sobj.nextDouble();

                System.out.println("Name :- "+name); // concatination is allowed in java
                System.out.println("Age :- "+age);
                System.out.println("Division :- "+div);
                System.out.println("Salary :- "+sal);
        }
}

/*
 * In the scanner class there are multiple methods for different data types as:
 * 1. integer :- nextInt()
 * 2. float :- nextFloat()
 * 3. double :- nextDouble()
 * 4. long :- nextLong()
 * 5. short :- nextShort()
 * 6. String (single word):- next()
 * 7. String (with spaces) :- nextLine()
 */