package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CssSelector extends Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
public void tagAndId()
{
	WebElement tagandidtext1=driver.findElement(By.cssSelector("input#single-input-field"));
	WebElement tagandidbutton=driver.findElement(By.cssSelector("button#button-one"));
	WebElement tagandidtext2=driver.findElement(By.cssSelector("input#value-a"));
	WebElement tagandidtext3=driver.findElement(By.cssSelector("input#value-b"));
	WebElement tagandidtext4=driver.findElement(By.cssSelector("input#validationCustom01"));
	
	//Tag and ID(tag#id)
}
public void tagAndClass()
{
	WebElement tagandclasstext1=driver.findElement(By.cssSelector("div.header-top"));//Tag and class(tag.class)
	WebElement tagandclasstext2=driver.findElement(By.cssSelector("textarea.form-control"));
	WebElement tagandclasstext3=driver.findElement(By.cssSelector("a.navbar-brand"));
	WebElement tagandclasstext4=driver.findElement(By.cssSelector("div.mb-sec"));
	WebElement tagandclasstext5=driver.findElement(By.cssSelector("section.clearfix"));
	
	}
public void tagAndAttribute()
{
	WebElement tagandattribute1=driver.findElement(By.cssSelector("input[id='single-input-field']"));	//Tag and Attribute(tag[attribute=value]
	WebElement tagandattribute2=driver.findElement(By.cssSelector("button[id='button-one']"));
	WebElement tagandattribute3=driver.findElement(By.cssSelector("input[id='value-a']"));
	WebElement tagandattribute4=driver.findElement(By.cssSelector("input[id='subject']"));
	WebElement tagandattribute5=driver.findElement(By.cssSelector("span[id='select2-l5qr-container']"));
	}
public void tagClassAndAttribute()
{
	WebElement tagclassandattribute1=driver.findElement(By.cssSelector("input.form-control[ id=validationCustom01]"));
	WebElement tagclassandattribute2=driver.findElement(By.cssSelector("input.form-control[id='subject']"));
	WebElement tagclassandattribute3=driver.findElement(By.cssSelector("textarea.form-control[id='description']"));
	WebElement tagclassandattribute4=driver.findElement(By.cssSelector("input.form-control[id='subject']"));
	WebElement tagclassandattribute5=driver.findElement(By.cssSelector("span.select2-selection__rendered[id='select2-lap2-container']"));
	//Tag,class,and Attribute(tag.classname[attribute=value]	
}

}
//1.Tag and ID(tag#id)
		//2.Tag and class(tag.class)
		//3.Tag and Attribute(tag[attribute=value]
		//4.Tag,class,and Attribute(tag.classname[attribute=value]