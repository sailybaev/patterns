package AbstractFactory.Website;

import AbstractFactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual Tester is testing");
    }
}
