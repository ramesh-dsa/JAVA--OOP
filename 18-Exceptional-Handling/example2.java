//todo   Exceptional handling - catch all exception 

import java.util.Scanner;
public class example2
{
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
        //! Input mismatch error  
        try
        {
            int a = sc.nextInt();
            System.out.println("Succesfully runned");
        }
        //this is catch all exception 
        catch(Exception e)
        {
            System.out.println(e);
        }
       

    }
}