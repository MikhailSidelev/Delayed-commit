package class10;

public class CarTester {
    public static void main(String[] args) {
        Car bmw=new Car();
        bmw.make="BMW";
        bmw.model="17";
        bmw.price=100000;
        bmw.moveForward();
        bmw.applyBrakes();
    }
}
