package Observer;

import java.util.List;

public class Subscriber implements Observer{
    String name;
    public Subscriber(String name) {
        this.name = name;
    }
    @Override
    public void handleEvent(List<String> vac) {
        System.out.println("Hello !" + name);
        System.out.println(vac);
        System.out.println("=========================");
    }


}
