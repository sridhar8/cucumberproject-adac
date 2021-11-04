package orguptobasecalss.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclass.BaseClass;

public class UptoBaseClassDemo extends BaseClass{


	public static void main(String[] args) throws AWTException {
		Search_Engine("chrome");
		get_url("https://demoqa.com/automation-practice-form");
		WebElement firstname = driver.findElement(By.id("firstName"));
		inputvalue(firstname, "sridhar");
		WebElement lastname = driver.findElement(By.id("lastName"));
		inputvalue(lastname, "k");
		WebElement mailid = driver.findElement(By.id("userEmail"));
		inputvalue(mailid, "sridharsarvesh@gmail.com");
		WebElement radio = driver.findElement(By.xpath("//label[.='Male']"));
		clickonelement(radio);
		WebElement phone = driver.findElement(By.id("userNumber"));
		inputvalue(phone, "8190983883");
		WebElement DOB = driver.findElement(By.id("dateOfBirthInput"));
		clickonelement(DOB);
		wait(4);
		WebElement dropdown1 = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		select("selectbyvalue", dropdown1, "1");
		WebElement dropdown2 = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		select("selectbyvalue", dropdown2, "1991");
		WebElement dropdown3 = driver.findElement(By.xpath("(//div[@role='option'])[27]"));
		clickonelement(dropdown3);
		WebElement subject = driver.findElement(By.id("subjectsInput"));
		javascriptelement(subject);
		inputvalue(subject, "Hindi");
		Robot("keypress", KeyEvent.VK_ENTER);
		Robot("keyrelease", KeyEvent.VK_ENTER);
		
		WebElement hobbby = driver.findElement(By.id("subjects-label"));
		clickonelement(hobbby);
		WebElement hobby = driver.findElement(By.xpath("//label[text()='Sports']"));
		clickonelement(hobby);
		WebElement address = driver.findElement(By.id("currentAddress"));
		inputvalue(address, "Hello");
		WebElement state = driver.findElement(By.id("state"));
		clickonelement(state);
		WebElement statee = driver.findElement(By.xpath("//div[text()='Uttar Pradesh']"));
		clickonelement(statee);
//		WebElement city = driver.findElement(By.id("city"));
//		WebElement district = driver.findElement(By.xpath("//div[text()='Agra']"));
//		clickonelement(district);
		WebElement submit = driver.findElement(By.id("submit"));
		clickonelement(submit);
		
		
	
	
	}

}
