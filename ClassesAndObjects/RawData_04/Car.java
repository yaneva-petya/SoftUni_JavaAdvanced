package Excercises.ClassesAndObjects.RawData_04;

import java.util.List;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private List<Tyre> tyres;


    public Car(String model, Engine engine, Cargo cargo, List<Tyre> tyres){
        setModel(model);
        setEngine(engine);
        setCargo(cargo);
        setTyres(tyres);
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public List<Tyre> getTyres() {
        return tyres;
    }

    public void setTyres(List<Tyre> tyres) {
        this.tyres = tyres;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

}
