class Phone{

    String brand ;
    int price ;
    int storage ;

    Phone()
    {
        brand="Unknown";
        price=0;
        storage=0;
    }
    Phone(String brand , int price , int storage)
    {
        this.brand = brand;
        this.price = price ;
        this.storage = storage ;
    }
}
public class example1{
    public static void main(String[] args) {
        Phone obj1 = new Phone();
        System.out.println(obj1.brand);
        System.out.println(obj1.price);
        System.out.println(obj1.storage);

        Phone obj2 = new Phone("Iphone",45000,512);
        System.out.println(obj2.brand);
        System.out.println(obj2.price);
        System.out.println(obj2.storage);
    }
}