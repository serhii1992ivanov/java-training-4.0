public abstract class Bird {
    public void eat() {
        System.out.println("The bird is eating.");
    }

    @Override
    public abstract String toString(); // Abstract method for toString
}
