import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AbrirNavegador {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Pablo\\Documents\\java selenium\\browsers\\geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		
		try {
			WebDriver driver = new FirefoxDriver();
			driver.get("http://www4.trf5.jus.br/WSSarh/sarh?wsdl");
			Thread.sleep(1800);
		}catch(Exception e) {
			
			System.out.println(e);
		}
		
		
		
	}

}
