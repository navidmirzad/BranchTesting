public class Cat extends Animal {


    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("nyan nyan nyan");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }

    @Override
    public void mood() {
        System.out.println("Sleepy is content");
    }
}
