package com.Api.Api;

public class Array {

	public static void main(String[] args) 
	{
		
	int a [] = {1,-2,-3,4,5,2};
	int x = 0;
	int c = a.length;
	for(int i=0; i<c; i++)
	{
		if(a[i]>0)
		{
			x=x+a[i];
		}
		
	}
	System.out.println(x);
	System.out.println("Change 1");
	
	}
}
