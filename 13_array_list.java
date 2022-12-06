/* 
 1. If size of array is not given then if java we can use the concept of array list ; in C++ this is 
 done using vector
 2.The difference between a built-in array and an ArrayList in Java, 
 is that the size of an array cannot be modified (if you want to add or remove 
 elements to/from an array, you have to create a new one). While elements can be 
 added and removed from an ArrayList whenever you want.
 3. java.util.*; is needed to use the array list

*/

import java.lang.*;
import java.util.*;

import javax.sound.midi.Soundbank;

class array_list 
{
    public static void main(String arg[])    
    {
        /*
        Syntax :- 
        ArrayList<Integer> list = new ArrayList<>(10);
                                                  | <- here you can give the default size
        ArrayList is a class

        Here Integer is a wrapper class and you can not use primitive datatypes directly
        */ 

        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(21);
        list.add(51);
        list.add(101);
        list.add(151);
        list.add(201);

        System.out.println(list);

        list.set(0, 10); // it changes the index value

        System.out.println(list);

        System.out.println(list.contains(10)); // by using this method we can check a element is exist in an array or not it returns true or false
        
        /* 
         We can also take input like this
         for(int i = 0; i<10; i++)
         {
            list.add(sc.nextInt());
         }
        */

        // to get an item at specific index
        // System.out.println(list[0]);  // not allowed

        System.out.println(list.get(1));
    }
}
