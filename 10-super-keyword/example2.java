class Person{
    String name ;
    Person(String nam)
    {
        name = nam ;
    }
}
class Employee extends Person{
    String employeeld ;

     Employee() {
        super("Ramesh");
        display();
    }
    void display()
    {
        System.out.println(name);
    }
}

public class example2{
    public static void main(String[] args) {
        Employee obj = new Employee();
    }
}