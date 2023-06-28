package com.Api.Api;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestA 
{
	@Parameters({"browser","username"})
	@Test(groups = {"Smoke"})
	public void demoA(String browserName,String user)
	{
		System.out.println("Smoke Test1");
		System.out.println(browserName);
		System.out.println(user);
	}
	@Test
	public void demoB()
	{
		System.out.println("Hello");
	}
	@Test(groups = {"Smoke"})
	public void demoC()
	{
		System.out.println("Smoke Test2");
	}
	@Test(dataProvider = "getData")
	public void demoD(String username,String password)
	{
		System.out.println("Hi");
		System.out.println(username);
		System.out.println(password);
	}
	@DataProvider
	public Object[][] getData()
	{                              // R  C   R=rows, C=columns
		Object [][] data = new Object[3][2];
//For 3 combination of userName and Password
		data[0][0]="username1";
		data[0][1]="password1";
		
		data[1][0]="username2";
		data[1][1]="password2";
		
		data[2][0]="username3";
		data[2][1]="password3";
		return data;
		
	}
}
