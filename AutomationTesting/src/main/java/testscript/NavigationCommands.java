package testscript;

public class NavigationCommands extends Base{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigationCommands navigationcommands=new NavigationCommands();
		navigationcommands.browserInitialization();
		navigationcommands.navigationCommands();
		//navigationcommands.driverQuitandClose();
	}
public void navigationCommands()
{
	driver.navigate().to("https://www.flipkart.com/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
}
}
