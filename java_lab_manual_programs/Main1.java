class Animal {
    public void move() {
        System.out.println("The animal is moving.");
    }
}

class Dog extends Animal {	
    public void move() {
        super.move();
        System.out.println("The dog is running.");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.move();

        Dog dog = new Dog();
        dog.move();
    }
}
