package Excercises.FilesAndStreams.Problems;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SumLines_01 {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\Petya\\IdeaProjects\\AdvancedModule\\src\\Excercises\\FilesAndStreams\\resources\\input.txt";

        List<String> lines= Files.readAllLines(Path.of(path));

        lines.stream()
                .map(line->line.toCharArray())
                .forEach(arr->{
                    int sum=0;
                    for (char symbol:arr){
                        sum+= symbol;
                    }
                    System.out.println(sum);
                });



    }
}
