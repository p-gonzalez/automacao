import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AbrirSegundaAba {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Pablo\\Documents\\java selenium\\browsers\\geckodriver.exe");
		DesiredCapabilities capabilities =  DesiredCapabilities.firefox(); 
		
		try {
			
			WebDriver driver = new FirefoxDriver();
			driver.get("http://google.com");
			driver.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL + "t");
			driver.get("http://facebook.com");
		}catch(Exception e) {
			System.out.println(e);
			
		}
	}

}
