//todo       Multiple exceptional handling 

// before paathathu any error vanthalum catch pannum 
// But here what type of error vantha mattum catch pannanum nu decide panikalam 

import java.util.InputMismatchException;
import java.util.Scanner;

public class example3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
          int a = sc.nextInt();
          int b = sc.nextInt();
          int c = a/b ;
        }
         catch (InputMismatchException e) {
            System.out.println("Error occured : "+ e);
        }
        catch(ArithmeticException e )
        {
            System.out.println("Error occured : "+e);
        }
        System.out.println("Program finished ");
    }
}