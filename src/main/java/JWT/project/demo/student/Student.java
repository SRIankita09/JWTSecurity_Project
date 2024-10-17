package JWT.project.demo.student;

public class Student {

    private final Integer studentId;
    private final String studentName;

    public String getStudentName() {
        return studentName;
    }

    public Integer getStudentId() {
        return studentId;
    }


    public Student(Integer studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }


}
