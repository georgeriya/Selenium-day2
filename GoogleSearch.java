import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String search[]={"Apple XS","Samsung Note 10","One Plus 7 Pro","Redmi K10","Pixel 3"};
		String result,text;
		System.setProperty("webdriver.gecko.driver", "C:\\verizon sw\\selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");
		driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys(search[0]);
		text= driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).getAttribute("value");
		System.out.println(text);
		if(search[0].equals(text))
			System.out.println("Pass");
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]")).click();
		result = driver.findElement(By.xpath("//*[@id='resultStats']")).getText(); //
		
		driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).clear();
		//System.out.println(driver.findElement(By.xpath("//*[@class='erkvQe']")).getText());
		System.out.println(result);
		Thread.sleep(3000);
		
		for (int i = 1; i < search.length; i++) {
			driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys(search[i]);
			System.out.println(driver.findElement(By.xpath("//*[@class='erkvQe']")).getText());
			text= driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).getAttribute("value");
			System.out.println(text);
			
			if(search[i].equals(text))
				{
				System.out.println("Pass");
				}
			
			driver.findElement(By.xpath("//*[@class='z1asCe MZy1Rb']")).click();
			
			result = driver.findElement(By.xpath("//*[@id='resultStats']")).getText();
			driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).clear();
			
			System.out.println(result);
			Thread.sleep(3000);
			
		}
		//Thread.sleep(3000);
		//System.out.println(driver.findElement(By.xpath("//*[@class='erkvQe']")).getText());
		driver.close();
	}

}
