public class Dog extends Pet {
    private String colour;
    private String eyes;
    public Dog(String name, int age, String colour) {
        super(name, age);
        this.colour = colour;
        this.eyes = "Puppy dog eyes";
    }


    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getEyes() {
        return eyes;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    public void poop(){
        System.out.println("Quite a lot!");
    }

    @Override
    public void eats() {
        System.out.println(getName()+ " " + "eats dog food!");
    }
}
