public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Sleepy is the name of my cat");
        Dog dog = new Dog("Snow is the name of my dog");

        System.out.println(cat);
        System.out.println(dog);

        cat.makeSound();
        dog.makeSound();

        cat.eat("Fish");
        cat.eat("proteinbars");

        cat.mood(true);
        dog.mood(true);

    }
}
