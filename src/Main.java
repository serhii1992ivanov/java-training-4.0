import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Bird> allBirds = new ArrayList<>();
    List<FlyingBird> flyingBirds = new ArrayList<>();

    // Create instances of birds
    Bird eagle = new Eagle();
    Bird swallow = new Swallow();
    Bird penguin = new Penguin();
    Bird kiwi = new Kiwi();

    // Register birds
    Zoo.registerBird(allBirds, eagle);
    Zoo.registerBird(allBirds, swallow);
    Zoo.registerBird(allBirds, penguin);
    Zoo.registerBird(allBirds, kiwi);

    // Feed all birds
    Zoo.feed(allBirds);

    // Accept birds into the flying section
    Zoo.acceptBird(flyingBirds, (FlyingBird) eagle);
    Zoo.acceptBird(flyingBirds, (FlyingBird) swallow);
    // Uncommenting the following lines will cause a compile-time error as they are non-flying birds
    // Zoo.acceptBird(flyingBirds, (FlyingBird) penguin);
    // Zoo.acceptBird(flyingBirds, (FlyingBird) kiwi);
  }
}