package Lectures.Two_D_Arrays.Problems;

import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] token = s.nextLine().split("\\s+");
        int rows = Integer.parseInt(token[0]);
        int columns = Integer.parseInt(token[1]);



        int[][] matrix = new int[rows][columns];
        for (int row = 0; row < matrix.length; row++) {
            //Текущият ред прочетен от конзолата
            int[] currentRow = Arrays.stream(s.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[row]=currentRow;
            /*for(int column=0;column<matrix[row].length;column++){
                matrix[row][column]=currentRow[column];
            }*/
        }
        int numberToSearch = Integer.parseInt(s.nextLine());
        boolean isFound = false;
            for (int r = 0; r < matrix.length; r++) {
                for (int column = 0; column < matrix[r].length; column++) {
                    if (matrix[r][column] == numberToSearch) {

                        System.out.println(r + " " + column);
                        isFound = true;
                    }

                }
            }

            if (!isFound) {
                System.out.println("not found");
            }


        }



    }
