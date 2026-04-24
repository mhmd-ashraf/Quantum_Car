public class Car {

    private Engine engine;
    private int speed = 0;
    public Car(Engine engine){
        this.engine = engine;
    }

    public String getEngine() {
        return engine.getEngineType();
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        speed = 0;
        engine.setSpeed(0);
        System.out.println("The car started at speed : " + speed + "KM/H and with engine : " + engine.getEngineType());
    }

    public void stop(){
//        while (engine.getSpeed() > 0) {
//            engine.decrease();
//        }
        speed = 0;
        engine.setSpeed(0);
        System.out.println("The car stopped at speed : " + speed + " KM/H and with engine : " + engine.getEngineType());
    }

    public void accelerate(){
        if(speed + 20 <= 200) {
//            for (int i=0;i<20;i++)engine.increase();
            speed += 20;
        }
        else speed = 200;
        engine.setSpeed(speed);
        System.out.println("The speed after accelerating is : " + speed + " KM/H and with engine : " + engine.getEngineType());
    }

    public void breakSpeed(){
        if (speed - 20 >= 0) {
            speed -= 20;
        }
        else speed = 0;
        engine.setSpeed(speed);
        System.out.println("The speed after breaking is : " + speed + " KM/H and with engine : " + engine.getEngineType());
    }
}
