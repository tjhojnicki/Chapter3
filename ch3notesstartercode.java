/********************************************************************
// These are the notes for ch 3 used in hayes class


import
//******************************************************************* */
import java.text.DecimalFormat;
import java.text.NumberFormat;
//import cs1.Keyboard;
import javax.swing.*;
import java.util.StringTokenizer;
import java.util.Scanner;


public class ch3notesstartercode
{
public static void main (String [] args)
{
        final double TOLERANCE=.001;
        Scanner keyboard = new Scanner(System.in);
        //NumberFormat money = NumberFormat.getmoneyinstance();
        /*
    String word1 = "apple";
    String word2 = "cat";
    String word3 = "dog";

    if(word2.compareTo(word1)<0)//;end a statement BAD BAD simicolen
    {
        System.out.println(word2 +" is before " + word1  );
        System.out.println("and cats are evil" );
    }//ctrl M - will match brackets
    else
        System.out.println(word1 +" is before " + word2  );

    if(word2.compareTo(word3)<0)
        System.out.println(word2 +" is before " + word3  );
        /*

      int num = 5, num1 =10, num2 = 4,max;  // standard hours in a work week

      System.out.print ("Enter a number ");
      num = Keyboard.nextInt();

       System.out.print ("Enter a  second number ");
       num1 = Keyboard.nextInt();

       System.out.print ("Enter a  third number ");
       num2 = Keyboard.nextInt();

      System.out.println ();
      
      if(num>num1){
        if(num>num2){
            max=num;}
        else if(num<num2){
            max=num2;}
    }
    else if(num1>num2){
        if(num1>num){
            max=num1;}
        else{
            max=num2;}
    
        }
          
        
    *//*

       boolean a = true, b = false, c = false,d;
        System.out.println(a  );
        //or's short circuits on a true
       // c =(a = true) || (b = true);
        //System.out.println(a + "-" + b + "-" + c);


      // c = (a = false) || (b = true);
       //System.out.println(a + "-" + b+ "-" + c);

    //     c =(a = false) && (b = true);
    //    System.out.print(a + "-" + b+ "-" + c);
    //
    //     c = (a = true) && (b = false);
    //     System.out.print(a + "-" + b + "-" + c);
    
    //     d =!(a = true) || (b = true) && (c = true);
    //     System.out.print(a + "-" + b + "-" + c+ "-" + d);
    
    
    
        /*
        
        //--------------------SWITCH STATEMENTS
        char choice;
        
        System.out.println("What would you like to buy");
        System.out.println("F) Fries");
        System.out.println("H) Hot Dog");
        System.out.println("S) Small Drink");
                //this is a string--this grapbs the first char
        choice=keyboard.next().charAt(0);
        
        // choice must be char, int, Java7(8?), string enum
        switch(choice)
        {
            case'F':
            case'f':
                System.out.println(".99");
                break;//this ends the switch
            case'H':
            case'h':
                 System.out.println("1.45");
                 break;//this ends the switch
            case'H':
            case's':
                 System.out.println("1.65");
                 break;//this ends the switch
            default:
            System.out.println("Invalid Input Idiot!!!");
                }

        */
       //----------------Doubles and Decisions------------------
       
       double num,num1,num2;
  
       num1=.01*1+.05*2+.1*3+.25*4;
       num2=500.0/900;
       System.out.println(num1);
       
       System.out.print("Enter a Float   ");
       num=keyboard.nextDouble();
       
       //if(num==num1)can cause erroe when double sare calculated, bit off
       if(Math.abs(num-num1)<TOLERANCE)
       {
           System.out.println("same");
        }
       else{
           System.out.println("Different");
        }
        
       
       
 /*  */

}// end of main 


}// end of class









