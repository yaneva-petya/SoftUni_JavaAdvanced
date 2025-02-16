package Excercises.FilesAndStreams.Problems;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class WordCount_06 {
    public static void main(String[] args) throws IOException {
        String pathWords = "src/Excercises/FilesAndStreams/resources/Exercises Resources/text.txt";
        String pathTwo = "src/Excercises/FilesAndStreams/resources/Exercises Resources/words.txt";

        Map<String, Integer> countWords = new HashMap<>();

        List<String> allLinesWithWords = Files.readAllLines(Path.of(pathWords));

        for (String line : allLinesWithWords){
            Arrays.stream(line.split("\\s+"))
                    .forEach(word ->
                            countWords.put(word, 0));
        }


        List<String> allLinesFromText = Files.readAllLines(Path.of(pathTwo));

        for (String line : allLinesFromText){
            Arrays.stream(line.split("\\s+"))
                    .forEach(word -> {
                        if(countWords.containsKey(word)){
                            int currentCount = countWords.get(word);
                            countWords.put(word, currentCount + 1);
                        }

                    });
        }

        PrintWriter writer = new PrintWriter("src/Excercises/FilesAndStreams/resources/Exercises Resources/Results.txt");

        countWords.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(entry -> writer.println(entry.getKey() + " - " + entry.getValue()));

        writer.close();

        //compareTo -> 0 (е1 == е2), 1 (е1 > е2), -1 (е2 > е1)
        //sorted -> 0 (не разменя местата на елементите), 1 (разменя местата на е1 и е2), -1 (не разменя местата на елементите)

    }
}
