
import java.util.Scanner;

public class example2
{
   static void checkMarks(int marks)
    {
        
        try
        {
            if(marks<0 || marks >100)
            {
                throw new ArithmeticException();
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
           
        }
        finally
        {
            System.out.println("Mark checking Complete ... ");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();
        checkMarks(mark);
    }
}