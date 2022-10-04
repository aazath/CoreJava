public class Alien {
    String name;
    int age;
    String tech;


    public Alien()
    {
        System.out.println("In Constructor");
    }

    public Alien(String name, int age, String tech)
    {
        this.name = name;
        this.age    = age;
        this.tech = tech;
    }

    public void show ()
    {
        System.out.println("Name of the coder is: " +name);
        System.out.println("Age of the coder is: " +age);
        System.out.println("Tech of the coder is: " +tech);
    }
}
