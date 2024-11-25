package com.EmployeeWage;

import java.util.Random;

public class EmployeeMain {
                public static void main(String[] args) {
                    System.out.println("Welcome to Employee Wage Computation");
                    Employee employee = new Employee();

                    System.out.println("\nCompany A:");
                    employee.computeWage("Company A", 20, 20, 100);

                    System.out.println("\nCompany B:");
                    employee.computeWage("Company B", 25, 22, 120);

                    System.out.println("\nCompany C:");
                    employee.computeWage("Company C", 18, 25, 90);
                }
}

                    class Employee {

                    private int fullDayHours = 8;
                    private int partTimeHours = 4;

                    public void computeWage(String companyName, int wagePerHour, int workingDaysPerMonth, int maxWorkingHours){
                        int totalWorkingHours = 0;
                        int totalWorkingDays = 0;
                        int totalWages = 0;

                    Random random = new Random();
                    boolean isPresent = random.nextBoolean();

                    if (isPresent) {
                        System.out.println("Employee is Present");

                        while (totalWorkingHours < 100 && totalWorkingDays < workingDaysPerMonth)
                        {
                        int employeeType;

                        if (random.nextBoolean()) {
                            employeeType = 1; // Full-Time
                        } else {
                            employeeType = 2; // Part-Time
                        }
                        int hoursWorked;
                            if (employeeType == 1) {
                                hoursWorked = fullDayHours;
                            } else {
                                hoursWorked = partTimeHours;
                            }

                            if (totalWorkingHours + hoursWorked > 100) {
                                hoursWorked = 100 - totalWorkingHours;
                            }

                            totalWorkingHours += hoursWorked;
                            totalWages += hoursWorked * wagePerHour;
                            totalWorkingDays++;

                        }

                        System.out.println("Total Days Worked: " + totalWorkingDays);
                        System.out.println("Total Hours Worked: " + totalWorkingHours);
                        System.out.println("Total Wages: " + totalWages);

        } else {
            System.out.println("Employee is Absent");
        }
    }
}
