package com.employeewagebuilder;

public class EmpWageBuilder {
	/**
	 * Created an integer variable assigned 0.
	 */
    private int numOfCompany = 0;
    /**
     * Creating an array of class CompanyEmpWage.
     */
    private CompanyEmpWage[] companyEmpWageArray;

    /**
     * Inside the constructor it's taking the size of that array to 5.
     */
    public EmpWageBuilder() {
        companyEmpWageArray = new CompanyEmpWage[5];
    }
    /**
     * this method taking these parameters and adding the company employee wage to that array.
     * @param company
     * @param empRatePerHr
     * @param noOfWorkingDays
     * @param maxHrsPerMonth
     */

    private void addCompanyEmpWage(String company, int empRatePerHr, int noOfWorkingDays, int maxHrsPerMonth) {
        companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, empRatePerHr, noOfWorkingDays,maxHrsPerMonth);
        numOfCompany++;
    }
    /**
     * this method will iterate till the size of numofcompany.
     * internally it's calling setTotalEmpWage method by passing integer as parameter.
     */

    private void computeEmpWage() {
        for (int i = 0; i < numOfCompany; i++) {
            companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
            System.out.println(companyEmpWageArray[i]);
        }
    }

    /**
     * This method will compute the Employee wage.
     * Taking the object of CompanyEmpWage class as a parameter.
     * @param companyEmpWage
     * @return
     */
    public int computeEmpWage(CompanyEmpWage companyEmpWage) {
        // Variables
        int partTimeEmpHr=4;
        int empRatePerHr = 20;
        int fullTimeEmpHrs = 8;
        int empWage=0,totalMonthlyWage=0;
        int totalWorkingHrs=0,totalWorkingDays=0;

        while (totalWorkingDays < companyEmpWage.noOfWorkingDays && totalWorkingHrs < companyEmpWage.maxHrsPerMonth) {
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
        return totalWorkingHrs * companyEmpWage.empRatePerHr;
    }

    public static void main(String[] args){
        System.out.println("Welcome to Employee Wage Computation Program...");

        /**
         * Created Objects.
         * Called the computeEmpWage method.
         */
        EmpWageBuilder empWageBuilder = new EmpWageBuilder();
        empWageBuilder.addCompanyEmpWage("Dmart", 20, 20, 100);
        empWageBuilder.addCompanyEmpWage("Reliance", 10, 24, 120);
        empWageBuilder.computeEmpWage();
	}
}