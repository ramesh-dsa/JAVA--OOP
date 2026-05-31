

import java.util.Scanner;
class OwnException extends Exception
{

    public OwnException(String s) 
    {
       super(s);
    }
    
}

public class example1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try
        {
            int age  = sc.nextInt();
            if(age<18)
            {
                throw new OwnException("Enter a valid age ");
            }
        }
        catch(OwnException e)
        {
            System.out.println("Error "+ e);
        }
    }
}