package com.employeewagebuilder;

public class CompanyEmpWage {
	public final String company;
    public final int empRatePerHr;
    public final int noOfWorkingDays;
    public final int maxHrsPerMonth;
    public int totalEmpWage;

    /**
     * Constructor having Parameters.
     * @param company
     * @param empRatePerHr
     * @param noOfWorkingDays
     * @param maxHrsPerMonth
     */
    public CompanyEmpWage(String company, int empRatePerHr, int noOfWorkingDays, int maxHrsPerMonth) {
        this.company = company;
        this.empRatePerHr = empRatePerHr;
        this.noOfWorkingDays = noOfWorkingDays;
        this.maxHrsPerMonth = maxHrsPerMonth;
    }
    /**
     * this method will take totalEmpwage as a parameter and initiate that.
     * @param totalEmpWage
     */
    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }
    /**
     * THis is an override method which will print the following message.
     */
    @Override
    public String toString() {
        return "Total Emp Wage for Company:" + company + " is: " + totalEmpWage + "\n";
	}

}