class Student {
     int marks = 0 ;
     void setValue(int marks)
     {
          marks = marks ;
          System.out.println(marks);
          this.marks = marks;
          System.out.println(this.marks);
     }
}
public class example{
    public static void main(String[] args) {
        Student obj = new Student();
        System.out.println(obj.marks);
        obj.setValue(45);
        System.out.println(obj.marks);


    }
}