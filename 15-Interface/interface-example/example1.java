//todo                 Interface 

//*  interface is created same as class but class ku bathila replace interface 
// eg :  normal class ->   class Demo  ,  Interface ->   interface Demo  

//todo  we cannot create objects bro interface 
//? Interface la erukura ellam methods um abstract by default 
//! Interface does not have constructor 

//  next one class to another class inherit panna extends use panuvom 
//todo  where as in interface class Derived implements Demo 
//? here Demo is inheritance and Derived is a normal class 

//!  Data members in interface is 
//?   public static final 


interface Playable{
    void play();
}

class Guitar implements Playable
{

    // this same line la verum void play() kudutha error varum because class default aa private aa tha intha 
    // function aa aduthukum so lamba manual aa public podanum because anga abstract function is public 
    // apa atha use pandra child classes um public aa tha use pannanum ... 
      
   @Override
   public void play(){
      System.out.println("I am playing Guitar ");
   }
}

class Piano implements Playable
{
    @Override
    public void play()
    {
      System.out.println("I am playing piano");
    }
}

public class example1{
    public static void main(String[] args) {
        Guitar g1 = new Guitar();
        Piano p1 = new Piano();
        g1.play();
        p1.play();
    }
}

/*
Correct da 😎

todo     Java 7 varaikum interface-la methods ellam abstract by default. Body kudukka mudiyathu.

*   Aana Java 8 la irundhu 2 new types vanduchu:

?  1. Default Method

! Interface-kulle body kudukkalam using default.

interface Playable {

    default void play() {
        System.out.println("Playing...");
    }
}

?  Use:

class Guitar implements Playable {
}

public class Main {
    public static void main(String[] args) {
        Guitar g = new Guitar();
        g.play();
    }
}

Output:

Playing...
?                  2. Static Method

!   Interface-kulle static method-um body-oda kudukkalam.

interface Playable {

    static void show() {
        System.out.println("Static Method");
    }
}

Call:

Playable.show();
?  3. Private Method (Java 9+)

!  Interface-kulle helper method maari use panna.

interface Playable {

    private void helper() {
        System.out.println("Helper");
    }

    default void play() {
        helper();
    }
}

todo   Outside-la call panna mudiyathu.

?  Summary
*  Method Type	Body Allowed?	Keyword
*  Abstract Method	❌ No	Nothing (void play();)
*  Default Method	✅ Yes	default
*  Static Method	✅ Yes	static
*  Private Method (Java 9+)	✅ Yes	private

!  Exam-la ketta simple answer:

interface Demo {

    void m1();          // abstract

    default void m2() { }

    static void m3() { }

    private void m4() { }
}

!🎯 Interface methods are abstract by default, but from Java 8 onwards default and static methods can contain method bodies. From Java 9 onwards private methods can also contain method bodies.
*/