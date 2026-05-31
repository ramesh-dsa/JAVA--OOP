//todo                     super keyword 

//? by using super keyword we can call the baseclass constructor , methods , variables 

class Superclass{
    int x = 1098 ;
    void display()
    {
        System.out.println("I am here ");
    }  

    //  Superclass() {
    //     System.out.println("From superclass");
    // }
    Superclass(String a )
    {
        System.out.println("With parameter ");
    }
    

}
class Derived extends Superclass{

   Derived() {

        //! eppa nan superclass constructor call pannanum 
       // super(); //? verum super kudutha base class construcor call pannum 
        super("Ramesh");
        super.display();
        System.out.println(super.x);

    }
}

public class example1{
    public static void main(String[] args) {
        Derived obj = new Derived();
        
    }
}