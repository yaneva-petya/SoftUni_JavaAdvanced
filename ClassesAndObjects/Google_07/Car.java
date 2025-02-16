package Excercises.ClassesAndObjects.Google_07;

public class Car {


    private String model;
    private int speed;

    public Car(String model,int speed ){
        setModel(model);
        setSpeed(speed);
    }
    public Car(){
        this.model = "";
        this.speed= 0;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return this.model.equals("")
                ? "Car:"
                : String.format("Car:\n%s %d", model, speed);

    }
}
