import java.util.List;

public class Zoo {

    // Feeds different bird sections of the zoo.
    public static void feed(List<? extends Bird> list) {
        System.out.println("Feeding birds:");
        for (Bird bird : list) {
            bird.eat(); // Call eat() method for each bird
        }
    }

    // Adds birds to a flying section of the zoo.
    public static void acceptBird(List<FlyingBird> list, FlyingBird bird) {
        System.out.println("Accepting a bird to the flying section:");
        bird.checkWings(); // Check wings of the bird
        list.add(bird); // Add bird to the list
        System.out.println(bird + " has been added to the flying section.");
    }

    // Adds bird to the general list.
    public static void registerBird(List<Bird> list, Bird newBird) {
        System.out.println("Adding a bird to the birds list:");
        list.add(newBird); // Add bird to list
        System.out.println(newBird + " has been added to the birds list.");
        System.out.println("Current birds in the list:");
        for (Bird bird : list) {
            System.out.println(bird);
        }
    }

}