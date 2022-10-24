package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class espnTableInfo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.espncricinfo.com/series/asia-cup-2022-1327237/afghanistan-vs-india-11th-match-super-four-1327279/full-scorecard");

		By playerInfo = By.xpath("//span[text()='Suryakumar Yadav']/ancestor::td/following-sibling::td");
		String wicketTaker = driver.findElement(playerInfo).getText();
		System.out.println(wicketTaker);
		//List<WebElement> playerScorecard= driver.findElements(By.xpath("//span[text()='Virat Kohli']/ancestor::td/following-sibling::td"));
		
		
	}

}
