package Excercises.ClassesAndObjects.Google_07;

import Lectures.Two_D_Arrays.Problems.CompareMatrices_01;

public class Company {
    private String nameCompany;
    private String department;
    private double salary;

    public Company(String nameCompany, String department, double salary){
        setNameCompany(nameCompany);
        setDepartment(department);
        setSalary(salary);
    }

    public Company(){
        this.nameCompany = "";
        this.department = "";
        this.salary = 0;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

 @Override
    public String toString(){
        return this.nameCompany.equals("")
                //If there is no company it will return "Company:"
                ?"Company:"
                :String.format("Company:\n%s %s %.2f", nameCompany, department, salary);
 }


}
