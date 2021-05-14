package com.employeewagebuilder;

public class CompanyEmpWage {
public static void main(String[] args) {
	// TODO Auto-generated method stub
			System.out.println("Welcome To EmployeeWage Computation Program");
			/**
			 * Here i have used Random function to generate random numbers.
			 */
			int IS_PRESENT=1;
			int partTimeEmpHr=4,partTime=2;
			int empRatePerHr = 20;
			int fullTimeEmpHrs = 8;
			int empCheck =(int) Math.floor(Math.random()*10)%3;
			/**
			 * This switch case will calculate the daily wage,Part-time wage of Employee.
			 */			
			switch(empCheck) {
			
			    case 0:
			        System.out.println("Employee is absent");
			    break;
			
				case 1:
				    System.out.println("Employee is Present");
				System.out.println("Employee Daily Wage is :" + Math.multiplyExact(fullTimeEmpHrs, empRatePerHr));
				    break;
				case 2:
				    System.out.println("Employee is Present but Half-Time");
				System.out.println("Employee's Part-Time Wage is :" + Math.multiplyExact(partTimeEmpHr, empRatePerHr));
				        break;
			}
		}

	}

