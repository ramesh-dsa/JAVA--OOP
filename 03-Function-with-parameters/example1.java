class store{
    void getchocolate(int money)
    {
        System.out.println("The money given by me is "+money);
        System.out.println("Chocolate purchased");
    }
}

public class example1
{
    public static void main(String[] args)
    {   
        store obj = new store();
        obj.getchocolate(20);
    }
}