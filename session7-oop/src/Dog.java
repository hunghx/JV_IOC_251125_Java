import ra.edu.Animal;

public class Dog extends Animal { // kế thừa từ lớp Animal
    public void logAge(){
        Animal animal = new Animal();
        animal.setSex("Đực");
        System.out.println("Dog sex " + animal.getSex());
    }
}
