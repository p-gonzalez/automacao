import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class RefreshPagina {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Pablo\\Documents\\java selenium\\browsers\\geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://pablogonzalez853.blogspot.com");
		
		try {
			Thread.sleep(5000);
			
		}catch(InterruptedException e ) {
			e.printStackTrace();
			
		}
		int cont = 0;
		while (cont < 10) {
			
			driver.navigate().refresh();
			cont++;
			
		}
		
	
	}

}
