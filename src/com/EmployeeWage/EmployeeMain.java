package com.EmployeeWage;

import java.util.Random;

public class EmployeeMain {
                public static void main(String[] args) {
                    System.out.println("Welcome to Employee Wage Computation");

                    Random random = new Random();
                    boolean isPresent = random.nextBoolean();

                    if (isPresent) {
                        System.out.println("Employee is Present");

                        int wagePerHour = 20;
                        int fullDayHours = 8;
                        int partTimeHours = 4;
                        int workingDaysPerMonth = 20;

                        int totalWorkingHours = 0;
                        int totalWorkingDays = 0;
                        int totalWages = 0;

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
                                hoursWorked = 100 - totalWorkingHours; // Adjust hours if they exceed the limit
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
