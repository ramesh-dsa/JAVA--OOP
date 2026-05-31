class greeting{
    void goodgreeting()
    {
        System.out.println("vanakam da mapula" );
        badgreeting();
    }

    void badgreeting()
    {
        System.out.println("nee kettavan ... ");
    }
}



public class function{
    public static void main(String[] args) {
       greeting obj = new greeting(); 
       obj.goodgreeting();
    }
}