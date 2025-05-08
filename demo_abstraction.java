abstract class vehicles
{
    abstract public void fuel();
    abstract public void color();
    public void max_speed()
    {
        System.out.println("maximum speed is 80km/hr");
    }
}
class car extends vehicles
{
   public void fuel()
   {
    System.out.println("car fuel type is petrol");

   }
   public void color()
   {
    System.out.println("car color is black");

   }

}
class truck extends vehicles
{
   public void fuel()
   {
    System.out.println("truck fuel type is petrol");

   }
   public void color()
   {
    System.out.println("truck color is black");

   }

}
public class demo_abstraction
{
    public static void main(String args[])
    {
        car c=new car();
        c.fuel(); 
        c.color();
        c.max_speed(); //we can call the methods of super class(which are not abstract) from the object of derived class
        // same can be used for calling truck methods
        truck t=new truck();
        t.fuel();
        t.color();
        t.max_speed();
    }
}