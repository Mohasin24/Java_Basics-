/*
## Developer :- James Gosling developed in sun micro system and currently managed by oracle
## Fisrt release :- 1995
1. Save java code using '.java' extension
2. To compile java code use the following command :-
    javac Demo.java

*/

/* CHARACTERISTICS  
1. Pure object oriented : everything is class
2. Simple
3. Platform independent : .class file executes on any os
4. Architecture neutral : .class file executes on any micro-processor
5. Dynamic : runtime decision
6. Secured : bytecode verifier
7. Compiled
8. Interpreted
9. Robust : strong exception handling
10. Statically typed  
*/

import java.lang.*;

class Demo
{
    public static void main(String args[]) 
    {
      System.out.println("Hello MK");  
    }
}

/*
1. java.lang :- java is a name of super package & lang is a name of sub-package which contains language specific functionality
2. * :- * indicates all the members of specific package 
3. class :- It is a keyword which is used to declare or define the class
4. Demo :- It is a name of user defined class. In Java name of file & name of a class which contains the main function should be same.
5. public :- It is a access specifier used for the main function. main function should be public because it gets called by the outsider entity i.e. interpreter.
6. static :- main function should be static because interpreter wants to call that function without creating the object.
7. void :- Return value of main is void because JVM is not interested in the exit status of our java application
8. main :- main is the name of entry point function in Java
9. String :- It is a datatype of java. Command line argument of java are having datatype string.
10. arg[] :- It is considered as array
11. System :- It is considered as a class name which is defined in java.lang package
12. out :- It is a static member of system class. out is object of print stream class 
13. println :- It is a method which is used to display the data on screen. ln - new line
*/