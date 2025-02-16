package Excercises.ClassesAndObjects.CompanyRoster;

import java.util.*;
import java.util.function.IntBinaryOperator;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n=Integer.parseInt(s.nextLine());


      //  List<Employee> employeeList=new ArrayList<>();
        Map<String, List<Employee>> employeeMap=new HashMap<>();
        for (int i=0;i<n;i++){
            String input=s.nextLine();
            String[] info=input.split("\\s+");
            String name=info[0];
            double salary=Double.parseDouble(info[1]);
            String position=info[2];
            String department=info[3];

            Employee currentEmployee=null;
            if(info.length==6){

                String email=info[4];
                int age=Integer.parseInt(info[5]);
                 currentEmployee=new Employee(name, salary,position,department,email,age);
            }else if(info.length==4){
                 currentEmployee=new Employee(name, salary,position,department);

            }
            else{
                if(info[4].contains("@")){
                    String email=info[4];
                   currentEmployee=new Employee(name, salary,position,department,email);

                }
                else {
                    int age=Integer.parseInt(info[4]);
                    currentEmployee=new Employee(name, salary,position,department,age);
                }
            }

            if(!employeeMap.containsKey(department)){
                employeeMap.put(department,new ArrayList<>());
                employeeMap.get(department).add(currentEmployee);
            }else{
                employeeMap.get(department).add(currentEmployee);
            }

        }

        String departmentNameWithHighestAverageSalary=
                employeeMap.entrySet().stream()
                        .max(Comparator.comparingDouble(entry->averageSalary(entry.getValue())))
                        .get().getKey();

      System.out.printf("Highest Average Salary: %s\n",departmentNameWithHighestAverageSalary);
      //{name1} {salary1} {email1} {age1}

        List<Employee> employeesList=employeeMap.get(departmentNameWithHighestAverageSalary);
        employeesList.sort(Comparator.comparing(Employee::getSalary));
        Collections.reverse(employeesList);
        for(Employee employee: employeesList){
            System.out.printf("%s %.2f %s %d\n", employee.getName(),employee.getSalary(),
                    employee.getEmail(), employee.getAge());
        }



    }

    public static double averageSalary(List<Employee> employeeList){
        double sum=0;

        for(Employee employee:employeeList){
            sum+=employee.getSalary();
        }
        return sum/employeeList.size();
    }
}
