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
	        int partTimeEmpHr=4,partTime=2;
	        int empRatePerHr = 20;
	        int fullTimeEmpHrs = 8;
	        int empCheck =(int) Math.floor(Math.random()*10)%3;
	        /**
	         * This will calculate the daily wage of Employee.
	         */
	        if(empCheck == IS_PRESENT) {
	            System.out.println("Employee is Present");
	            System.out.println("Employee Daily Wage is :" + Math.multiplyExact(fullTimeEmpHrs, empRatePerHr));
	        }
	        /**
	         * This will calculate part-time wage of Employee
	         */
	        else if(empCheck==partTime){
	            System.out.println("Employee is Present but Half-Time");
	            System.out.println("Employee's Part-Time Wage is :" +Math.multiplyExact(partTimeEmpHr,empRatePerHr));
	        }else{
	            System.out.println("Employee is Absent");
	        }

		}

	}

