class Addition{
    int add(int a , int b )
    {
        return a+b;
    }
}

public class example1{
    public static void main(String[] args) {
        Addition obj = new Addition();
        System.out.println("The Addition is "+obj.add(50,60)); 
    }
}