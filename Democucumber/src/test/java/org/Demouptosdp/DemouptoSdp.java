package org.Demouptosdp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;

import POMDemo.POM_Demo;
import baseclass.BaseClass;

public class DemouptoSdp extends BaseClass {

	public static WebDriver driver=BaseClass.Search_Engine("chrome");
//	public static POM_Demo pom = new POM_Demo(driver);
		public static void main(String[] args) throws AWTException {
			POM_Demo pom = new POM_Demo(driver);
//		WebElement firstname = driver.findElement(By.id("firstName"));
//		WebElement lastname = driver.findElement(By.id("lastName"));
//		WebElement mailid = driver.findElement(By.id("userEmail"));
//		WebElement radio = driver.findElement(By.xpath("//label[.='Male']"));
//		WebElement phone = driver.findElement(By.id("userNumber"));
//		WebElement DOB = driver.findElement(By.id("dateOfBirthInput"));
//		WebElement dropdown1 = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
//		WebElement dropdown2 = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
//		WebElement dropdown3 = driver.findElement(By.xpath("(//div[@role='option'])[27]"));
//		WebElement subject = driver.findElement(By.id("subjectsInput"));
//		WebElement sub = driver.findElement(By.xpath("//div[text()='Hindi']"));
//		WebElement hobbby = driver.findElement(By.id("subjects-label"));
//		WebElement hobby = driver.findElement(By.xpath("//label[text()='Sports']"));
//		WebElement address = driver.findElement(By.id("currentAddress"));
//		WebElement state = driver.findElement(By.id("state"));
//		WebElement statee = driver.findElement(By.xpath("//div[text()='Uttar Pradesh']"));
//		WebElement city = driver.findElement(By.id("city"));
//		WebElement district = driver.findElement(By.xpath("//div[text()='Agra']"));
//		clickonelement(district);
//		WebElement submit = driver.findElement(By.id("submit"));
//		Search_Engine("chrome");
	
		get_url("https://demoqa.com/automation-practice-form");
		inputvalue(pom.getFirstname(), "sridhar");
		inputvalue(pom.getLastname(), "k");
		inputvalue(pom.getEmail(), "sridharsarvesh@gmail.com");
		clickonelement(pom.getGender());
		inputvalue(pom.getPhone(), "8190983883");
		clickonelement(pom.getCalander());
		wait(4);
		select("selectbyvalue", pom.getDOM(), "1");
		select("selectbyvalue", pom.getDOY(), "1991");
		clickonelement(pom.getDOB());
		javascriptelement(pom.getSubject());
		inputvalue(pom.getSubject(), "Hindi");
		Robot kb=new Robot();
		kb.keyPress(KeyEvent.VK_ENTER);
		kb.keyRelease(KeyEvent.VK_ENTER);
		clickonelement(pom.getSubject());
		clickonelement(pom.getHobby());
		clickonelement(pom.getSports());
		inputvalue(pom.getAddress(), "Hello");
		clickonelement(pom.getState());
		clickonelement(pom.getStatee());
		clickonelement(pom.getSubmit());
		
}
	
}
