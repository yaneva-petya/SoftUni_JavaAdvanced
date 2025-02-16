package Excercises.FilesAndStreams.Problems;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class ALLCAPITALS_03 {
    public static void main(String[] args) throws IOException {
        String path="src/Excercises/FilesAndStreams/resources/input.txt";

        String path1="src/Excercises/FilesAndStreams/resources/output.txt";

        String contentWithUpperCase= Files.readString(Path.of(path));
        contentWithUpperCase=contentWithUpperCase.toUpperCase();
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(path1));
        bufferedWriter.write(contentWithUpperCase);
        bufferedWriter.close();


    }
}
