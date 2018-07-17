/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentals;

/**
 *
 * @author josue
 */
public class BooleanOperators {
 
    
    
    
    public static void main (String[] args){
        compareWithY();
        compareWithOr();
        precedence();
    }
    
public static void compareWithY(){

        int Big = 5;
        int small = 3;
    
 // The following expression uses the "and" Boolean operator
System.out.println(true && true); // prints true
    
// The following expressions use the "and" Boolean operator
System.out.println(false && false); // prints false
System.out.println(false && true); // prints false
System.out.println(true && false); // prints false


// Compares 2 sets of numbers 
System.out.println(2 < 3 && 4 < 5);
    
System.out.println(Big > small && Big > small);
    
}
    
public static void compareWithOr(){

int Big = 5;
int small = 3;


/*


Great! The second Boolean operator that we will explore is called or.

The or operator is represented in Java by ||.
It returns a Boolean value of true when at least one expression on either side of || is true.
The code below shows all the outcomes of the Boolean operator ||:

*/


//The "or" Boolean operator:
System.out.println(false || false); // prints false
System.out.println(false || true); // prints true
System.out.println(true || false); // prints true
System.out.println(true || true); // prints true
//example: 
System.out.print("Comparing 2 set of numbers using || (OR): '2 > 1 || 3 > 4' ");
System.out.println(2 > 1 || 3 > 4);
System.out.print( "\n" );
        
System.out.println("Comparing 2 variables using || (OR):  'Big > small || small > Big' ");
System.out.println(Big > small || small > Big);
System.out.print("\n");
    
}  

public static void exclamationSign(){
    
/*
    
    Fantastic! The final Boolean operator we will explore is called not.

The not operator is represented in Java by !.
It will return the opposite of the expression immediately after it.
It will return false if the expression is true, and true if the expression is false.
The code below shows all the outcomes of the Boolean operator !:
    
    
*/    
    

//The "not" Boolean operator:

System.out.println(!false); // prints true
System.out.println(!true); // prints false


//We can also use the Boolean operator ! with Boolean expressions such as the following:

System.out.println( !(4 <= 10) );


/*
The example above will print out false because the statement
"4 is less than or equal to 10" is true, but the ! operator
will return the opposite value, which is false


*/

    
}

public static void precedence(){
    
    /*
    Boolean Operators: Precedence
    The three Boolean operators &&, ||, and ! can also be used together 
    and used multiple times to form larger Boolean expressions.
    However, just like numerical operators, Boolean operators follow rules 
    that specify the order in which they are evaluated. 
    This order is called Boolean operator precedence.
    
    The precedence of each Boolean operator is as follows:

    1. ! is evaluated first
    2. && is evaluated second
    3. || is evaluated third
    
    Like numerical expressions, every expression within parentheses 
    is evaluated first. Expressions are also read from left to right.
    
    */
    
    //Example
    System.out.println("This is: !(false) || true && false and it prints:");
    System.out.println(!(false) || true && false);
    
    /*
    The example above will print out true. 
    In order, the expression is evaluated as follows:

    1. First, the ! Boolean operator in !(false) returns true.
    2. Second, true && false evaluates to false.
    3. Finally, the remaining expression true || false evaluates to true.
    
    */
}


}
