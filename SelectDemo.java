import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\verizon sw\\selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		
		Select s = new Select(driver.findElement(By.id("country")));
		Thread.sleep(3000);
		s.selectByIndex(3);
		Thread.sleep(3000);
		s.selectByValue("87");
		Thread.sleep(3000);
		s.selectByVisibleText("United States");
		Thread.sleep(3000);
		System.out.println(s.isMultiple()); //multiple options can be chosen
		
		
		driver.close();
		
	}

}
