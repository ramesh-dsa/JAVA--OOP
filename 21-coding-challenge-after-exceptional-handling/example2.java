import java.util.Scanner;

class InvalidAgeException extends Exception
{
    public InvalidAgeException(String s )
    {
       super(s);
    }
}
class AgeValidator
{
    void checkAge(int age)
    {
        try
        {
            if(age < 0 || age>150)
            {
                throw new InvalidAgeException("Please enter a valid age ... ");
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

public class example2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AgeValidator obj = new AgeValidator();
        int age = sc.nextInt();
        obj.checkAge(age);
        
    }
}