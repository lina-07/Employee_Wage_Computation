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
                    int dailyWage = wagePerHour * fullDayHours;

                    System.out.println("Daily Employee Wage: " + dailyWage);

                } else {
                    System.out.println("Employee is Absent");
                }

    }
}
