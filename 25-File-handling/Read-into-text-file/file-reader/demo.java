//todo                  File Reader 

// Ethula one one letter aa aduthu tharum athuvum int aa namba char ku mathanum 

import java.io.FileReader;
public class demo
{
    public static void main(String[] args) {
        try
        {
          FileReader fr = new FileReader("demo.txt");
          int c = fr.read();

          //todo gives the integer number change to char 
        //  System.out.println(c);

          //! See only one word is printing if we want to print entire line use while loop
         // System.out.println((char)c);

          //? always after the  last word of the file is -1 

          
          while(c!=-1)
          {
            System.out.print((char) c );
            c = fr.read();
          }

          System.out.println("\nSuccess");
        }
        catch(Exception e)
        {
             System.out.println("Something has happened ");
        }
        
    }
}