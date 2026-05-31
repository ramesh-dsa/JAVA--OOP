class Dad {

     int properties = 345677;
     String car = "BMW";

}
class Son1 extends Dad{
 
    void display()
    {
        System.out.println(properties);
        System.out.println(car);
    }
}
class Son2 extends Dad{

    void display()
    {
        System.out.println(properties);
        System.out.println(car);
    }
}
public class example1{
    public static void main(String[] args) {
        Son1 obj1 = new Son1();
        Son2 obj2 = new Son2();
        obj1.display();
        obj2.display();
    }
}