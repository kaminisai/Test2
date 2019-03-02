import java.io.IOException;
import java.io.InvalidClassException;
import java.util.Scanner;

public class SammyProgrammer {
	
	Scanner sc=new Scanner(System.in);
	String name;
	long contact;
	int age;
	
	
	public void details() {
		System.out.println("enter the datails");
		name=sc.next();
		contact=sc.nextLong();
		age=sc.nextInt();
		System.out.println(name+ " "+contact+" "+age);
	}
	
	public void age() throws InvalidClassException
	{
		if(age>20&& age<55) {
			System.out.println("the age entered is the right age");
		}
			else
			throw new InvalidClassException(" the age entered is the wrong  age");
			
		}

	public static void main(String args[]) throws IOException, InvalidClassException {

	SammyProgrammer sam=new SammyProgrammer();
	sam.details();
	sam.age();
}
}
