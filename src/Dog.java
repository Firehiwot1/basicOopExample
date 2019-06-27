public class Dog extends Animal {

    public Dog() {
        //super();
        System.out.println("I am a dog");
    }


    @Override
    public String sleep() {
        return "A dog sleeps longer";
    }

    @Override
    public String eat() {
        return "A dog eats bone";
    }


    public String barks() {
        return "A dog barks";
    }
}