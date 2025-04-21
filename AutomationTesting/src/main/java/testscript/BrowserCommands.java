package testscript;

public class BrowserCommands extends Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserCommands browsercommands= new BrowserCommands();
		browsercommands.browserInitialization();
		browsercommands.browserCommands();
		browsercommands.driverQuitandClose();
		
	}
public void browserCommands()
{
String title=driver.getTitle();// get the title of current page which is open

String currenturl=driver.getCurrentUrl();//
String pagesource=driver.getPageSource();
//System.out.println(title);
//System.out.println(currenturl);
System.out.println(pagesource);
}
}
