import java.util.Scanner;
class Calculator
{
    int add(int a,int b)
    { return (a+b); }
    int sub(int a , int b)
    { return (a-b); }
    int mul(int a , int b)
    { return (a*b); }
    int div(int a , int b )
    { if(b==0)
    {
        System.out.println("Cannot be divided");
        return 0;
    }
        return (a/b); 
    }
}

public class example2
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Calculator obj = new Calculator();
        System.out.print("\nEnter 1st number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int b = sc.nextInt();
         System.out.println("Addition : "+obj.add(a,b)); 
        System.out.println("Subtraction : "+obj.sub(a,b));
        System.out.println("Multiplication : "+obj.mul(a,b));
        System.out.println("Division : "+obj.div(a,b));
    }
}