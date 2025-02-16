package Excercises.FilesAndStreams.Problems;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MergeTwoFiles_07 {
    public static void main(String[] args) throws IOException {
        String path1="src/Excercises/FilesAndStreams/resources/Exercises Resources/inputOne.txt";
        String path2="src/Excercises/FilesAndStreams/resources/Exercises Resources/inputTwo.txt";

        List<String> linesOne= Files.readAllLines(Path.of(path1));
        List<String> linesTwo=Files.readAllLines(Path.of(path2));

        BufferedWriter writer=new BufferedWriter(new FileWriter("src/Excercises/FilesAndStreams/resources/Exercises Resources/output.txt"));

        linesOne.forEach(line->{
            try {
                writer.write(line);
                writer.newLine();
            }catch (IOException e){
                e.printStackTrace();
            }
        });

        linesTwo.forEach(line->{
            try {
                writer.write(line);
                writer.newLine();
            }catch (IOException e){
                e.printStackTrace();
            }
        });
        writer.close();
    }
}
