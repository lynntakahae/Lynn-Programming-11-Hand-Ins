public class Student {
    private String firstName;
    private String lastName;
    private int grade;
    private int studentNumber;

    public Student(String firstName, String lastName, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        // Generate a unique studentNumber here
    }

    // Implement getters and setters for firstName, lastName, grade, and studentNumber

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + " Grade: " + grade + " Student Number: " + studentNumber;
    }
}
