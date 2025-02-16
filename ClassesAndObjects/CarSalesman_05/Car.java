package Excercises.ClassesAndObjects.CarSalesman_05;


public class Car {
    private String model;
    private String engine;
    private int weight;
    private String color;

    public Car(String model, String engine, int weight, String color){
        setModel(model);
        setEngine(engine);
        setWeight(weight);
        setColor(color);
    }
    public Car(String model, String engine,  String color){
        setModel(model);
        setEngine(engine);
        this.weight=0;
        setColor(color);
    }
    public Car(String model, String engine, int weight){
        setModel(model);
        setEngine(engine);
        setWeight(weight);
        this.color="n/a";

    }
    public Car(String model, String engine){
        setModel(model);
        setEngine(engine);
        this.weight=0;
        this.color="n/a";

    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }



    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



}
