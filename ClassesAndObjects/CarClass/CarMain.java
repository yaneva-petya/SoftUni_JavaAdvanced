package Lectures.ClassesAndObjects.CarClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) throws ArithmeticException {

       Scanner s = new Scanner(System.in);
       int n=Integer.parseInt(s.nextLine());

        List<Car> carList=new ArrayList<>();
       for(int i=0;i<n;i++){
           String input=s.nextLine();
           String brand=input.split("\\s+")[0];
           String model=input.split("\\s+")[1];
           int horsePower=Integer.parseInt(input.split("\\s+")[2]);

           carList.add(new Car(brand, model, horsePower));

       }
       for (Car car:carList){
           System.out.println(car.toString());
       }

    }
}
