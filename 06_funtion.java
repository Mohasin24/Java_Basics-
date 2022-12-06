/* 
 Syntax :- 

        returnType functionName(type arg1, type arg2...)
        {
            //logic
        }
*/
/*
 function :- call directly
 method :- call through class object
*/

import java.lang.*;
import java.util.*;


class function
{   
    public static void printName(String n)
    {
        System.out.println(n);
    }
    public static void main(String arg[])
    {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name :-  ");
        name = sc.nextLine();
        printName(name);
    }

    
}