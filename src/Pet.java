public abstract class Pet {
    private final String name;
    private int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void makeNoise(){
        System.out.println("Makes noises!");
    }

    public abstract void eats();

    public void sleep(){
        System.out.println("I am sleeping!");
    }

    public void moves(){
        System.out.println(name + " is moving around");
    }

    public void poops(){
        System.out.println("PRTTPERPTP!");
    }
}
