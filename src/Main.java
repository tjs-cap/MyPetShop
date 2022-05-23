import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat("Garfield",8,"Ginger");
        System.out.println(myCat.getColour());
        myCat.poops();

        var myDog = new Dog("Fido", 6,"Black");
        myDog.eats();

        var myCollie = new BorderCollie("Shep",9,"Black and white");
        System.out.println(myCollie.getName()+" has "+myCollie.getEyes());

        //Creating a Pet Shop Inventory List of Dogs and Cats
        ArrayList<Pet> petStore = new ArrayList<>();

        //Now for another form of polymorphism, using multiple classes within a single list
        //this only works when you are using sub-classes of a superclass.
        petStore.add(myCat);
        petStore.add(myDog);
        petStore.add(myCollie);

        System.out.println("\nMy pet store contains");
        for(Pet p: petStore){
            System.out.println(p.getName() + " is a " + p.getClass() + " and is " + p.getAge() + " years old.");
        }
    }
}