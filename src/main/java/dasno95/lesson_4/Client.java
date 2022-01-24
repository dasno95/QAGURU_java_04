package dasno95.lesson_4;

public class Client {

    String firstName, secondName;
    int age, alcoholLevel, alcoholCapacity;

    void sayHello() {
        System.out.println("Hello! My name is " + firstName + " " + secondName + ". I'm " + age + ".");
    }

    public int getAlcoholLevel() {
        return alcoholLevel;
    }

    void drink(Alcohol drink) {
        if (drink.typeOfDrink.equals("light")) {
            System.out.println("Mmm... Beer...");
            alcoholLevel = alcoholLevel + 1;
        }
        else if (drink.typeOfDrink.equals("medium")) {
            System.out.println("Gimme cocktail!");
            alcoholLevel = alcoholLevel + 2;
        }
        else if (drink.typeOfDrink.equals("strong")) {
            System.out.println("Uhh!");
            alcoholLevel = alcoholLevel + 3;
        }
    }

    void checkIn() {
        if (alcoholLevel < alcoholCapacity) {
            System.out.println("Let's have one more!");
            System.out.println();
        }
        else
            System.out.println("You're drunk! Go home.");
    }

}
