package ra.edu;

public class Cat {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "Tom";
        animal.age = 18;
        System.out.println("Animal Name: " + animal.name);
        System.out.println("Animal Age: " + animal.age);
    }
}
