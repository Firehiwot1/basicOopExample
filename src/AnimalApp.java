
    public class AnimalApp {

        public static void main(String[] args) {

            Animal a = new Animal(); // new object created
            print(a.eat());
            print(a.sleep());

            Cat c = new Cat();
            print(c.eat());
            print(c.sleep());
            print(c.purr());


            Bird b = new Bird();
            print(b.eat());
            print(b.sleep());
            print(b.fly());

            Dog d = new Dog();
            print(d.eat());
            print(d.sleep());
            print(d.barks());

            Mouse m = new Mouse();
            print(m.eat());
            print(m.sleep());
            print(m.runs());

        }

        private static void print(String s) {
            System.out.println(s);
        }
    }

    //Create 2 more animal classes (i.e. Dog, Mouse, etc.) and extend the animal class to verify your understanding.
    // Q1Where is the method executing encapsulation?
    // Encapsulation is not used.
    //Q2 Inheritance is used:cat, birds, dog and mouse inherited from animal class.