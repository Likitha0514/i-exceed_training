class Department
 {
    String deptname;
    String hod;
    Department(String deptname, String hod)
     {
        this.deptname = deptname;
        this.hod = hod;
       
    }

    public void displayDepartment() 
    {
        System.out.println("Department Name: " + deptname);
        System.out.println("HOD: " + hod);
        
    }
}

class Student extends Department
 {
    String studentName;
    int age;
    String city;

    Student(String deptname, String hod, String studentName, int age, String city) 
    {
        super(deptname, hod);// calling super class constructor
        super.hod="Naganna"; // super is used for giving values to variables in super class
        this.studentName = studentName;
        this.age = age;
        this.city = city;
    }

    public void displayStudent() 
    {
       
        super.displayDepartment(); // calling super class method
        System.out.println("Student Name: " + studentName);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
    }
}

public class demoinheritance
{
    public static void main(String[] args)
     {
        Student s1 = new Student("Computer Science", "Dr. kamalakshi", "Likitha", 22, "Bangalore");
        s1.displayStudent();
    }
}