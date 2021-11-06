package org.multiscenario;

import java.awt.AWTException;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclass.BaseClass;

public class UptoBase_Class extends BaseClass {
	public static void main(String[] args) throws AWTException  {
		Search_Engine("chrome");
		get_url("https://demoqa.com/automation-practice-form");
		WebElement firstname = driver.findElement(By.id("firstName"));
		inputvalue(firstname, "sridhar");
		WebElement lastname = driver.findElement(By.id("lastName"));
		inputvalue(lastname, "kumar");
		WebElement email = driver.findElement(By.id("userEmail"));
		inputvalue(email, "sridharsarvesh@gmial.com");
		WebElement phone = driver.findElement(By.id("userNumber"));
		inputvalue(phone, "8190983883");
		WebElement gender = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[1]"));
		clickonelement(gender);
		WebElement calander = driver.findElement(By.id("dateOfBirthInput"));
		clickonelement(calander);
		WebElement birthmonth = driver.findElement(By.className("react-datepicker__month-select"));
		select("selectbyvalue", birthmonth, "1");
		WebElement birthyear = driver.findElement(By.className("react-datepicker__year-select"));
		select("selectbyvalue", birthyear, "1991");
		WebElement DOB = driver.findElement(By.xpath("(//div[@role='option'])[27]"));
		clickonelement(DOB);
		WebElement subject = driver.findElement(By.id("subjectsInput"));
		javascriptelement(subject);
		inputvalue(subject, "Hindi");
		Robot("keypress", KeyEvent.VK_ENTER);
		Robot("keyrelease",KeyEvent.VK_ENTER);
		WebElement hobby = driver.findElement(By.xpath("//label[text()='Sports']"));
		clickonelement(hobby);
		WebElement address = driver.findElement(By.id("currentAddress"));
		inputvalue(address, "Hi");
		WebElement state = driver.findElement(By.xpath("//div[text()='Select State']"));
		clickonelement(state);
		WebElement statee = driver.findElement(By.xpath("//div[text()='Uttar Pradesh']"));
		clickonelement(statee);
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		clickonelement(submit);
		
		
	}

}

