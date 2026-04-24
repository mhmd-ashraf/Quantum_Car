//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car car = carFactory.createCar("Gas");

        car.start();
        car.accelerate();
        car.accelerate();
        car.breakSpeed();
        car.breakSpeed();
        car.stop();

        System.out.println("====================================");
        Car car2 = carFactory.createCar("Hybird");
        car2.start();
        car2.accelerate();//20
        car2.accelerate();//40
        car2.accelerate();//60
        car2.accelerate();//80
        car2.breakSpeed();//60
        car2.breakSpeed();//40
        car2.stop();
        car2.breakSpeed();//20
        car2.breakSpeed();//stopped
        car2.breakSpeed();

        System.out.println("====================================");
        carFactory.replaceEngine(car , "Electric");

    }
}