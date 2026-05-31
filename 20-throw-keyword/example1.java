//todo                     Throw 

//? throw keyword is used when we want to intentionally throw the error 
//error aa ella erunthalum throw pannanum na etha use panuvom 

import java.util.Scanner;

public class example1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try
        {
            int age = sc.nextInt();
            if(age<=0)
            {
                throw new Exception("hello error naaney tharen vangikko ");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}