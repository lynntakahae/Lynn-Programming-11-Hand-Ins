public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;

    public Teacher(String firstName, String lastName, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    // Implement getters and setters for firstName, lastName, and subject

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + " Subject: " + subject;
    }
}
