class hospital
 {
    String hospitalName;
    String hospital_loc; // Aggregation
    doctor dr;
    hospital(String hospitalName, String hospital_loc,doctor dr)
     {
        this.hospitalName = hospitalName;
        this.hospital_loc=hospital_loc;
        this.dr = dr;
    }

    void displayhospital()
     {
         
        System.out.println("hospital name: " + hospitalName);
        System.out.println("hospital location:"+hospital_loc);
        dr.display();
    }
}
public class demo_aggregation
{
    public static void main (String args[])
    {
        doctor dr=new doctor("likitha","heart");
        hospital h=new hospital("apollo","bangalore",dr);
        h.displayhospital();
    }
}
