package forloop;

import java.util.Scanner;

public class forloop2 {
	public static void main (String arg[])
	{
		
		int n1;
		int n2;
		int gcd=1;	
		
	Scanner SC = new Scanner(System.in);
	System.out.println("Enter first number  ");
	System.out.println(" ");
	n1=SC.nextInt();
	System.out.println("Enter second number  ");
	System.out.println(" ");
	n2=SC.nextInt();

	
	for(int i=1;i<=n1 && i<=n2;i++)
		
	{
		
		if((n1%i==0) &&(n2%i==0))
		
			gcd=i;
	}
	//System.out.println("The LCM is   "+ gcd);
	    int lcm = ((n1*n2)/gcd);
		System.out.println("The LCM of two numbers is  "+ lcm);
		
	}

}		
		
		
		
		//LCD = num1*num2/GCD
		//GCD = (num1/i==0&&num2/i==0)
		
		
		
		
		
		
	
	


