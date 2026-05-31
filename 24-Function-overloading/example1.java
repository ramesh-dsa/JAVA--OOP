class MathHelper{
    int add(int a, int b )
    {
        return a+b ;
    }
    int add(int a, int b , int c)
    {
        return a+b+c;
    }
     double add(double a,double b )
    {
        return a+b ;
    }
}
public class example1{
    public static void main(String[] args) {
        MathHelper obj = new MathHelper();
        System.out.println("Addition of two integer numbers : "+obj.add(10,20));
        System.out.println("Addition of three integer numbers : "+obj.add(10,20,20));
        System.out.println("Addition of two Double numbers : "+obj.add(10.2,20.54));
    }
}