package university;

public class Student extends Person {
    protected String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age); 
        this.studentId = studentId;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); 
        System.out.println("Student ID: " + studentId);
    }
}