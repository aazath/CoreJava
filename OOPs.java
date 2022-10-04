public class OOPs {
    public static void main(String[] args) {

        Alien a1 = new Alien();

        a1.name ="Aazath";
        a1.age  = 30;
        a1.tech = "Java";

        a1.show();

        Alien a2 = new Alien("Ayana",8, "Drawing");
        a2.show();
    }
}
