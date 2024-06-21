package freelancer.seleniumFW;

import java.awt.Desktop.Action;
import java.lang.reflect.Array;
//import java.time.Duration;
//import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class StandAloneTest {


	

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.manage().window().maximize();
		//w.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	
		w.get("https://rahulshettyacademy.com/client");	
		//System.out.println("Successfully login******");
		
		w.findElement(By.id("userEmail")).sendKeys("swati.vini11@gmail.com");
		w.findElement(By.id("userPassword")).sendKeys("Rishabh27!");
		
		//login
	
		w.findElement(By.id("login")).click();
		Thread.sleep(5000);
	
		List<WebElement> li=w.findElements(By.xpath("//div[@class='card-body']"));
	
		w.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		for (WebElement w1 : li)
		{

            //Thread.sleep(3000);
            Actions actions = new Actions(w);
            actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform(); 
           // w1.click();
           // Thread.sleep(3000);
            
            
            
			}
		}


}
