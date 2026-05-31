//todo                  Animal Kingdom
class Animal{
    String name ;
    int age ;
    void makesound()
    {
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    String breed ;
     void makesound()
     {
        System.out.println("Dog barks ");
     }
     void fetch()
     {
        System.out.println("Dog is fetching");
     }
}
class Cat extends Animal{
    String color ;
    @Override
    void makesound()
     {
        System.out.println("Cat meows ");
     }
    void climb()
    {
        System.out.println("Cat is climbing ");
    }

}
public class example3{
    public static void main(String[] args) {
       Dog obj = new Dog();
       obj.name="TImmy";
       obj.age = 232;
       obj.breed= "labourdog";
       obj.makesound();
       obj.fetch();

       Cat obj1 = new Cat();
       obj1.name="TImmy";
       obj1.age = 232;
       obj1.color = "Black";
       obj1.makesound();
       obj1.climb();
    }
}