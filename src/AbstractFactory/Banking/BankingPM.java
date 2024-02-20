package AbstractFactory.Banking;

import AbstractFactory.Manager;

public class BankingPM implements Manager {
    @Override
    public void manageProject() {
        System.out.println("Manager in managing");
    }
}
