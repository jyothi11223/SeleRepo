package testscript;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Base {
	public WebDriver driver;// for initializing drive
	//WebDriver driver= new EdgeDriver();
	public void browserInitialization()
	{
		driver= new ChromeDriver();
		driver.get("https://selenium.qabible.in/.");//for entering url
		driver.manage().window().maximize();//for maximize the size of window
		//driver.quit();//for quiting from opened browser
		//driver.close();//for closing current window
		
	}
	public void driverQuitandClose()
	{
		driver.quit();//for quiting from opened browser
		//driver.close();//for closing current window
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Base base=new Base();
base.browserInitialization();
	}

}
