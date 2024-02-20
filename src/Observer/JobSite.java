package Observer;

import java.util.ArrayList;
import java.util.List;

public class JobSite implements Observed{
    List<String> vac = new ArrayList<>();
    List<Observer> subscribers = new ArrayList<>();

    public void addVac(String vacc) {
        this.vac.add(vacc);
        notifyObservers();
    }

    public void removeVac(String vacc) {
        this.vac.remove(vacc);
        notifyObservers();
    }
    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer:subscribers){
            observer.handleEvent(this.vac);
        }
    }
}
