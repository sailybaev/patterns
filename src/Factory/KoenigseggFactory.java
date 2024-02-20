package Factory;

public class KoenigseggFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Koenigsegg();
    }
}
