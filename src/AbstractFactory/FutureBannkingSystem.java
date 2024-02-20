package AbstractFactory;

import AbstractFactory.Banking.BankingTeamFactory;

public class FutureBannkingSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        Manager manager = projectTeamFactory.getManager();

        System.out.println("Banking...");
        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}
