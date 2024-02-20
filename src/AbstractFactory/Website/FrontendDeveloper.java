package AbstractFactory.Website;

import AbstractFactory.Developer;

public class FrontendDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Writes frontend");
    }
}
