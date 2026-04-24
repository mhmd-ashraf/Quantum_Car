public class CarFactory {

    public Engine createEngine(String engineType){
        switch (engineType){
            case "Gas": return new GasEngine();
            case "Electric": return new ElectricEngine();
            case "Hybird": return new HybirdEngine();
        }
        return null;
    }

    public Car createCar(String engineType){
        return new Car(createEngine(engineType));
    }

    public void replaceEngine(Car car, Engine engine){
        car.setEngine(engine);
    }

    public void replaceEngine(Car car, String engineType){
        car.setEngine(createEngine(engineType));
    }
}
