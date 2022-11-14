public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();

    @Override
    public String toString() {
        return name;
    }
}
