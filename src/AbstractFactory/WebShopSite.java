package AbstractFactory;

import AbstractFactory.Website.WebsiteTeamFactory;

public class WebShopSite {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        Manager manager = projectTeamFactory.getManager();

        System.out.println("Webiste...");
        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}
