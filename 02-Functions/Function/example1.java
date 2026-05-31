class Addition{
    int a = 10 ;
    int b = 20 ;

    void sum()
    {
      System.out.println("The sum is "+(a+b));
    }
}

public class example1{
    public static void main(String[] args) {
        Addition obj = new Addition();
        obj.sum();
    }
}