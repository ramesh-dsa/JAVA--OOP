//todo              Throws used in exceptional handling 

// when we already know function may give error 
// we can handle it in a place where the function is calling

class Demo 
{
    void display()  throws Exception
    {
      int a = 10 / 0 ;
    }
}
public class example1{
    public static void main(String[] args) {
        Demo d = new Demo();

        try
        {   
            d.display();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }


    }
}