package chromeTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SelTest {
	@Test
	public void cTest(){
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
