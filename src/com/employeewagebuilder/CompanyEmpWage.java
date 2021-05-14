package com.employeewagebuilder;

public class CompanyEmpWage {
public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println("Welcome To EmployeeWage Computation Program");
	 int partTimeEmpHr=4;
     int empRatePerHr = 20;
     int fullTimeEmpHrs = 8;
     int empWage=0,totalMonthlyWage=0;
     int totalWorkingHrs=0,totalWorkingDays=0;
     /**
      * This while loop will iterate till working days is 20 and Total working hrs is 100.
      * calculate the monthly wage of Employee.
      * Here i have used two variable totalworkingdays and totalworkinghrs for this while loop.
      */
    while (totalWorkingDays<20 && totalWorkingHrs<100){
         int empCheck =(int) Math.floor(Math.random()*10)%3;
         switch (empCheck) {

             case 0:
                 System.out.println("Employee is absent");
                 break;

             case 1:
                 System.out.println("Employee is Present");
                 empWage = Math.multiplyExact(fullTimeEmpHrs, empRatePerHr);
                 System.out.println("Employee Daily Wage is :" + empWage);
                 totalWorkingHrs=totalWorkingHrs+8;
                 totalWorkingDays=totalWorkingDays++;
                 break;
             case 2:
                 System.out.println("Employee is Present but Half-Time");
                 empWage = Math.multiplyExact(partTimeEmpHr, empRatePerHr);
                 System.out.println("Employee's Part-Time Wage is :" + empWage);
                 totalWorkingHrs=totalWorkingHrs+4;
                 totalWorkingDays=totalWorkingDays++;
                 break;
         }
         totalMonthlyWage = totalMonthlyWage + empWage;
     }
     System.out.println("Employee Monthly Wage is :" + totalMonthlyWage);
	}

}