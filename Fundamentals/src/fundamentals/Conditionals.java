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
public class Conditionals {
 
public static void main(String[] args)
    
{

        useOfIf();
        switchCase();
    }
    
    
public static void useOfIf()
{
     
   int big = 5;
   int small = 3;
   
   if(big>small)
   {
       System.out.println("use of 'if' to compare big > small ");
    }
   else
   {
   System.out.println("No it isn't");
   }
    
    


}
   

public static void useofElseIf()
{

        if (1 < 4 && 0 > 5) {

                System.out.println("You ordered a cup of hot, mint tea.");

        } else if (21 <= 19 || 17 >= 28) {

                System.out.println("You ordered freshly squeezed orange juice!");

        } else if ( !(true == true) ) {

                System.out.println("You ordered hot cocoa!");

        } else {

                System.out.println("You ordered a cup of Java!");

        }

        

        }

public static void useOfIfwithBooleans()
        
{
    boolean mayor = true;
    
    if(mayor == true)
    {
        System.out.println("This is true");
        
    }
    else
    {
        System.out.println("This is fake");
    }
            
        
    
    
    
    
    
    
    
}

public static void switchCase()
{
    

char answerChoice = 'C';

        switch (answerChoice) {

                case 'A': System.out.println("You answered: " + answerChoice + ". Please try again.");
                                                        break; 

                case 'B': System.out.println("You answered: " + answerChoice + ". Please try again.");
                                                        break;

                case 'C': System.out.println("You answered: " + answerChoice + ". That is correct!");
                                                        break;

                case 'D': System.out.println("You answered: " + answerChoice + ". Please try again.");
                                                        break;

                default:
                        System.out.println("Please select a valid answer choice.");


 }

int pesos = 5;
 
 switch(pesos){
     
     case 5:
        System.out.println("te da para un bolon");
        break;
        
     case 8:
         System.out.println("Te da para un bolon y un chicle");
         break;
         
     case 9: 
         System.out.println("Te da para un jugo");
         
        break;
        
     default:
         System.out.println("compra algo");
         break;




}



    


}


public static void ternaryConditional()
{
/*
if/else statements can become lengthy even when you simply 
want to return a value depending on a Boolean expression. 
Fortunately, Java provides a shortcut that allows you to 
write if/else statements in a single line of code. 
It is called the ternary conditional statement.

The term ternary comes from a Latin word that means "composed of three parts".

These three parts are:

A Boolean expression
A single statement that gets executed if the Boolean expression is true
A single statement that gets executed if the Boolean expression is false
Here is an example of a ternary conditional statement:
    */
    
int pointsScored = 21;

char gameResult = (pointsScored > 20) ? 'W' : 'L';
System.out.println(gameResult);



int edad = 23 ;
        
char juego = (edad > 5) ? 'W' : 'Y';
System.out.println(juego);


}


























}


    
    
