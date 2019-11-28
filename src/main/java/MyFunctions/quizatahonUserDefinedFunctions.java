package MyFunctions;

import java.awt.AWTException;
import java.awt.datatransfer.StringSelection;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GTRAutomation.QUIZATAHON.QuizatahonExcelParse;
import GTRAutomation.QUIZATAHON.QuizatahonPageSteps;
import GTRAutomation.QUIZATAHON.QuizatahonPageobject;
import lombok.extern.slf4j.Slf4j;
@Slf4j
public class quizatahonUserDefinedFunctions 
{
	public static WebDriver webDriver;
	WebDriver wait;
	JavascriptExecutor js;


	@BeforeMethod
	public static void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","/home/ajith/Documents/Apps/chromedriver_linux64/chromedriver");
		webDriver= new ChromeDriver();	
		webDriver.manage().window().maximize();
		//webDriver.get("https://gtr.agiletestingalliance.org/papers.html");
		webDriver.get("https://gtr.agiletestingalliance.org/quizatahon.html");

	}
	@DataProvider
	public Iterator<Object[]>getValues()

	{
		ArrayList<Object[]> testdata= QuizatahonExcelParse.parseExcelData();
		return testdata.iterator();

	}
	public void waitUntilTheElementIsClickable(String xpath)
	{
		WebDriverWait wait = new WebDriverWait(webDriver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));

	}
	public void alertAccept()
	{
		Alert alert = webDriver.switchTo().alert();
        alert.accept();
	}
	public void alertDismiss()
	{
		Alert alert = webDriver.switchTo().alert();
        alert.dismiss();
	}
	public void clickElementByXpath(String xpath)
	{
		webDriver.findElement(By.xpath(xpath)).click();
	}  
	public void typeByXpath(String xpath, String text)
	{
		webDriver.findElement(By.xpath(xpath)).sendKeys(text);
	}
	public void dropDownOption(String text,String text1)
	{
		Select option = new Select(webDriver.findElement(By.xpath(text)));
		option.selectByVisibleText(text1);
	}
	public void waitForParticularTime()
	{
		webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	public void newTab(Integer i)
	{
		ArrayList<String> newTab = new ArrayList<String>(webDriver.getWindowHandles());
		webDriver.switchTo().window(newTab.get(i));
	}
	public void scrollDown()
	{
		JavascriptExecutor js = (JavascriptExecutor) webDriver;
		js.executeScript("scroll(0,1000);");
	}
	public void scrollToMiddle()
	{
		JavascriptExecutor js = (JavascriptExecutor) webDriver;
		js.executeScript("scroll(0,600);");
	}
	public void scrollTop()
	{
		JavascriptExecutor js = (JavascriptExecutor) webDriver;
		js.executeScript("scroll(0,300);");
	}
	public void waitUntilTheElementIsVisible(String text)
	{
		WebDriverWait wait = new WebDriverWait(webDriver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(text)));

	}
	public void refreshElement(String text)
	{
		webDriver.findElement(By.xpath(text)).clear();
	}
	public void scrollUsingElement(String text) 
	{

		WebElement element = webDriver.findElement(By.xpath(text));
		((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", element);
		webDriver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	}
	public static void setClipboardData(String string) {
		StringSelection stringSelection = new StringSelection(string);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	}
	public void robotKey(String fileLocation) throws AWTException
	{

		setClipboardData(fileLocation);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);




	}
		@AfterMethod
		public void end()
		{
			webDriver.close();
				
		}
		
		@AfterMethod
		public void endup()
		{
			webDriver.quit();
				
		}
	
}