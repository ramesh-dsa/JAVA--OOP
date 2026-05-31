interface Readable
{
    void read();
}
interface Writeable
{
    void write();
}
interface Storable
{
    void store();   
}

class File implements Readable,Writeable,Storable
{
@Override
   public void read()
    {
        System.out.println("The contents of file");
    }

@Override
   public void write()
    {
        System.out.println("We can write in a file");
    }

@Override
   public void store()
    {
        System.out.println("We can write and store ");
    }
}

public class example3
{
    public static void main(String[] args) {
       File obj = new File();
       obj.read();
       obj.write();
       obj.store();
    }
}