package com.employeewagebuilder;
/**
 * Here it's an Interface having abstract method.
 * this methods implements in EmpWageBuilder class.
 * @author User
 *
 */

public interface EmpWageInterface {
	
    public void addCompanyEmpWage(String company, int empRatePerHr, int noOfWorkingDays, int maxHrsPerMonth);
    public void computeEmpWage();
    public int computeEmpWage(CompanyEmpWage companyEmpWage);
}