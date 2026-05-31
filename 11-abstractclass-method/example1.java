//todo                  Abstract class and method 
//? Abstract function should inside abstract class 
// Abstract function must does not contain body 
//! Abstract function must want to exist in every derived class 

abstract class vehicle {
   abstract  void speed ();
}
class car extends vehicle{
    @Override
    void speed()
    {
        
        System.out.println("MY vehicle is Car");
       System.out.println("45km/hr");
    }
}
class bike extends vehicle{
    @Override
    void speed()
    {
        System.out.println("My vehicle is bike ");
        System.out.println("35km/hr");
    }
}

public class example1{
    public static void main(String[] args) {

        car obj = new car();
        bike obj1 = new bike();

        
        
    }
}


