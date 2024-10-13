public class Student {
    int rating;
    private String name;

    // TODO implement Student class according to the instructions provided in the README.md file

    public Student(String name) {
        //TODO initialize name
    }

    public static double getAvgRating() {
        // TODO return average rating of all students
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // TODO set student's name
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        // TODO initialize rating;
    }

    public boolean betterStudent(Student student) {
        // TODO return the result of comparing this.student's rating with the student's rating
        return false;
    }

    public void changeRating(int rating) {
        // TODO change this student's rating and average rating of all students
    }

    public static void removeStudent(Student student) {
        // TODO remove student
    }

    @Override
    public String toString() {
        // TODO return String with name and rating of this student
        return "";
    }
    public static void main(String [] args) {
        Student s1 = new Student();
        s1.setName("Petro");
        s1.setRating(12);

        Student s2 = new Student();
        s2.setName("Mykola");
        s2.setRating(10);

        Student s3 = new Student();
        s3.setName("Hrisha");
        s3.setRating(11);
    }
}