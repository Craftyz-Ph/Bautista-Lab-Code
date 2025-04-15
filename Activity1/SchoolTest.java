public class SchoolTest {
    public static void main(String[] args) {
        Student student = new Student("Alice", 101, "Grade 10");
        Teacher teacher = new Teacher("Mr. Smith", 202, "Mathematics");
        Staff staff = new Staff("Mrs. Clark", 303, "Administration");

        System.out.println("--- Student Info ---");
        student.displayInfo();
        System.out.println();

        System.out.println("--- Teacher Info ---");
        teacher.displayInfo();
        System.out.println();

        System.out.println("--- Staff Info ---");
        staff.displayInfo();
    }
}
