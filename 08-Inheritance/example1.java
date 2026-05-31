class father{
      int money = 2000 ;
}
class son extends father{

}
public class example1{
    public static void main(String[] args) {
        son obj = new son();
        System.out.println(obj.money);
    }
}