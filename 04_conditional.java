
/*
The concept of conditional statements and switch case is same as in c & c++
*/
import java.lang.*;
import java.util.*;

class conditional {
    public static void main(String arg[]) {
        Scanner sobj = new Scanner(System.in);
        int age = 0;
        System.out.print("Enter age :- ");
        age = sobj.nextInt();

        if (age < 18) {
            System.out.println("Your not eligible.");
        } else if (age > 18) {
            System.out.println("Your eligible.");
        } else {
            System.out.println("Invalid input");
        }

        switch (age) {
            case 18:
                System.out.println("You can apply.");
                break;
            case 22:
                System.out.println("Your are selected.");
                break;

            default:
                System.out.println("Not applicable.");
                break;
        }

    }
}