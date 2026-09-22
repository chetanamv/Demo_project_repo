package pac1;

import org.testng.annotations.Test;

public class CreatecontactTest {
	
	@Test
	
	public void createcontactTest()
	{
		
		String BROWSER=System.getProperty("browser", "chrome");
		String URL=System.getProperty("url");
		String USERNAME=System.getProperty("username", "admin");
		String PASSWORD=System.getProperty("password", "admin");
		
		
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		
		System.out.println("createcontactTest executed");
	}
	
	
@Test
	
	public void ModifycontactTest()
	{
		System.out.println("ModifycontactTest executed");
	}
	

}
