class Vehicle{
    String brand ="Supra M15";
    void drive()
    {
       System.out.println(brand);
    }
}
class Car extends Vehicle{
    int numWheels = 4 ; 
    void honk()
    {
      System.out.println(numWheels);
    }
}
public class example2{
    public static void main(String[] args) {
        Car obj = new Car();
        obj.drive();
        obj.honk();

    }
}