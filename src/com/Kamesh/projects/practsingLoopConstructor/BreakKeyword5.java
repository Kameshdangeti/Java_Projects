package com.Kamesh.projects.practsingLoopConstructor;

public class BreakKeyword5 
{
	public static void main(String[] args)
	{
		for (int i = 1; i <=4; i++) 
		{
			for (int j = 1; j <=5; j++)
			{
				if (i==3||j==3) 
				{
					break;
				}
				System.out.println("Break values of i :"+i);
				System.out.println("Break values of j :"+j);
			}
		}
	}
}
