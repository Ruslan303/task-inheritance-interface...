public class Bmw extends Vehicle implements Carmethods   {
    public Bmw(String color, int speed) {
        super(color, speed);
    }

    @Override
    public void drive() {
        System.out.println("Bmw drive");

    }

    @Override
    public void gasoline() {
        System.out.println("Bmw gasoline");

    }

    @Override
    public void pickUpSpeed() {
        System.out.println("Bmw pick up speed");

    }

    @Override
    void display() {
        super.display();
    }

    @Override
    void speed() {
        super.speed();
    }
}
