
//6번째

public class ClassTestRefactoring01 {

    public static void main(String[] args) {

        Student student1 = new Student();
        initStudent(student1, "학생1", 15, "문과");
        printStudent(student1);

        Student student2 = new Student();
        initStudent(student2, "학생2", 16, "이과");
        printStudent(student2);
    }

    static void initStudent(Student student, String name, int age, String major) {
        student.name = name;
        student.age = age;
        student.major = major;
    }

    static void printStudent(Student student) {
        System.out.println("학생 메모리는 : " + student + "   학생 이름 : " + student.name + "   나이 : " + student.age + "   전공 : " + student.major);
    }
}
