package Excercises.ClassesAndObjects.RawData_04;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

       List<Car> carList=new ArrayList<>();

        int n=Integer.parseInt(s.nextLine());
        for (int i=0;i<n;i++){
            String[] input=s.nextLine().split("\\s+");

            String model=input[0];

            int engineSpeed=Integer.parseInt(input[1]);
            int enginePower=Integer.parseInt(input[2]);

            Engine engine=new Engine(engineSpeed, enginePower);

            int cargoWeight=Integer.parseInt(input[3]);

            //"fragile" or "flamable"
            String cargoType=input[4];

            Cargo cargo=new Cargo(cargoWeight, cargoType);

            double tyrePressure1=Double.parseDouble(input[5]);
            int tyreAge1=Integer.parseInt(input[6]);
            Tyre tyre1=new Tyre(tyrePressure1,tyreAge1);

            double tyrePressure2=Double.parseDouble(input[7]);
            int tyreAge2=Integer.parseInt(input[8]);
            Tyre tyre2=new Tyre(tyrePressure2, tyreAge2);

            double tyrePressure3=Double.parseDouble(input[9]);
            int tyreAge3=Integer.parseInt(input[10]);
            Tyre tyre3=new Tyre(tyrePressure3, tyreAge3);

            double tyrePressure4=Double.parseDouble(input[11]);
            int tyreAge4=Integer.parseInt(input[12]);
            Tyre tyre4=new Tyre(tyrePressure4, tyreAge4);

            List<Tyre> tyres=List.of(tyre1,tyre2,tyre3,tyre4);
            Car car=new Car(model, engine, cargo, tyres);

           carList.add(car);

        }

        String command=s.nextLine();
        //Car currentCar=carMap.get(command);
        for (Car car:carList){
            if(command.equals("fragile")){
                if(car.getCargo().getCargoType().equals("fragile")){
                //print all cars whose Cargo Type is "fragile"
                // with a tire whose pressure is  < 1

                    boolean isHadPressureUnder1=getPressure(car);
                    if(isHadPressureUnder1){
                        System.out.println(car.getModel());
                    }
                }

            }else {
                //print all cars whose Cargo Type is "flamable"
                // and have Engine Power > 250
                if(car.getCargo().getCargoType().equals("flamable")){
                    boolean isHadEnginePowerOver250=getEnginePower(car);
                    if(isHadEnginePowerOver250){
                        System.out.println(car.getModel());
                    }
                }
            }
        }

    }

    public static boolean getPressure(Car currentCar) {

        List<Tyre> tyres=currentCar.getTyres();
        for (Tyre tyre:tyres){
            if(tyre.getPressure()<1){
               return true;

            }
        }
        return false;
    }
    public static boolean getEnginePower(Car car){
       if(car.getEngine().getEnginePower()>250){
           return true;
       }
        return false;
    }
}
