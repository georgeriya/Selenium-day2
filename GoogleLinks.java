import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleLinks {
	public static void main(String[] args) throws InterruptedException {
		String eachLink;
		System.setProperty("webdriver.gecko.driver", "C:\\verizon sw\\selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++){
			if(links.get(i).getText().isEmpty()==false && links.get(i).getText().matches("[a-zA-Z]+"))
				System.out.println(links.get(i).getText());
				//System.out.println(links.get(i).getAttribute("href"));
		}
		driver.close();
	}

}
