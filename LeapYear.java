

/**
 * Tommy Hojnicki
 * September 18,2017 
 *  
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class LeapYear
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        int num;
        
        System.out.print("Please enter a Year number to see if it is a leap year:  ");
        num=scan.nextInt();
        
        //checks to see if the number is greater than 1582
    if (num>=1582)
        {
            //checks to see if the neumber can be divided by 100 and have a remainder of zero as well as divided by 400 and not have a remainder
            if((num%100)==0 && (num%400)==0){
            
                System.out.println(num +" is a leap year!");}
           
            //checks to see if the number can be divided by 4 with no remainder and if there is a remainder when divided by 100
            if((num%4)==0 &&(num%100)!=0){
            
              System.out.println(num +" is a leap year!"); }
              
            //this checks if it fits neither the first or second if statement
            if(!((num%100)==0 && (num%400)==0)&&!((num%4)==0 &&(num%100)!=0))
            {
                System.out.println(num+" is not a leap year"); 
            }
    }
    //this idiot entered a numbe rthat is less than the acceptable value
    else
    {
        System.out.println("Error!  That is an invalid year that was entered.");
    }
}
}
