class addition
{
    void sum(int a, int b)
    {
        System.out.println("sum="+(a+b));
    }
    void sum(int a, int b,int c)
    {
        System.out.println("sum="+(a+b+c));
    }

}
public class methodoverload
{
    public static void main(String args[])
    {
        addition a=new addition();
        a.sum(10,100);
        a.sum(10,10,10);
    }
}