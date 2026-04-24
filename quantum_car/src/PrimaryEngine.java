public abstract class PrimaryEngine implements Engine{
    int speed = 0;

    public PrimaryEngine() {
        speed=0;
    }

    @Override
    public void increase(){
        speed++;
        System.out.println("The Speed of the " + getEngineType() + " is increased +1 and now speed is " + speed + " KM/H");
    }

    @Override
    public void decrease(){
        if(speed > 0) {
            speed--;
            System.out.println("The Speed of the " + getEngineType() + " is decreased -1 and now speed is " + speed + " KM/H");
        }
        else System.out.println("Cannot decrease speed it is now 0 KM/H");
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String getEngineType(){
        return "Primary Engine";
    }

//    public String getEngineName(){
//        return "Primary Engine";
//    }
}
