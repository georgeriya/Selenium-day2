import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\verizon sw\\selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		
		driver.findElement(By.xpath("//input[@value='Butter']")).click();
		Thread.sleep(2000);
		//Boolean vRadio = driver.findElement(By.xpath("//input[@value='Butter']")).isSelected();
//		if(vRadio==true)
//			System.out.println("Pass");
//		else
//			System.out.println("Fail");
		
		List<WebElement> vRadio = driver.findElements(By.xpath("//input[@type='radio']"));
		
		for(int i=0;i<vRadio.size();i++){
			System.out.println(vRadio.get(i).getAttribute("value"));
			
			if(vRadio.get(i).getAttribute("value").equals("Cheese")){
				vRadio.get(i).click();
			}
		}
		
		Thread.sleep(3000);
		driver.close();
	}
	

}
