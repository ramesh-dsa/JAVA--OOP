//todo                 Multiple inheritance 

interface Printable{
    void display();
}

interface Showable{
    void display();
}

class Document implements Printable , Showable {
    public void display()
    {
      System.out.println("To avoid diamond problem due to Multiple inheritance");
    }
}

public class example2{
    public static void main(String[] args) {
        Document obj = new Document();
        obj.display();
    }
}


