public class HybirdEngine implements Engine{
    private ElectricEngine electricEngine;
    private GasEngine gasEngine;
    private int speed;

    public HybirdEngine(){
        electricEngine = new ElectricEngine();
        gasEngine = new GasEngine();
        speed = 0;
    }

    @Override
    public void increase(){
        if(speed < 50) electricEngine.increase();
        else gasEngine.increase();
        speed++;
    }

    @Override
    public void decrease(){
        if(speed < 50) electricEngine.decrease();
        else gasEngine.decrease();
        if(speed > 0)
            speed--;

    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public String getEngineType() {
        if(speed < 50) {
            return electricEngine.getEngineType();
        }
        else {
            return gasEngine.getEngineType();
        }
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
        if(speed < 50) {
            electricEngine.setSpeed(speed);
            gasEngine.setSpeed(0);
        }
        else {
            gasEngine.setSpeed(speed);
            electricEngine.setSpeed(0);
        }
    }
}
