import java.util.Scanner;
class Details{
    String getname(String name)
    {
        return name;
    }
    long getphone( long number)
    {
        return number;
    }
}
public class example2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.print("Enter your Name : ");
            String name = sc.nextLine();
            System.out.print("Enter your phone number : ");
            long number = sc.nextLong();
        
         Details obj = new Details();
         System.out.println("Name : "+obj.getname(name));
         System.out.println("Phone number : "+obj.getphone(number));
    }
}