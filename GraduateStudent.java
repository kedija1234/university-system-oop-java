package university;

public class GraduateStudent extends Student {
    private String researchTopic;

    public GraduateStudent(String name, int age, String studentId, String researchTopic) {
        super(name, age, studentId);
        this.researchTopic = researchTopic;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Research Topic: " + researchTopic);
    }
}