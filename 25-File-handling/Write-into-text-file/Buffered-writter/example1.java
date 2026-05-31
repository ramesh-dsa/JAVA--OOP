

//todo                    Buffered writer is used along with filewriter 

// file writer  is best to write small contents
// If we want to write paragraph , we use buffered writer along with file writer

import java.io.BufferedWriter;
import java.io.FileWriter;

public class example1{
    public static void main(String[] args) {

        try
        {
          FileWriter fw = new FileWriter("Demo.txt",true);
          BufferedWriter bw = new BufferedWriter(fw);
          bw.write("Hello \n");
          bw.write("How are you ... ");
          bw.write("I am fine \n");
          bw.append("Appended sentences");
          bw.close();
          System.out.println("Success");
        }
        catch(Exception e)
        {
            System.out.println("Something has Happened ");
        }
     
    }
}