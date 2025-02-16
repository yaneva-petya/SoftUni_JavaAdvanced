package Excercises.ClassesAndObjects.CarSalesman_05;

public class Engine {
    private String engineModel;
    private int power;
    private int displacement;
    private String efficiency;

    public Engine(String model, int power, int displacement,String efficiency){
        setEngineModel(model);
        setPower(power);
        setDisplacement(displacement);
        setEfficiency(efficiency);
    }
    public Engine(String model, int power, int displacement){
        setEngineModel(model);
        setPower(power);
        setDisplacement(displacement);
        this.efficiency="n/a";

    }
    public Engine(String model, int power,String efficiency){
        setEngineModel(model);
        setPower(power);
        this.displacement=0;
       setEfficiency(efficiency);
    }
    public Engine(String model, int power){
        setEngineModel(model);
        setPower(power);
        this.displacement=0;
        this.efficiency="n/a";
    }
    public String getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }

    public String getEngineModel() {
        return engineModel;
    }

    public void setEngineModel(String model) {
        this.engineModel = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }


    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Power: " + this.power + "\n");
        if(this.displacement == 0) {
            stringBuilder.append("Displacement: n/a" + "\n");
        } else {
            stringBuilder.append("Displacement: " + this.displacement + "\n");
        }
        stringBuilder.append("Efficiency: " + this.efficiency);
        return stringBuilder.toString();
    }

}
