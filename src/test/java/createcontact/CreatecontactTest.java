package createcontact;

import org.testng.annotations.Test;

public class CreatecontactTest {
	@Test
	public void createcontacttest()
	{
		System.out.println("Contact created sucessflly");
	}
	@Test
	public void modifycontacttest() {
		System.out.println("contact modigied sucessfully");
	}
	
	@Test
	public void deletecontacttest()
	{
		System.out.println("delete the contact");
	}
	@Test(groups="smoketesting")
	public void contacttest()
	{
		System.out.println("Contact created sucessfully");
	}
	@Test(groups="regresstesting")
	public void modifycontactingtest()
	{
		System.out.println("contact modified sucessfully");
	}

}
