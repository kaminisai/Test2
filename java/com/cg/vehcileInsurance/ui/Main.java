package com.cg.vehcileInsurance.ui;

import java.util.Scanner;

import com.cg.vehcileInsurance.beans.VehcileInsurance;
import com.cg.vehcileInsurance.service.IVehcileInsuranceService;
import com.cg.vehcileInsurance.service.VehcileInsuranceServiceImpl;

public class Main {
	
static	VehcileInsurance vehcile=new VehcileInsurance();
	Main main=new Main();
static	Scanner sc=new Scanner(System.in);
	
	//welcome page
	public static void main(String args[]) {
		System.out.println("**************Welcome to vehcile insurance*************** ");
		while(true) {
		// registering  and validation check for a vehcile
		System.out.println("1:- Vehcile Insurance Registration \n 2:-  Insurance validation check \n  3:- Exit");
		IVehcileInsuranceService vis=new VehcileInsuranceServiceImpl();
		int in=sc.nextInt();
		
		
		switch(in) {
		case 1:
			
			System.out.println("Enter the vehcile number");
			vehcile.setVehcileNo(sc.nextInt());
			
			System.out.println("Enter the vehcile type (1:-2 Wheeler, 2:- 4 Wheeler ) ");
			vehcile.setVehcileType(sc.next());
			
			System.out.println("Enter the Insurance Period");
			vehcile.setInsurancePeriod(sc.nextInt());
			
			System.out.println("Enter the aadhar card number");
			vehcile.setAadharCard(sc.nextLong());
			
			System.out.println("Enter the mobile number");
			vehcile.setMobileNo(sc.nextLong());
			
			vis.VechileInsuranceRegistration(vehcile);
			System.out.println("successfully registered " );
			
			break;
			
		case 2:
			System.out.println("Enter the validation period in number of days");
			vehcile.setInsurancePeriod(sc.nextInt());
			
			System.out.println("your insurance validity check period is" );
			vis.InsuranceValidaityCheck();
			
			System.out.println("Number of days remaining for renewal is");
			vis.InsuranceValidaityCheck();
			
			
		 case  3: 
			 System.exit(0);
			 System.out.println("successfully exited");
	}
	}
}
}
