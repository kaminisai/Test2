import java.util.*;
	
	
	class FixedAccount{
		
		Scanner sc=new Scanner(System.in);
		int ptr,interest ,amt;
		public void calculateInterest() {
			interest=ptr/100;
			System.out.println(interest);
			
		}
		
			
		}
	class SavingsAccount extends FixedAccount{
		
		public void calculateInterest() {
			float savings,bal = 450000;
			savings=bal-amt;
			
		}
	
	
	public static void main(String args[]) {
		FixedAccount fa=new FixedAccount();
		fa.calculateInterest();
	}
	}