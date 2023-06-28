package com.Api.Api;

import org.testng.annotations.Test;

public class TestB
{

	@Test(groups = {"Smoke"})
	public void demo5()
	{
		System.out.println("Smoke Test3");
	}
	@Test
	public void demo6()
	{
		System.out.println("Hello1");
	}
	@Test(groups = {"Smoke"})
	public void demo7()
	{
		System.out.println("Smoke Test4");
	}
	@Test
	public void demo8()
	{
		System.out.println("Hi1");
	}
}
