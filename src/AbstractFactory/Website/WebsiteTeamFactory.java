package AbstractFactory.Website;

import AbstractFactory.Developer;
import AbstractFactory.Manager;
import AbstractFactory.ProjectTeamFactory;
import AbstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new FrontendDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public Manager getManager() {
        return new WebsitePM();
    }
}
