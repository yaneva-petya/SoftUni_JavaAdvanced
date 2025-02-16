package Excercises.ClassesAndObjects.RawData_04;

public class Tyre {
    private double pressure;
    private int age;

    public Tyre(double pressure,int age){
        setPressure(pressure);
        setAge(age);
    }
    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
