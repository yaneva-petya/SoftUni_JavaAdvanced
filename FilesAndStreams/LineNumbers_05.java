package Excercises.FilesAndStreams.Problems;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LineNumbers_05 {
    public static void main(String[] args) throws IOException {
        List<String> lines= Files.readAllLines(Path.of("src/Excercises/FilesAndStreams/resources/Exercises Resources/inputLineNumbers.txt"));

        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("C:\\Users\\Petya\\IdeaProjects\\AdvancedModule\\src\\Excercises\\FilesAndStreams\\resources\\output.txt"));

        int count=1;
        for (String line:lines){
            bufferedWriter.write(count+". "+line);
            bufferedWriter.newLine();
            count++;
        }
        bufferedWriter.close();

    }
}
