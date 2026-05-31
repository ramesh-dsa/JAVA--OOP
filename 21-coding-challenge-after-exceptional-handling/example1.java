import java.util.Scanner;


class DivisionExample
{
    void divideNumbers(int numerator , int denominator)
    {
       try
       {
         int result = numerator / denominator ;
         System.out.println("result is "+result);
       } 
       catch(ArithmeticException e)
       {
        System.out.println("Cannot divide by zero ");
       }
       
    }
}

public class example1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DivisionExample obj = new DivisionExample();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        obj.divideNumbers(n1,n2);
    }
}