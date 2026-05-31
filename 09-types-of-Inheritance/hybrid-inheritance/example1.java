class Superclass{
    int money = 209878;
}
class Derived1 extends Superclass{
    int std1 = 8767898;
}
class Derived2 extends Superclass{
    int std2 = 876789;
}
class Subderived extends Derived1{
     void display()
     {
        System.out.println(money);
        System.out.println(std1);
     }
}
public class example1{
    public static void main(String[] args) {
        Subderived obj = new Subderived();
        obj.display();
    }
}