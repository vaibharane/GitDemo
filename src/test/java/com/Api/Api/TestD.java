package com.Api.Api;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestD 

{
	@Parameters({"browser"})
	@Test
	public void practiceC(String browserName)
	{
		System.out.println("practice C");
		System.out.println(browserName);
	}
	@Test
	public void practiceD()
	{
		System.out.println("Practice D");
	}
	
}
