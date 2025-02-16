package Excercises.ClassesAndObjects.RawData_04;

public class Engine {


    private int engineSpeed;
    private int enginePower;

    public Engine(int engineSpeed,int enginePower){
        setEngineSpeed(engineSpeed);
        setEnginePower(enginePower);
    }
    public int getEngineSpeed() {
        return engineSpeed;
    }

    public void setEngineSpeed(int engineSpeed) {
        this.engineSpeed = engineSpeed;
    }
    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }


}
