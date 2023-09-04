public class Main {
    public static void main(String[] args) {
        School mySchool = new School();

        // Create teachers and students
        Teacher teacher1 = new Teacher("Stuart", "Bartholomew", "Math");
        Teacher teacher2 = new Teacher("Chris", "Pratt", "Science");
        Teacher teacher3 = new Teacher("Anthony", "Padilla", "Biology");

        Student student1 = new Student("Lynn", "Takahae", 12);
        Student student2 = new Student("Mario", "Mario", 9);
        // Create more teachers and students as needed

        // Add teachers and students to the school
        mySchool.addTeacher(teacher1);
        mySchool.addTeacher(teacher2);
        mySchool.addTeacher(teacher3);

        mySchool.addStudent(student1);
        mySchool.addStudent(student2);
        // Add more teachers and students as needed

        // Display all teachers and students
        mySchool.showAllTeachers();
        mySchool.showAllStudents();

        // Remove teachers and students
        mySchool.deleteTeacher(teacher1);
        mySchool.deleteStudent(student1);

        // Display the lists again after removal
        mySchool.showAllTeachers();
        mySchool.showAllStudents();
    }
}
