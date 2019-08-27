import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\verizon sw\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/div/a[2]/span[2]"))).build().perform();
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[4]/div[2]/div[2]/div/div[1]/div/a")).click();
		
		Thread.sleep(3000);
		driver.close();
	}

}
