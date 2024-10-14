public class Student {
    int rating;
    private String name;

    public static int studCount;
    public static double totalRating;
    public static double averageRating;
    // TODO implement Student class according to the instructions provided in the README.md file


    public Student(String name) {
        this.name = name;
        studCount++;     //TODO initialize name
    }


    public static double getAvgRating() {
        if (studCount != 0) {
            averageRating = (totalRating / studCount);
        }  // TODO return average     rating of all students
        return averageRating;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;       // TODO          set student's name
    }

    public int getRating() {
        return rating;
    }

    public int setRating(int rating) {
        this.rating = rating;
        totalRating += this.rating;
        return rating;          // TODO initialize rating;

    }

    public boolean betterStudent(Student student) {
        if (this.rating > student.rating) {
            return true;
        } else {
            return false;    // TODO return the result of comparing this.student's rating with the student's rating}
        }
    }

    public void changeRating(int rating) {
        totalRating -= this.rating;
        this.rating = setRating(rating);   // TODO change this student's rating and average rating of all students
    }

    public static void removeStudent(Student student) {
        studCount = 0;
        student.rating = 0;
        totalRating = 0;
        averageRating = 0;          //TODO remove student
    }

    @Override
    public String toString() {
        return name + " " + rating; // TODO return String with name and rating of this student

    }

    public static void main(String[] args) {
        Student s1 = new Student("Petro");
        s1.setRating(12);

        Student s2 = new Student("Mykola");
        s2.setRating(10);

        Student s3 = new Student("Hrisha");
        s3.setRating(11);

        System.out.println("Initial rating of " + s1.getName() + ": " + s1.getRating());
        System.out.println("Initial rating of " + s2.getName() + ": " + s2.getRating());
        System.out.println("Initial rating of " + s3.getName() + ": " + s3.getRating());

        System.out.println("Average rating of all students: " + Student.getAvgRating());
        
        s1.changeRating(20);

        // Display new rating and updated average rating
        System.out.println("New rating of " + s1.getName() + ": " + s1.getRating());
        System.out.println("Updated average rating of all students: " + Student.getAvgRating());
    }


}
