public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat("Garfield",8,"Ginger");
        System.out.println(myCat.getColour());
        myCat.poops();

        var myDog = new Dog("Fido", 6,"Black");
        myDog.eats();
        //System.out.println(myDog.getName() + " " + );
    }
}