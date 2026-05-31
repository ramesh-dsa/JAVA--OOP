class Base{
    void display1()
    {
        System.out.println("Hello");
    }
}
class Derived extends Base{
    void display()
    {
        System.out.println("From Derived hello ");
    }
}
public class example1{
    public static void main(String[] args) {
        Derived obj = new Derived();
        obj.display1();
    }
}