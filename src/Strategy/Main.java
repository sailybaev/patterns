package Strategy;

public class Main {

    public static void main(String[] args) {
        Human man = new Human();

        man.setActivity(new Eating());
        man.executeActivity();

        man.setActivity(new Coding());
        man.executeActivity();

        man.setActivity(new Cooking());
        man.executeActivity();

        man.setActivity(new Reading());
        man.executeActivity();

    }

}
