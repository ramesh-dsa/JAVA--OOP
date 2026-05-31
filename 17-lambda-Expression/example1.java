//todo     Lambda expression 

//! Functional interface paathutu vantu etha paakanum 

//? Whenever the interface has only one abstract function 
//? Intha Lambda method use pannuvom 

interface A
{
    void disp();
}

public class example1{
    public static void main(String[] args) {
        A obj = ()->
        {
           System.out.println("Hello");
        };
        obj.disp();
    }
}