package com.EmployeeWage;

import java.util.Random;

public class EmployeeMain {
                public static void main(String[] args) {
                    System.out.println("Welcome to Employee Wage Computation");
                    EmpWageBuilder companyA = new EmpWageBuilder("Company A", 20, 20, 100);
                    EmpWageBuilder companyB = new EmpWageBuilder("Company B", 25, 22, 120);
                    EmpWageBuilder companyC = new EmpWageBuilder("Company C", 18, 25, 90);

                    companyA.computeWage();
                    companyB.computeWage();
                    companyC.computeWage();

                    System.out.println("\nSummary of Total Wages for Each Company:");
                    System.out.println(companyA);
                    System.out.println(companyB);
                    System.out.println(companyC);
                }
}

                    class EmpWageBuilder{

                        private String companyName;
                        private int wagePerHour;
                        private int workingDaysPerMonth;
                        private int maxWorkingHours;
                        private int totalWages;

                        private int fullDayHours = 8;
                        private int partTimeHours = 4;

                        public EmpWageBuilder(String companyName, int wagePerHour, int workingDaysPerMonth, int maxWorkingHours) {
                            this.companyName = companyName;
                            this.wagePerHour = wagePerHour;
                            this.workingDaysPerMonth = workingDaysPerMonth;
                            this.maxWorkingHours = maxWorkingHours;
                        }
                    public void computeWage() {
                        int totalWorkingHours = 0;
                        int totalWorkingDays = 0;


                        Random random = new Random();
                        System.out.println("\nComputing Wages for " + companyName);



                            while (totalWorkingHours < maxWorkingHours && totalWorkingDays < workingDaysPerMonth) {
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

                                if (totalWorkingHours + hoursWorked > maxWorkingHours) {
                                    hoursWorked = maxWorkingHours - totalWorkingHours;
                                }

                                totalWorkingHours += hoursWorked;
                                totalWorkingDays++;

                            }
                            totalWages += totalWorkingHours * wagePerHour;

                            System.out.println("Total Days Worked: " + totalWorkingDays);
                            System.out.println("Total Hours Worked: " + totalWorkingHours);
                            System.out.println("Total Wages: " + totalWages);

                        }
                        public String toString () {
                            return "Company: " + companyName + ", Total Wages: " + totalWages;
                        }
                    }
