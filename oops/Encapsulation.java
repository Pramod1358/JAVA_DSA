class Car {          
    private String colour;
    private int speed;

    Car(String colour, int speed) {
        this.colour = colour;
        this.speed = speed;
    }

    public String getColour() {
        return colour;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Car c1 = new Car("red", 120);
        System.out.println(c1.getColour());
    }
}
