package testNg;

import org.testng.annotations.Test;

public class Grouping {
	
	@Test(groups= {"smoke","integration"})
	public void testcase1()
	{
		

	}
	@Test(groups= {"smoke"})
	public void testcase2()
	{
		

	}
	@Test(groups= {"system"})
	public void testcase3()
	{
		

	}


}
