package Lectures.SetsAndDictionaries.Problems;

import java.util.*;
import java.util.stream.Collectors;


public class AverageStudentsGrade_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> students = new TreeMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");

            String studentName = tokens[0];
            double grade = Double.parseDouble(tokens[1]);

            students.putIfAbsent(studentName, new ArrayList<>());
            List<Double> grades = students.get(studentName);
            grades.add(grade);
        }


        students.forEach((k, v) -> {
            System.out.print(k + " -> ");
            v.forEach(grade -> System.out.printf("%.2f ", grade));
            System.out.printf("(avg: %.2f)\n", getAvgGrade(v));
        });
    }

    private static double getAvgGrade(List<Double> grades) {
        double sum = 0;

        for (Double grade : grades) {
            sum += grade;
        }

        return sum  / grades.size();
//        DoubleSummaryStatistics stats = grades.stream()
//                                              .collect(Collectors.summarizingDouble(Double::doubleValue));
//
//        return stats.getAverage();
    }
}