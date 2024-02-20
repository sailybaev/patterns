package Factory;

public class LadaFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Lada();
    }
}
