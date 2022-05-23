public class Cat extends Pet {
    String colour;

    public Cat(String name, int age, String colour) {
        super(name, age);
        this.colour = colour;
    }

    @Override
    public void eats() {
        System.out.println(getName() + " " + "eats cat food!");
    }

    @Override
    public void poops(){
        System.out.println("FLOP!");
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
