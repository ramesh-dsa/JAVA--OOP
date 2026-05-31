class grandfather{
     int property = 1099839;
}
class father extends grandfather{
     String car = "BMW";
}
class son extends father{
 
    void show()
    {
        System.out.println(property);
        System.out.println(car);
    }
}
public class example1{
    public static void main(String[] args) {
        son obj = new son();
        obj.show();
    }
}