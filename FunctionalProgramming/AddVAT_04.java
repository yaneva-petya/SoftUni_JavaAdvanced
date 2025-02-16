package Lectures.FunctionalProgramming.Problems;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class AddVAT_04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        //List<Double> prices=Arrays.stream(s.nextLine().split(", "))
          //      .map(Double::parseDouble).toList();

        Function<Double, Double>vatFunc= price->price*1.2;
        Consumer<Double> printPrices=price->System.out.printf("%.2f\n", price);


       String input=s.nextLine();
        System.out.println("Prices with VAT:");

        //prices.stream().map(vatFunc).forEach(printPrices);
        Arrays.stream(input.split(", "))
                .map(Double::parseDouble)
                .map(vatFunc).
                forEach(printPrices);
    }
}
