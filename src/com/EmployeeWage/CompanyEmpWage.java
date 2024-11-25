package com.EmployeeWage;

class CompanyEmpWage {
        private String companyName;
        private int wagePerHour;
        private int workingDaysPerMonth;
        private int maxWorkingHours;
        private int totalWages;

        public CompanyEmpWage(String companyName, int wagePerHour, int workingDaysPerMonth, int maxWorkingHours) {
            this.companyName = companyName;
            this.wagePerHour = wagePerHour;
            this.workingDaysPerMonth = workingDaysPerMonth;
            this.maxWorkingHours = maxWorkingHours;
        }

        // Getters and setters
        public String getCompanyName() {
            return companyName;
        }

        public int getWagePerHour() {
            return wagePerHour;
        }

        public int getWorkingDaysPerMonth() {
            return workingDaysPerMonth;
        }

        public int getMaxWorkingHours() {
            return maxWorkingHours;
        }

        public int getTotalWages() {
            return totalWages;
        }

        public void setTotalWages(int totalWages) {
            this.totalWages = totalWages;
        }

        @Override
        public String toString() {
            return "Company: " + companyName + ", Total Wages: " + totalWages;
        }
    }

