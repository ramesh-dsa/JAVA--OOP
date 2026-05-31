class Student {
    int marks ;
    String name ;

    Student(int a , String b )
    { 
        marks = a ;
        name = b ;
    }

}
public class example1{
    public static void main(String[] args){
        Student obj = new Student(45,"Ramesh");
        System.out.println(obj.marks);
        System.out.println(obj.name);
    }
}