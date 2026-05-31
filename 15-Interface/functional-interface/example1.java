//todo             Functional Interface 


// namba default aa enna panuvom etha oru class create panni implement use panni 
// A class la erukura function aa use panuvom correct aa 

//! when namaku orey oru interface tha eruku orey oru  abstract function erunthalum paravala
//! eruntha intha functional interface use panalam 
interface A
{
    void disp();
    void hel();
}

public class example1{
    public static void main(String[] args) {
        //? lamba lala interface ku object create panna mudiyathu 
        // inga naama pannirukurathu oru inner class create aagum 
        //! intha class name is called anonymous class (old method)
        //* Lambda expression is new technique ... 
        A obj = new A(){
              public void disp()
              {
                System.out.println("hello");
              }

              public void hel()
              {
                System.out.println("And operation ");
              }
        };

        obj.disp();
    }
}

//! Etha paathutu lambda expression poi paaru 