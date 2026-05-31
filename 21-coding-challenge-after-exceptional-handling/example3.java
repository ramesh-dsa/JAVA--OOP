import java.util.Scanner;

class InvalidAgeException extends Exception
{
    public InvalidAgeException(String message)
    {
       super(message);
    }
}

class AgeValidator
{
    void checkAge(int age)
    {
        try
        {
            if(age<18)
            {
                throw new InvalidAgeException("Too Young ! ... ");
            }
            else
            {
                System.out.println("Age is valid ");
            }
        }
        catch(InvalidAgeException e)
        {
            System.out.println(e);
        }
    }
}

public class example3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        AgeValidator obj = new AgeValidator();
        obj.checkAge(age);
    }
}