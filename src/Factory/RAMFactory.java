package Factory;

public class RAMFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new RAM();
    }
}
