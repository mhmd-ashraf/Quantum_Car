public class Car {

    private Engine engine;
    private int speed = 0;
    private boolean started = false;

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
        if(started) System.out.println("The car already started");
        else {
            speed = 0;
            started = true;
            engine.setSpeed(0);
            System.out.println("The car started at speed : " + speed + "KM/H and with engine : " + engine.getEngineType());
        }
    }

    public void stop(){
        if (started){
            if (speed == 0){
                started = false;
                engine.setSpeed(0);
                System.out.println("The car stopped at speed : " + speed + " KM/H and with engine : " + engine.getEngineType());
            }
            else {
                System.out.println("The speed should be 0 KM/H , Please break then stop");
            }
        }
        else {
            System.out.println("The car already stopped");
        }
    }

    public void accelerate(){
        if(started){
            if(speed < 200) {
                for (int i=0;i<20;i++) engine.increase();
                speed += 20;
                engine.setSpeed(speed);
                System.out.println("The speed after accelerating is : " + speed + " KM/H and with engine : " + engine.getEngineType());
            }
            else System.out.println("Speed reached at max 200 KM/H");

        }
        else System.out.println("The car already stopped, please start it");
    }

    public void breakSpeed(){
        if (started) {
            if (speed > 0) {
                for (int i=0;i<20;i++) engine.decrease();
                speed -= 20;
                engine.setSpeed(speed);
                System.out.println("The speed after breaking is : " + speed + " KM/H and with engine : " + engine.getEngineType());
            } else {
                stop();
            }
        }
        else System.out.println("The car already stopped, please start it");
    }

    public void replaceEngine(Engine engine){
        if (started){
            System.out.println("Cannot replace engine through running current engine, Please Breake and stop current engine.");
        }
        else {
            this.engine = engine;
            System.out.println("Replaced!!!!");
        }
    }
}
