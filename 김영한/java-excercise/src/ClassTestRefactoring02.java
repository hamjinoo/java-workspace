
//7번째


public class ClassTestRefactoring02 {

    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 15, "문과");
        printStudent(student1);
    }

    static Student createStudent(String name, int age, String major) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.major = major;

        return student;
    }

    static void printStudent(Student student) {
        System.out.println("학생 메모리는 : " + student + "   학생 이름 : " + student.name + "   나이 : " + student.age + "   전공 : " + student.major);
    }
}
