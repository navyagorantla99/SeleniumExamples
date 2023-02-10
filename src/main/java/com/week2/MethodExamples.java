package com.week2;

public class MethodExamples {

	public static void main(String[] args) {
		int a = 12, b= 24;
		//int sum = a+b;
		//System.out.println("sum is : "+sum);
		sumTwoNumbers(a, b);
		addTwoNumbers(a, b);
		int subStraction = subStraction();
		System.out.println(subStraction);
		String fullName = fullName();
		System.out.println("FullName is : "+fullName.trim());
   
	}
	
	
	public static void sumTwoNumbers(int a, int b)
	{
		int sum = a+b;
		System.out.println("sum Of Two Numbers Is : "+sum);
	}
	
	
	public static int addTwoNumbers(int a , int b)
	{
		int sum = a+b;
		System.out.println("Addition Of Two Numbers is : "+sum);
		return sum;
		
	}
	
	
	public static int subStraction()
	{
		int a = 12, b=13;
		int subStraction = b-a;
		System.out.println("subStrction of two numbers is : "+subStraction);
		return subStraction;
	}
	
	public static String fullName()
	{
		String firstName="             Navya     RANI ";
		String lastName = "J                ";
		
		String fullName = firstName.concat(lastName);
		
		return fullName;
	}
	

}
