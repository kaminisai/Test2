import java.util.Scanner;
import java.util.*;
public class NetPayableSal {

	float totsal,Hra, basicSalary=50000 , pf;

	Scanner sc=new Scanner(System.in);


		public void hra() {
		System.out.println("enter the hra amt");
		sc.nextFloat();
		Hra=(50/100)*basicSalary;
		System.out.println(Hra);
	}
	
	public void specialAllowance() {
		float spl;
		System.out.println("enter the specailallowance amt");
		sc.nextFloat();
		spl=(75/100)*basicSalary;
		System.out.println(spl);
	}
	
	public void pfDeduction() {
		System.out.println("enter the pfdeduction amt");
		sc.nextFloat();
		pf=(12/100)*basicSalary;
		System.out.println(pf);
		
	}
	public static void main(String args[]) {
		NetPayableSal net=new NetPayableSal();
		//net.basicSal();
		net.hra();
		net.specialAllowance();
		net.pfDeduction();
	
}
	
}
