public class Dog extends Animal {


    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("She likes the way that I move, she likes the way that I talk" +
                "GHRRRR...");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }

    @Override
    public void mood(boolean mood) {
        if (mood) {
            System.out.println("logrer med halen...");
        } else {
            System.out.println("ikke glad.. grrrr");
        }
    }
}
