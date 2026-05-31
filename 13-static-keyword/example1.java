class counter{
    static int count;
    String name ;
    counter(String name)
    {
      this.name=name;
       count++;
    }
    static int getCount()
    {
        return count;
    }
}
public class example1{
    public static void main(String[] args) {
        counter c1 = new counter("Ramesh1");
        counter c2 = new counter("Ramesh2");
        counter c3 = new counter("Ramesh3");

        System.out.println(c1.name);
        System.out.println(c2.name);
        System.out.println(c3.name);

        System.out.println("Total count created : "+counter.getCount());
        

    }
}