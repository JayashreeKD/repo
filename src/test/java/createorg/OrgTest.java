package createorg;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class OrgTest {
	
	
		
	@Test(groups="smoketesting")
	public void createorgtest()
	{
		System.out.println("Created organisation" +System.getProperty("Browser"));
		
		}
		@Test(groups="regresstesting")
		public void modifyorgTest()
		{
			System.out.println("org modified");
			
		}
		

}
