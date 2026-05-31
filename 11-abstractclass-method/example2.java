abstract class Animal
{
    abstract void sound();
    void breathe()
    {
       System.out.println("Breathing ");
    }
}
class Dog extends Animal 
{
    void sound()
    {
        System.out.println("Woof");
        super.breathe();
    }
}
class Cat extends Animal
{
    void sound()
    {
        System.out.println("Meow");
        super.breathe();

    }
}
public class example2{
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Cat c1 = new Cat();
        d1.sound();
        c1.sound();
    }
}