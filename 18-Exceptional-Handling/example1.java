//todo                Exceptional Handling

//? Types of Runtime Exception 
//*   ArithmeticException 
//*   NullPointerException 
//*   IllegalArguementException
//*   NumberFormatException
//*   ArrayIndexOutOfBoundsException    


//! Exceptional handling is used in runtime error 
import java.util.Scanner;
public class example1
{
    public static void main(String[] args) {
        // divide by zero error 
       Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // int c = a/b ;  here eppa program crash airum 
        // ? Etha avoid panna 

        //! Divide by zero error 
        try
        {
            int c = a/b;
        }

        //this is catch all exception 
        catch(Exception e)
        {
            System.out.println(e);
        }
       System.out.println("Succesfully runned");

    }
}