/*## Automation of Resolution Testing and Screenshots using Selenium Web Drivers

We want the candidate to test and check the website is opening correctly.
In multiple browsers and resolutions. 
We want them to create a folder for each Browser and Resolution 
where in they save the screenshot of the whole page saved.*/

package dealsdray;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class UI_Launching1stwebsite {
	WebDriver driver;
	@Test
	@Parameters("browser1")
	public void first_website( String name_of_browser) throws IOException
	{
		if(name_of_browser.equals("edge"))
		{
			driver=new EdgeDriver();
			
		}
		if(name_of_browser.equals("chrome"))
		{
			driver=new ChromeDriver();
			
		}
		if(name_of_browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
			
		}
		// Main website
		driver.navigate().to("https://www.getcalley.com/page-sitemap.xml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// First website launch
		WebElement first_website=driver.findElement(By.linkText("https://www.getcalley.com/"));
		first_website.click();
		TakesScreenshot s  =(TakesScreenshot) driver; 
	     File source= s.getScreenshotAs(OutputType.FILE); 
		File destination=new File("C:\\TestNG1\\ChromeScreenshot\\Chromescreenshot8.png");
		FileUtils.copyFile(source, destination);
		
		//find the resolution
		driver.manage().window().setSize(new Dimension(1920,1080));
		driver.navigate().back();
		
		// second website launch
		WebElement second_website=driver.findElement(By.linkText("https://www.getcalley.com/calley-lifetime-offer/"));
		second_website.click();
		TakesScreenshot s1  =(TakesScreenshot) driver; 
	     File source1= s1.getScreenshotAs(OutputType.FILE); 
		File destination1=new File("C:\\TestNG1\\FirefoxScreenshot\\firefoxscreenshot9.png");
		FileUtils.copyFile(source1, destination1);
		
		//find the resolution
		driver.manage().window().setSize(new Dimension(1366,768));
		driver.navigate().back();
		
		// third website launch
		WebElement third_website=driver.findElement(By.linkText("https://www.getcalley.com/see-a-demo/"));
		third_website.click();
		TakesScreenshot s3  =(TakesScreenshot) driver; 
	     File source3= s3.getScreenshotAs(OutputType.FILE); 
		File destination3=new File("C:\\TestNG1\\EdgeScreenshot\\edgescreenshot6.png");
		FileUtils.copyFile(source3, destination3);
		//find the resolution
				driver.manage().window().setSize(new Dimension(1536,864));
		driver.navigate().back();
		
		//fourth website launch
		WebElement fourth_website=driver.findElement(By.linkText("https://www.getcalley.com/calley-teams-features/"));
		fourth_website.click();
		TakesScreenshot s4  =(TakesScreenshot) driver; 
	     File source4= s4.getScreenshotAs(OutputType.FILE); 
		File destination4=new File("C:\\TestNG1\\Edge2Screenshot\\perascreenshot5.png");
		FileUtils.copyFile(source4, destination4);
		driver.navigate().back();
		
		//fifth website launch
		WebElement fifth_website=driver.findElement(By.linkText("https://www.getcalley.com/calley-pro-features/"));
		fifth_website.click();
		TakesScreenshot s5  =(TakesScreenshot) driver; 
	     File source5= s5.getScreenshotAs(OutputType.FILE); 
		File destination5=new File("C:\\TestNG1\\Chrome2Screenshot\\safariscreenshot7.png");
		FileUtils.copyFile(source5, destination5);
		
		
		
		
	}

}
