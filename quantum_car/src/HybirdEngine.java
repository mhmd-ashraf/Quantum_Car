public class HybirdEngine implements Engine{

    private ElectricEngine electricEngine;
    private GasEngine gasEngine;
    private int speed;
    private Engine runningEngine;

    public HybirdEngine(){
        electricEngine = new ElectricEngine();
        gasEngine = new GasEngine();
        runningEngine = electricEngine;
        speed = 0;
    }

    @Override
    public void increase(){
        checkRunningEngine();
        speed++;
        runningEngine.increase();
    }

    @Override
    public void decrease(){
        if(speed > 0) {
            speed--;
            runningEngine.decrease();
            checkRunningEngine();
        }


    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public String getEngineType() {
        return runningEngine.getEngineType();
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
       checkRunningEngine();
       runningEngine.setSpeed(speed);
    }

    private void checkRunningEngine(){
        if(speed <= 50) {
            electricEngine.setSpeed(speed);
            gasEngine.setSpeed(0);
            runningEngine = electricEngine;
        }
        else {
            gasEngine.setSpeed(speed);
            electricEngine.setSpeed(0);
            runningEngine = gasEngine;
        }
    }
}
