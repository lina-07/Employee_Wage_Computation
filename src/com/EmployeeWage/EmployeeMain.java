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

                    int employeeType;
                    if (random.nextBoolean()) {
                        employeeType = 1; // Full-Time
                    } else {
                        employeeType = 2; // Part-Time
                    }
              switch (employeeType) {
               case 1: // Full-Time
                 int dailyWage = wagePerHour * fullDayHours;
                 int monthlyWageFullTime = dailyWage * workingDaysPerMonth;
                 System.out.println("Employee is working Full-Time");
                 System.out.println("Daily Employee Wage: " + dailyWage);
                 System.out.println("Monthly Employee Wage: " + monthlyWageFullTime);
                 break;

               case 2:
                  int partTimeWage = wagePerHour * partTimeHours;
                  int monthlyWagePartTime = partTimeWage * workingDaysPerMonth;
                  System.out.println("Employee is working Part-Time");
                  System.out.println("Daily Part-Time Employee Wage: " + partTimeWage);
                  System.out.println("Monthly Part-Time Employee Wage: " + monthlyWagePartTime);
                   break;

               default:
                  System.out.println("Invalid employee type");
                  break;
                }

                } else {
                    System.out.println("Employee is Absent");
                }
    }
}
