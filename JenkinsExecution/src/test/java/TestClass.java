import org.testng.annotations.Test;

public class TestClass {

	
	@Test(priority=1)
	public void ShowMessage()
	{
		System.out.println("This is hello for jenkins maven execution from show method");
	}
	
	@Test
	public void zDisplayMessage()
	{
		System.out.println("This is hello for jenkins maven execution from display method");
	}


}
