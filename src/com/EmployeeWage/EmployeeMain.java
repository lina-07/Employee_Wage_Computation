package com.EmployeeWage;

import java.util.Random;

public class EmployeeMain {
                public static void main(String[] args) {
                    System.out.println("Welcome to Employee Wage Computation");
                    Employee employee = new Employee();
                    employee.computeWage();
                }
}

                    class Employee {
                    private int wagePerHour = 20;
                    private int fullDayHours = 8;
                    private int partTimeHours = 4;
                    private int workingDaysPerMonth = 20;

                    private int totalWorkingHours = 0;
                    private int totalWorkingDays = 0;
                    private int totalWages = 0;

                    public void computeWage() {
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

                            System.out.println("Day " + totalWorkingDays + ": Hours Worked = " + hoursWorked +
                                    ", Total Hours = " + totalWorkingHours + ", Total Wages = " + totalWages);
                        }

                        System.out.println("\nFinal Summary:");
                        System.out.println("Total Days Worked: " + totalWorkingDays);
                        System.out.println("Total Hours Worked: " + totalWorkingHours);
                        System.out.println("Total Wages: " + totalWages);

        } else {
            System.out.println("Employee is Absent");
        }
    }
}
