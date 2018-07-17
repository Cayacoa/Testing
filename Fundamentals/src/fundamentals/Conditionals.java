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
 
    public static void main(String[] args) {

        useOfIf();
        
    }
    
    
public static void useOfIf(){
     
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
   

public static void useofElseIf(){

        if (1 < 4 && 0 > 5) {

                System.out.println("You ordered a cup of hot, mint tea.");

        } else if (21 <= 19 || 17 >= 28) {

                System.out.println("You ordered freshly squeezed orange juice!");

        } else if ( !(true == true) ) {

                System.out.println("You ordered hot cocoa!");

        } else {

                System.out.println("You ordered a cup of Java!");

        }

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


}


public static void useOfIfwithBooleans()
        
{
    
}
    


}



    
    
