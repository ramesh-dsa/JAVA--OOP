import java.util.Scanner;
class Find{
    void evenorodd(int a )
    {
        if(a%2==0)
        {
            System.out.println("Even");
        }
       
        else 
        {
            System.out.println("Odd");
        }
    }
}
public class example1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Find obj = new Find(); 

        System.out.print("Enter a number : ");
        int a = sc.nextInt();
       

        obj.evenorodd(a);
    }
}