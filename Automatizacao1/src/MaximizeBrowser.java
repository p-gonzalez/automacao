import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MaximizeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Pablo\\Documents\\java selenium\\browsers\\geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette",true);
		
		try {
			WebDriver driver = new FirefoxDriver();
			driver.get("http://www5.trf5.jus.br/rpvprecatorio/");
			driver.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL + "t");
			driver.get("http://jef.trf5.jus.br/acompanhamentoProcessual/acompanhamentoProcessual.php");
			driver.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL + "t");
			driver.get("https://www4.trf5.jus.br/certidoes/");
			driver.manage().window().maximize();
			Thread.sleep(1800);
			
		}catch(Exception e) {
			System.out.println(e);
			
		}
	}

}
