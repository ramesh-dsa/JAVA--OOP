
import java.util.Scanner;

class School{
    String passorfail(int num)
    {
        if(num>=35)
        {
           return "Pass";
        }
        else
        {
            return "Fail";
        }
    }
}
public class example2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total marks : ");
        int number = sc.nextInt();  
        School obj = new School();
        System.out.println(obj.passorfail(number));

        
    }
}