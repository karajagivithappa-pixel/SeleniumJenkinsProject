package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ContactTest {
	@Test
	public void createContactTest() {
		System.out.println("executed createContactTest");
	}
	
	@Test
	public void modifyContactTest() {
		System.out.println("executed modifyContactTest");
	}
	
	@Test
	public void runContactTest() throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("http://49.249.29.4:8888/");
		Thread.sleep(3000);
		driver.quit();
		//System.out.println("executed modifyContactTest");
	}
}
