import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckboxDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\verizon sw\\selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Boolean vCheck = driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
		System.out.println(vCheck);
		Thread.sleep(3000);
		Select s = new Select(driver.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[2]/td[3]/select")));
		s.selectByVisibleText("What is the name of your first school?");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[4]/td[3]/input")).sendKeys("ABC");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[6]/td[3]/input")).sendKeys("Rani");
		Thread.sleep(3000);
		driver.close();
	}

}
