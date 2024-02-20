package AbstractFactory.Website;

import AbstractFactory.Manager;

public class WebsitePM implements Manager {
    @Override
    public void manageProject() {
        System.out.println("Manager is managing (WEB)");
    }
}
