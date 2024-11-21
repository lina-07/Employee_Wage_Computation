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

                    int employeeType;
                    if (random.nextBoolean()) {
                        employeeType = 1; // Full-Time
                    } else {
                        employeeType = 2; // Part-Time
                    }
              switch (employeeType) {
               case 1: // Full-Time
                 int dailyWage = wagePerHour * fullDayHours;
                 System.out.println("Employee is working Full-Time");
                 System.out.println("Daily Employee Wage: " + dailyWage);
                 break;

               case 2:
                  int partTimeWage = wagePerHour * partTimeHours;
                  System.out.println("Employee is working Part-Time");
                  System.out.println("Daily Part-Time Employee Wage: " + partTimeWage);
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
