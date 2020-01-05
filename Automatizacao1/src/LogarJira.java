import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class LogarJira {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Pablo\\Documents\\java selenium\\browsers\\geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		
		try {
			WebDriver driver = new FirefoxDriver();
			driver.get("https://jira.indra.es/secure/Dashboard.jspa");
			driver.findElement(By.id("login-form-username")).sendKeys("");
			driver.findElement(By.id("login-form-password")).sendKeys("");
			driver.findElement(By.id("login")).click();
			Thread.sleep(8000);
			
			driver.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL + "t");
			driver.get("https://jira.indra.es/secure/CreateIssue.jspa");
			
			//driver.findElement(By.linkText("Create")).click();
			//String currentURL = driver.getCurrentUrl();
			//System.out.println(currentURL);
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
