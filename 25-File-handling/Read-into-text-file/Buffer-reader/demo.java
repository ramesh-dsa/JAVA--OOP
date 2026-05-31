

//todo                   Buffer Reader 

// It is used because file reader takes one by one letter  as integer
//! There we used read()
// buffer reader takes entire line as a string 
//! Here we use readLine()


import java.io.BufferedReader;
import java.io.FileReader;
public class demo
{
    public static void main(String[] args) {
        try
        {
           FileReader fr = new FileReader("demo.txt");
           BufferedReader br = new BufferedReader(fr);

        // here after the last word is null when we get null we can stop 
           String line = br.readLine();
           while(line!=null)
           {
            System.out.println(line);
            line = br.readLine();
           }
           System.out.println("Success");
           
        }   
        catch (Exception e)
        {
           System.out.println("Something has happened to me ... ");
        }
    }
}