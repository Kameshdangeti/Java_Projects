package com.Kamesh.projects.PractisingOperatorsAndDecisionConstructors;

import java.util.Scanner;

public class SwitchStatements 
{
  public static void main(String[] args)
  {
	int day;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the a no between 1-7 to ceck the day");
	day=sc.nextInt();
	switch (day) 
	{
	case 1:
		System.out.println("Monday");
		break;
	case 2:
		System.out.println("Tuesday");
		break;
	case 3:
		System.out.println("Wednesday");
		break;
	case 4:
		System.out.println("Thursday");
		break;
	case 5:
		System.out.println("Friday");
		break;
	case 6:
		System.out.println("Saturday");
		break;
	case 7:
		System.out.println("Sunday");
		break;
		

	default:
		System.out.println("Invalid number");
		break;
	}
  }
}
