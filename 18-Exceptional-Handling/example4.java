// todo            Example coding

import java.util.InputMismatchException;
import java.util.Scanner;
public class example4
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try 
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a/b; 
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(InputMismatchException e)
        {
            System.out.println(e);
        }
    }
}   