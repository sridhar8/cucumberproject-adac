package org.multiscenario;

import java.awt.AWTException;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseclass.BaseClass;
import pomclass.POM_Multi;

public class POMmain_Multi extends BaseClass {
	public static WebDriver driver=BaseClass.Search_Engine("chrome");
	public static POM_Multi pom=new POM_Multi(driver);
	
	
	public static void main(String[] args) throws AWTException  {
	
//		Search_Engine("chrome");
//		WebElement firstname = driver.findElement(By.id("firstName"));
//		WebElement lastname = driver.findElement(By.id("lastName"));
//		WebElement email = driver.findElement(By.id("userEmail"));
//		WebElement phone = driver.findElement(By.id("userNumber"));
//		WebElement gender = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[1]"));
//		WebElement calander = driver.findElement(By.id("dateOfBirthInput"));
//		WebElement birthmonth = driver.findElement(By.className("react-datepicker__month-select"));
//		WebElement birthyear = driver.findElement(By.className("react-datepicker__year-select"));
//		WebElement DOB = driver.findElement(By.xpath("(//div[@role='option'])[27]"));
//		WebElement subject = driver.findElement(By.id("subjectsInput"));
//		WebElement hobby = driver.findElement(By.xpath("//label[text()='Sports']"));
//		WebElement address = driver.findElement(By.id("currentAddress"));
//		WebElement state = driver.findElement(By.xpath("//div[text()='Select State']"));
//		WebElement statee = driver.findElement(By.xpath("//div[text()='Uttar Pradesh']"));
//		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		
		get_url("https://demoqa.com/automation-practice-form");
		inputvalue(pom.getFristname(), "sridhar");
		inputvalue(pom.getLastname(), "kumar");
		inputvalue(pom.getEmailId(), "sridharsarvesh@gmial.com");
		inputvalue(pom.getPhoneNumber(), "8190983883");
		clickonelement(pom.getGender());
		clickonelement(pom.getCalander());
		select("selectbyvalue", pom.getBirthmonth(), "1");
		select("selectbyvalue", pom.getBirthyear(), "1991");
		clickonelement(pom.getDob());
		javascriptelement(pom.getSubject());
		inputvalue(pom.getSubject(), "Hindi");
		Robot("keypress", KeyEvent.VK_ENTER);
		Robot("keyrelease",KeyEvent.VK_ENTER);
		clickonelement(pom.getHobby());
		inputvalue(pom.getAddress(), "Hi");
		clickonelement(pom.getState());
		clickonelement(pom.getSelecestate());
		clickonelement(pom.getSubmit());
		
		
	}

}
