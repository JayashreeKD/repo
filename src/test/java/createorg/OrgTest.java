package createorg;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class OrgTest {
	
	@Test
	public void createOrgtest(){
		System.out.println("Organisation created sucessfully");
	}
	public void modifycontacttest() {
		System.out.println("Organisation modifies sucessfully");
	}
	
		
	@Test(groups="smoketesting")
	public void createorgtest()
	{
		System.out.println("Created organisation");
		
		}
		@Test(groups="regresstesting")
		public void modifyorgTest()
		{
			System.out.println("org modified");
			
		}
		

}
