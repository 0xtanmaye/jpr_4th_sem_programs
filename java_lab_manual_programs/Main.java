class Animal {
    public void display() {
        System.out.println("This is an animal.");
    }
}

class Cat extends Animal {
    @Override
    public void display() {
        System.out.println("This is a cat.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.display();  // output: "This is an animal."

        Cat cat = new Cat();
        cat.display();  // output: "This is a cat."

        Animal anotherAnimal = new Cat();
        anotherAnimal.display();  // output: "This is a cat."
    }
}
