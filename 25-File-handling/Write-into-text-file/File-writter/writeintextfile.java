
//todo        How to write into a text file 

//?  FileWriter 
// It is a Java class used for writing characters data to a file 
// It is a part of java.io Package 
// It is commonly used when you need to write plain text to a file 
// Used for small messeges for big messages use buffered writer 


//todo methods 
// filename.write();
// filename.close();
//? filename.append();
//! ethu summa use panna append aagathu so 
//  FileWriter fw = new FileWriter("Demo.txt", true );
// now append use panna append aaagum 

import java.io.FileWriter;
public class writeintextfile{
    public static void main(String[] args) {
        //! Inside this function braces we have to give existing file name 
        // or It automactically creates one but we have to give name of file 
        //? compile time laiye error varuthu handle pannanum so try block la podurom 

        try
        {
         FileWriter fw = new FileWriter("Demo.txt");
         // if we want to append in files we must give 
         //todo     FileWriter fw = new FileWriter("Demo.txt",true);  eppadi potutu 
         //? then append use panna tha work aagum without that above line overwrites the 
         //? entire content 


         fw.write("\n hello world eppadi eruka da \tmapla... ");
         fw.close();
        }
        catch(Exception e)
        {
            System.out.println("Something has happened");
        }
       
    }
}