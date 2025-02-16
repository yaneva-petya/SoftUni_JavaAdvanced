package Excercises.FilesAndStreams.Problems;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SumBytes_02 {
    public static void main(String[] args) throws IOException {
        String path="src/Excercises/FilesAndStreams/resources/input.txt";
        BufferedReader bufferedReader=new BufferedReader(new FileReader(path));

        String line=bufferedReader.readLine();
        int sum=0;
        while (line!=null){
            for (char symbol: line.toCharArray()){
                sum+=symbol;
            }
            line=bufferedReader.readLine();
        }
        System.out.println(sum);
    }
}
