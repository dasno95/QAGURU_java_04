package dasno95.lesson_4;

public class TheBar {

    public static void main(String[] args) {

        Client man = new Client();

        man.firstName = "Mike";
        man.secondName = "Peterson";
        man.age = 45;
        man.alcoholLevel = 0;
        man.alcoholCapacity = 5;

        Alcohol beer = new Alcohol("light");
        Alcohol cocktail = new Alcohol("medium");
        Alcohol vodka = new Alcohol("strong");

        man.sayHello();

        man.drink(beer);
        System.out.println("I'm drunk on " + man.getAlcoholLevel() + " out of " + man.alcoholCapacity);
        man.checkIn();

        man.drink(vodka);
        System.out.println("I'm drunk on " + man.getAlcoholLevel() + " out of " + man.alcoholCapacity);
        man.checkIn();

        man.drink(cocktail);
        System.out.println("I'm drunk on " + man.getAlcoholLevel() + " out of " + man.alcoholCapacity);
        man.checkIn();
    }
}
