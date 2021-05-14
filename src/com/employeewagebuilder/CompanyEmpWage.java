package com.employeewagebuilder;

public class CompanyEmpWage {
public static void main(String[] args) {
	// TODO Auto-generated method stub
			System.out.println("Welcome To EmployeeWage Computation Program");
			 /**
	         * This condition will check Employee is present or Absent.
	         * Here i have used Random function to generate random numbers.
	         */
	        int IS_PRESENT=1;
	        int empCheck =(int) Math.floor(Math.random()*10)%2;
	        if(empCheck == IS_PRESENT)
	            System.out.println("Employee is Present");
	        else
	            System.out.println("Employee is Absent");
	        /**
	         * This will calculate the daily wage of Employee.
	         */
	        int empRatePerHr = 20;
	        int empHrs = 8;
	        if( IS_PRESENT == empCheck)
	            System.out.println("Employee Daily Wage is :" +Math.multiplyExact(empHrs,empRatePerHr));
	        else
	            System.out.println("Employee Daily Wage is : 0");

		}

	}

