

/**
 * Write a description of class minivan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class minivan
{
    public static void main(String[]args)
    {
        Scanner scan= new Scanner(System.in);
        String input;
        char dl,dr,cl,mu,il,ir,ol,or,gear;
        
        System.out.println("Enter an input with the with the in the following order"+
        "DL DR CL MU IL IR OL OR GEAR  (please put a space between characters");
        
        input=scan.next();
        
        //gets all of the numbers
        dl=input.charAt(0);
        dr=input.charAt(2);
        cl=input.charAt(4);
        mu=input.charAt(6);
        il=input.charAt(8);
        ir=input.charAt(10);
        ol=input.charAt(12);
        or=input.charAt(14);
        gear=input.charAt(16);
        
    }

}
