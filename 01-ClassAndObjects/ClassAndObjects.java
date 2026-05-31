public class ClassAndObjects{

    String name = "";
    int age = 0 ;
    String clgname = "";
    int leetcodesolved = 0 ;
    public static void main(String[] args) {
        
        ClassAndObjects student1 = new ClassAndObjects();
        System.out.println("Student 1 : ");
        student1.name = "Ramesh";
        student1.age = 18 ;
        student1.clgname = "Nandha College of Technology";
        student1.leetcodesolved = 64 ;
        System.out.println("Name : "+student1.name);
        System.out.println("Age : "+student1.age);
        System.out.println("college : "+student1.clgname);
        System.out.println("leetcodesolved : "+student1.leetcodesolved);
        System.out.println();
        ClassAndObjects student2 = new ClassAndObjects();
        System.out.println("Student 2 : ");
        student2.name = "Yokesh";
        student2.age = 19 ;
        student2.clgname = "Nandha College of Technology";
        student2.leetcodesolved = 18 ;
        System.out.println("Name : "+student2.name);
        System.out.println("Age : "+student2.age);
        System.out.println("college : "+student2.clgname);
        System.out.println("leetcodesolved : "+student2.leetcodesolved);

    }
}