package com.employeewagebuilder;

public class CompanyEmpWage {
	/**
     * Refactored the whole code.
     */
    int partTimeEmpHr=4;
    int empRatePerHr = 20;
    int fullTimeEmpHrs = 8;
    int empWage=0,totalMonthlyWage=0;
    int totalWorkingHrs=0,totalWorkingDays=0;
    /**
     * Put the while loop inside a method.
     * This while loop will iterate till working days is 20 and Total working hrs is 100.
     * calculate the monthly wage of Employee.
     */
    void calculateTotalwage() {
        while (totalWorkingDays < 20 && totalWorkingHrs < 100) {
            
        	int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {

                case 0:
                    System.out.println("Employee is absent");
                    break;

                case 1:
                    System.out.println("Employee is Present");
                    empWage = Math.multiplyExact(fullTimeEmpHrs, empRatePerHr);
                    System.out.println("Employee Daily Wage is :" + empWage);
                    totalWorkingHrs = totalWorkingHrs + 8;
                    totalWorkingDays = totalWorkingDays++;
                    break;
                case 2:
                    System.out.println("Employee is Present but Half-Time");
                    empWage = Math.multiplyExact(partTimeEmpHr, empRatePerHr);
                    System.out.println("Employee's Part-Time Wage is :" + empWage);
                    totalWorkingHrs = totalWorkingHrs + 4;
                    totalWorkingDays = totalWorkingDays++;
                    break;
            }
            totalMonthlyWage = totalMonthlyWage + empWage;
        }
        System.out.println("Employee Monthly Wage is :" + totalMonthlyWage);
    }
    /**
     * inside the main method i have created a object employee.
     * through that object i have called calculateTotalwage method.
     * @param args
     */
    public static void main(String [] args) {
        System.out.println("Welcome To Employee wage Computation Program");
        CompanyEmpWage employee = new CompanyEmpWage();
        employee.calculateTotalwage();
	}

}