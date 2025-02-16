package Excercises.FilesAndStreams.Problems;

import java.io.*;
import java.nio.file.*;
import java.util.List;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\Petya\\IdeaProjects\\AdvancedModule\\src\\Excercises\\FilesAndStreams\\resources\\input.txt";
        //Reading from file
        //Reading a file from Scanner
        Scanner s = new Scanner(new File(path));
        System.out.println(s.nextLine());

        //BufferedReader
        BufferedReader bufferedReader=new BufferedReader(new FileReader(path));
        System.out.println(bufferedReader.readLine());

        //FileReader -> Files.readAllLines
        List<String> lines = Files.readAllLines(Path.of(path)) ;
        System.out.println(lines.get(0));

        //File
        String fullContent = Files.readString(Path.of(path));


       //Writing in file
        String path1="C:\\Users\\Petya\\IdeaProjects\\AdvancedModule\\src\\Excercises\\FilesAndStreams\\resources\\output.txt";
        PrintWriter printWriter=new PrintWriter(path1);
        printWriter.println("Hello world!");
        printWriter.close();


        //BufferedWriter
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(path1));
        bufferedWriter.write("Hello world");
        bufferedWriter.close();

        FileWriter fileWriter=new FileWriter(path1);
        fileWriter.write("Hello world");
        fileWriter.close();

    }
}
