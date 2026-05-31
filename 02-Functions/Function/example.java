class Mobile{

    void iphone()
    {
        System.out.println("This is Iphone");
    }
    void oppo()
    {
        System.out.println("This is oppo");
    }
    void vivo()
    {
        System.out.println("This is vivo");
    }
    void realme()
    {
        System.out.println("This is realme");
    }
}

public class example{
    public static void main(String[] args) {
        Mobile obj = new Mobile();
        obj.iphone(); 
        obj.oppo(); 
        obj.vivo(); 
        obj.realme(); 
    }
}