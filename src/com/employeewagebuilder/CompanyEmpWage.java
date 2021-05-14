package com.employeewagebuilder;

public class CompanyEmpWage {
public static void main(String[] args) {
	// TODO Auto-generated method stub
			System.out.println("Welcome To EmployeeWage Computation Program");
			int IS_PRESENT=1;
	        int partTimeEmpHr=4,partTime=2;
	        int empRatePerHr = 20;
	        int fullTimeEmpHrs = 8;
	        int empWage=0,totalMonthlyWage=0;
	        int totalEmpDays=20;
	        /**
	         * This for loop will iterate and calculate the monthly wage of Employee.
	         * Here i have used Random function to generate random numbers.
	         */
	        for (int i=0; i<totalEmpDays; i++) {
	             int empCheck =(int) Math.floor(Math.random()*10)%3;
	             switch (empCheck) {

	                case 0:
	                    System.out.println("Employee is absent");
	                    break;

	                case 1:
	                    System.out.println("Employee is Present");
	                    empWage = Math.multiplyExact(fullTimeEmpHrs, empRatePerHr);
	                    System.out.println("Employee Daily Wage is :" + empWage);
	                    break;
	                case 2:
	                    System.out.println("Employee is Present but Half-Time");
	                    empWage = Math.multiplyExact(partTimeEmpHr, empRatePerHr);
	                    System.out.println("Employee's Part-Time Wage is :" + empWage);
	                    break;
	            }
	            totalMonthlyWage = totalMonthlyWage + empWage;
	        }
	        System.out.println("Employee Monthly Wage is :" + totalMonthlyWage);
		}

	}
