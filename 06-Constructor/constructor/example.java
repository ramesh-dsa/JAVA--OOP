class Student {
    String name ;
    int marks ;
    Student()
    {
        System.out.println("COnstructor is called automatically when object of class is created ");
    }

}
public class example{
    public static void main(String[] args) {
        Student obj = new Student();
        //! if 
        int marks ; 
        int id ;
        //todo here nan etha print panna error vaarum bcz not initialised 
        // System.out.println(marks);
        // System.out.println(id);

        //? Ethey object vechu call pannen nu vechuko mela erukura 
        // variables which is also not initialised no error comes 

        System.out.println(obj.name);
        System.out.println(obj.marks);
    }
}