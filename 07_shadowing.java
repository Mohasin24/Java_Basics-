/*
 Shadowing in Java is the practice of using variables in overlapping scopes with the same name 
 where the variable in low-level scope overrides the variable of high-level scope.
*/
import java.lang.*;

class shadowing 
{
    public static int x = 51; // class variable  // scope 6-20
    
    public static void main(String arg[])
    {
        System.out.println(x);
        int x = 21;     // scope 11 - 14
        System.out.println(x);
        display();
    }

    public static void display()
    {
        System.out.println(x);
    }
}
