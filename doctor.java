class doctor
 {
    String name;
    String specialization;

    doctor(String name, String specialization)
     {
        this.name = name;
        this.specialization = specialization;
    }
    public void display()
    {
        System.out.println("doctor name:"+name);
        System.out.println("Specialization:"+specialization);
    }
}