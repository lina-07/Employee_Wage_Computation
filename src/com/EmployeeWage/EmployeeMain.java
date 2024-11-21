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

                    boolean isPartTime = random.nextBoolean();

                    if (isPartTime) {
                        int partTimeWage = wagePerHour * partTimeHours;
                    System.out.println("Employee is working Part-Time");
                    System.out.println("Daily Part-Time Employee Wage: " + partTimeWage);

                } else {
                    int dailyWage = wagePerHour * fullDayHours;
                    System.out.println("Employee is working Full-Time");
                    System.out.println("Daily Employee Wage: " + dailyWage);
                }

                } else {
                    System.out.println("Employee is Absent");
                }

    }
}
