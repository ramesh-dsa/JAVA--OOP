        class Person
        {
            String name ;
            int age ;

            Person(String name ,int age )
            {
            this.name = name ;
            this.age = age ;
            }

            void introduce()
            {
                System.out.println("Name : "+name);
                System.out.println("Age : "+age);
            }
        }
        class Student extends Person
        {
            String college ; 
            int marks ; 
            Student(String name , int age , String college , int marks)
            {
                super(name,age);
                this.college=college;
                this.marks=marks;
            }
            @Override
            void introduce()
            {
                super.introduce();
                System.out.println("College : "+college);
                System.out.println("Marks : "+marks);
            }
        }

        public class example3{
            public static void main(String[] args) {
                Student s = new Student("Ramesh",45,"Nandha college of technology ",467);
                s.introduce();
            }
        }