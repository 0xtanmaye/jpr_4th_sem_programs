public class Car {
    String make;
    String model;
    int year;
    
    // Default constructor
    public Car() {
        this.make = "Unknown";
        this.model = "Unknown";
        this.year = 0;
    }
    
    // Parameterized constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    public static void main(String[] args) {
        // Creating an instance of Car using default constructor
        Car car1 = new Car();
        System.out.println("Car 1 Make: " + car1.make);     // Output: Car 1 Make: Unknown
        System.out.println("Car 1 Model: " + car1.model);   // Output: Car 1 Model: Unknown
        System.out.println("Car 1 Year: " + car1.year);     // Output: Car 1 Year: 0
        
        // Creating an instance of Car using parameterized constructor
        Car car2 = new Car("Ford", "Mustang", 2022);
        System.out.println("Car 2 Make: " + car2.make);     // Output: Car 2 Make: Ford
        System.out.println("Car 2 Model: " + car2.model);   // Output: Car 2 Model: Mustang
        System.out.println("Car 2 Year: " + car2.year);     // Output: Car 2 Year: 2022
    }
}
