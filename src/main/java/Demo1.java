import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Demo1 {

	public static void main(String[] args) throws MalformedURLException {
DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "emulator-5554");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "6.0");
		cap.setCapability("appPackage","com.android.calculator2");
		cap.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		
				@SuppressWarnings("rawtypes")
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		System.out.println("Calculator launched");

	}

}
