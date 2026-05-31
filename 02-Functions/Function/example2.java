class Garden{
    int apple_price=20;
    int apple_count = 5;

    void total_money()
    {
        System.out.println("Total price : "+(apple_price*apple_count));
    }
}

public class example2{
    public static void main(String[] args) {
        Garden obj = new Garden();
        obj.total_money();
    }
}