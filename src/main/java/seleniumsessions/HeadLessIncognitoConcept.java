package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessIncognitoConcept {

	public static void main(String[] args) {
		
		//headless -- no browser
		//testing in the background
		// faster than the normal mode
		
		//Disadvantages
		//might not work for complex apps
		//generally avoided headless mode
		// not a industry practice
		// quickly used for sanity  sometimes
		// running in headless mode is not actually testing
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions co = new ChromeOptions();
		//co.setHeadless(true);
		// *****another option to run as headless ****
		//co.addArguments("--headless");
		
		// *****for incognito mode ****
		// to make sure your apps is running fine in incognito mode
		co.addArguments("--incognito");
		
		
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.google.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.quit();
		
		
		
		
	}

}
