package com.employeewagebuilder;

public class CompanyEmpWage {
	/**
     * Here i have used Random function to generate random numbers.
     */
    private  int partTimeEmpHr=4;
    private  int empRatePerHr = 20;
    private  int fullTimeEmpHrs = 8;
    private  int empWage=0,totalMonthlyWage=0;
    private  int totalWorkingHrs=0,totalWorkingDays=0,maxHrsInMonth,workingDaysInMonth;
    private  String companyname;

    /**
     * this one is a parameterised constructor having below parameters.
     * @param empRatePerHr
     * @param workingDaysInMonth
     * @param maxHrsInMonth
     * @param companyname
     */
    public CompanyEmpWage(int empRatePerHr,int workingDaysInMonth,int maxHrsInMonth,String companyname) {
		// TODO Auto-generated constructor stub
        this.empRatePerHr=empRatePerHr;
        this.workingDaysInMonth=workingDaysInMonth;
        this.maxHrsInMonth=maxHrsInMonth;
        this.companyname=companyname;

    }
    /**
     * created a CalculateTotalwage method.
     * This while loop will iterate till working days is 20 and Total working hrs is 100.
     * calculate the monthly wage of Employee.
     */
    private void calculateTotalwage() {
        while (totalWorkingDays < workingDaysInMonth && totalWorkingHrs < maxHrsInMonth) {
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
    }
    /**
     * This display method will show all the data inserted and output too.
     */
    private void display() {
        System.out.println("Employee Monthly Wage is :" + totalMonthlyWage);
        System.out.println("Company name: " + companyname);
        System.out.println("Employee wage per Hour: " + empRatePerHr);
        System.out.println("Total Employee working Hours: " + totalWorkingHrs);
        System.out.println("maximum Employee's working Hours: " + totalWorkingHrs);
    }

    /**
     * Inside the main method i have created two object for two companies.
     * then i called CalculateTotalwage method and display method through those object refrences by passing parameters.
     * @param args
     */
    public static void main(String [] args) {
        System.out.println("Welcome to Employee wage Computation");
        CompanyEmpWage dmart = new CompanyEmpWage(20,25,100,"D-MART");
        CompanyEmpWage fashionBazar=new CompanyEmpWage(30,20,120,"Fashion Bazar");
        dmart.calculateTotalwage();
        fashionBazar.calculateTotalwage();
        dmart.display();
        fashionBazar.display();
	}
}