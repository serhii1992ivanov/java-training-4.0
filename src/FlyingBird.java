public abstract class FlyingBird extends Bird {
    public void checkWings() {
        System.out.println("Checking the wings of the bird.");
    }

    @Override
    public String toString() {
        return "FlyingBird";
    }
}