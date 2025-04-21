package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {

	public static void main(String[] args) {
	Locators locators= new Locators();
	locators.browserInitialization();
	locators.id();
	//locators.driverQuitandClose();// TODO Auto-generated method stub

	}
public void  id()
{
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	//WebElement elementname= driver.findElement(By.locator("locator value"));  // syntax for locating element."By" is class it contains 8 locators
	WebElement textfield=driver.findElement(By.id("single-input-field"));
	//textfield.sendKeys("jyothi");
	
	WebElement showmessagebutton=driver.findElement(By.id("button-one"));
	//showmessagebutton.click();
	WebElement textfield2=driver.findElement(By.id("value-a"));
	WebElement textfield3=driver.findElement(By.id("value-b"));
	WebElement gettotalbutton=driver.findElement(By.id("button-two"));
}
public void className()
{
	WebElement textfieldclass=driver.findElement(By.id("header-top"));
	WebElement textfieldclass2=driver.findElement(By.id("clearfix"));
	WebElement textfieldclass3=driver.findElement(By.id("container page"));
	WebElement textfieldclass4=driver.findElement(By.id("mb-sec"));
	
}
public void name()
{
	WebElement textfield1=driver.findElement(By.id("description"));
	WebElement textfield2=driver.findElement(By.id("keywords"));
	WebElement textfield3=driver.findElement(By.id("viewport"));
}
public void linkText()
{
	WebElement textfield1=driver.findElement("Ajax Form Submit");
	WebElement textfield2=driver.findElement("Jquery Select2");
	WebElement textfield3=driver.findElement("Form Submit");
}
public void partialLinkText()
{
	WebElement textfield1=driver.findElement("Ajax Form S");
	WebElement textfield2=driver.findElement("Jquery S");
	WebElement textfield3=driver.findElement("Form S");
}
}
