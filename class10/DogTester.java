package class10;

public class DogTester {
    public static void main(String[] args) {
        //Creating and obj from the Dog class
        Dog lunaObj = new Dog();
        //assigning a value to name using luna
        lunaObj.name = "Luna";
        lunaObj.gender = 'F';
        lunaObj.breed = "Shiba";
        lunaObj.age = 20;
        System.out.println(lunaObj.name);
        System.out.println(lunaObj.age);
        System.out.println(lunaObj.breed);
        // we are calling the bark method on lunaObj
        lunaObj.bark();
        lunaObj.eat();
        lunaObj.Sleep();
    }
}
