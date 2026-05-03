package university;

public class MainApp {
    public static void main(String[] args) {

        
        Person p1 = new Student("Abel", 20, "S101");
        Person p2 = new GraduateStudent("Sara", 25, "S202", "AI Research");
        Person p3 = new Teacher("Dr. Hana", 40, "Computer Science");

        p1.displayInfo();
        System.out.println("-------------");

        p2.displayInfo();
        System.out.println("-------------");

        p3.displayInfo();
        System.out.println("-------------");

        
        Person[] people = {
            new Student("Abel", 20, "S101"),
            new GraduateStudent("Sara", 25, "S202", "AI"),
            new Teacher("Dr. Hana", 40, "CS")
        };

        for (Person p : people) {
            p.displayInfo();
            System.out.println("-----");
        }

        
        Teacher.schoolType();

        
        Admin admin = new Admin();
        admin.role();

        
        Utility util = new Utility();
        util.showMessage();
    }
}