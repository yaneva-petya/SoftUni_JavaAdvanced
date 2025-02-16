package Lectures.ClassesAndObjects.CarClass;

public class Car {
    private String brand;
    private String model;
    private int horsePower;

    public Car(String brand, String model, int horsePower){
        setBrand(brand);
        setModel(model);
       if(!setHorsePower(horsePower)){
           System.out.println("Invalid horse power!");
       }
    }
    public  String getBrand(){
        return brand ;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public  String getModel(){
        return model ;
    }
    public void setModel(String model){
        this.model=model;
    }
    public  int getHorsePower(){

        return horsePower;
    }
    public boolean setHorsePower(int horsePower) {
        if (horsePower <= 0) {
            return false;
        } else {
            this.horsePower = horsePower;
            return true;
        }

    }


    @Override
    public String toString() {
        return  "The car is: "+this.brand+this.brand+ " - "+ this.horsePower+" HP. " ;
    }
}
