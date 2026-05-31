interface Playable
{
    void play();
}
interface Chargeable 
{
    void charge();
}
class Playstation implements Playable , Chargeable
{
    @Override
    public void play()
    {
        System.out.println(" Playing games  ");
    }
    @Override
    public void charge()
    {
        System.out.println("Charging controller");
    }
}
public class example2{
    public static void main(String[] args) {
        Playstation obj = new Playstation();
        obj.play();
        obj.charge();
    }
}