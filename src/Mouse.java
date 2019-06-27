public class Mouse extends Animal  {

    public Mouse() {

        System.out.println("I am a mouse");

    }
    @Override
    public String sleep() {
        return "A mouse sleeps ...";
}

    @Override
    public String eat() {
        return "A mouse eats a lot";
    }

    public String runs(){
            return"A mouse runs fast ";
}
}
