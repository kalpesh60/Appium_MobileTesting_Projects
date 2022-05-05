import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

	public class NewTest {
		@SuppressWarnings("rawtypes")
		AndroidDriver driver;
		
		@SuppressWarnings("rawtypes")
		@BeforeClass
		public void setUp() throws MalformedURLException{
			//Set up desired capabilities and pass the Android app-activity and app-package to Appium
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("deviceName", "emulator-5554");
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "6.0");
			cap.setCapability("appPackage","com.android.calculator2");
			cap.setCapability("appActivity", "com.android.calculator2.Calculator");
			
			driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
			System.out.println("Calculator launched");
		}
		
		@Test
		public void testCal() throws Exception {
		   //locate the Text on the calculator by using By.name()
			driver.findElement(By.id("com.android.calculator2:id/digit_7")).click();
			driver.findElement(By.id("com.android.calculator2:id/op_add")).click();
			driver.findElement(By.id("com.android.calculator2:id/digit_8")).click();
			WebElement resultElement = driver.findElement(By.id("com.android.calculator2:id/eq"));
			resultElement.click();
			System.out.println("res:"+resultElement);
		   assertEquals(resultElement, 15);
	}
	}