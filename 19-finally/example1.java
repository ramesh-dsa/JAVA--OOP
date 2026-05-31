//todo            Finally is used in Exceptional Handling 

// whether the control goes to try block or catch block the finally block executes 

import java.util.Scanner;
public class example1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = 0 ;
        try
        {
           int a = sc.nextInt();   
           d = 0 ;
        }
         catch (Exception e) 
        {
            System.out.println("Error found : "+e);
            d = 1 ;
        }
        finally 
        {
            if(d==0)
            {
              System.out.println("The program is finished ");
            }
            else
            {
                System.out.println("The program has some errors ");
            }
            
        }
    }
}