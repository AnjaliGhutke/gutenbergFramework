package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public static Logger log = null;
	private static boolean isInitalized=false;

	

//	public  static EventFiringWebDriver e_driver;
//	public static WebEventListener eventListener;
	
	public TestBase(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException exp) {
			exp.printStackTrace();
		}
		
		if(!isInitalized){
			initLogs();

		}
		

	}	
	
	private static void initLogs(){
		if (log == null){
//			DOMConfigurator.configure(System.getProperty("user.dir")+File.separator+"config"+File.separator+"log4j.xml");
			DOMConfigurator.configure(System.getProperty("user.dir")+File.separator+"log4j.xml");

			log = Logger.getLogger("MyLogger");
			log.info("Logger is initialized..");
		}
	}

	public static void initializeDriver(){
		String browserName = prop.getProperty("browser");
		String url = prop.getProperty("url");

		if(browserName.equals("chrome")){
			WebDriverManager.chromedriver().setup();
			driver =  new ChromeDriver();
		}
		else if(browserName.equals("FF")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(); 
		}		
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	

		driver.get(url);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

}




