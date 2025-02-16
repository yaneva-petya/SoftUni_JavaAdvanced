package Excercises.FilesAndStreams.Problems;

import java.io.File;
import java.nio.file.Files;
import java.util.Scanner;

public class GetFolderSize_08 {
    public static void main(String[] args) {
        String path="src/Excercises/FilesAndStreams/resources/Exercises Resources";

        File folder=new File(path);
        File[] allFiles=folder.listFiles();
        int folderSize=0;
        for(File file:allFiles){
            folderSize+=file.length();
        }

        System.out.printf("Folder Size: "+folderSize);
    }
}
