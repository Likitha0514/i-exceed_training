interface college
{
    String college_name="sce"; // static and final variables
    String area="bangalore";
    public void display(); // abstract methods
}
interface department
{
    String dept_name="cse";
    String hod="kamalakshi";
    public void display(); //method overriding
}
interface student
{
    String name="liki";
    int age=22;
    public void display();
}
class demo implements college,department,student
{
    public void display()
    {
        System.out.println("name:"+name);
        System.out.println("age:"+age);

        System.out.println("dept:"+dept_name);
        System.out.println("college name:"+college_name);
    }
}
public class demo_interface
{
    public static void main (String args[])
    {
        demo obj=new demo();
        obj.display();
    }
}