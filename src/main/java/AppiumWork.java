import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class AppiumWork {
	public static void main(String[] args) throws MalformedURLException, InterruptedException{
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "emulator-5554");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "6.0");
		cap.setCapability("appPackage","com.android.calculator2");
		cap.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		
				@SuppressWarnings("rawtypes")
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		System.out.println("Calculator launched");
		
		driver.findElement(By.id("com.android.calculator2:id/digit_7")).click();
		driver.findElement(By.id("com.android.calculator2:id/op_add")).click();
		driver.findElement(By.id("com.android.calculator2:id/digit_8")).click();
		WebElement resultElement = driver.findElement(By.id("com.android.calculator2:id/eq"));
		resultElement.click();
		System.out.println("Done");
		
	}
}
