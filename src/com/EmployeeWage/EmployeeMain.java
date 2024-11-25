package com.EmployeeWage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmployeeMain {
                public static void main(String[] args) {
                    System.out.println("Welcome to Employee Wage Computation");
                    EmpWageBuilder empWageBuilder = new EmpWageBuilder();

                    empWageBuilder.addCompany("Company A", 20, 20, 100);
                    empWageBuilder.addCompany("Company B", 25, 22, 120);
                    empWageBuilder.addCompany("Company C", 18, 25, 90);

                    empWageBuilder.computeWage();

                    System.out.println("\nTotal Wages for Each Company:");
                    empWageBuilder.printCompanyWages();
                }
}

                    class EmpWageBuilder{
                        private List<CompanyEmpWage> companyEmpWageList;

                        private int fullDayHours = 8;
                        private int partTimeHours = 4;

                        public EmpWageBuilder() {
                            companyEmpWageList = new ArrayList<>();
                        }

                        public void addCompany(String companyName, int wagePerHour, int workingDaysPerMonth, int maxWorkingHours) {
                            CompanyEmpWage companyEmpWage = new CompanyEmpWage(companyName, wagePerHour, workingDaysPerMonth, maxWorkingHours);
                            companyEmpWageList.add(companyEmpWage);
                        }

                    public void computeWage() {
                        for (CompanyEmpWage companyEmpWage : companyEmpWageList) {
                            computeWageForCompany(companyEmpWage);
                        }
                    }
                    private void computeWageForCompany(CompanyEmpWage companyEmpWage) {
                        int totalWorkingHours = 0;
                        int totalWorkingDays = 0;

                        Random random = new Random();
                        System.out.println("\nComputing Wages for " + companyEmpWage.getCompanyName());

                            while (totalWorkingHours < companyEmpWage.getMaxWorkingHours() && totalWorkingDays < companyEmpWage.getWorkingDaysPerMonth()) {
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

                                if (totalWorkingHours + hoursWorked >companyEmpWage.getMaxWorkingHours()) {
                                    hoursWorked = companyEmpWage.getMaxWorkingHours() - totalWorkingHours;
                                }

                                totalWorkingHours += hoursWorked;
                                totalWorkingDays++;

                            }
                        int totalWages = totalWorkingHours * companyEmpWage.getWagePerHour();
                        companyEmpWage.setTotalWages(totalWages);
                            System.out.println("Total Days Worked: " + totalWorkingDays);
                            System.out.println("Total Hours Worked: " + totalWorkingHours);
                            System.out.println("Total Wages: " + totalWages);

                        }
                        public void printCompanyWages() {
                            for (CompanyEmpWage companyEmpWage : companyEmpWageList) {
                                System.out.println(companyEmpWage);
                            }
                        }
                    }
