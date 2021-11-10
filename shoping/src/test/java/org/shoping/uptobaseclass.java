package org.shoping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclass.BaseClass;

public class uptobaseclass extends BaseClass {

	public static void main(String[] args) {
		Search_Engine("chrome");
		get_url("http://automationpractice.com/index.php");
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		clickonelement(signin);
		WebElement username = driver.findElement(By.id("email"));
		inputvalue(username, "greens@gmail.com");
		WebElement password = driver.findElement(By.id("passwd"));
		inputvalue(password, "Ashur@12345");
		WebElement login = driver.findElement(By.id("SubmitLogin"));
		clickonelement(login);
		wait(4);
		WebElement dresses = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		action(dresses, "onlyperform");
		WebElement casualdress = driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[2]"));
		clickonelement(casualdress);
		wait(5);
//		get_url("http://automationpractice.com/index.php?id_category=9&controller=category");
		WebElement scroll = driver.findElement(By.xpath("//form[@method='post']"));
		javascriptelement(scroll);
		WebElement mobqickview = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
		clickonelement(mobqickview);
		wait(4);
		int frame = driver.findElements(By.tagName("iframe")).size();
		System.out.println(frame);
//		switchToFramebyIndex(0);
//		driver.switchTo().frame("");
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		switchToFramebyElement(iframe);
		WebElement qtyadd = driver.findElement(By.xpath("(//a[@data-field-qty='qty'])[2]"));
		clickonelement(qtyadd);
		clickonelement(qtyadd);
		WebElement size = driver.findElement(By.xpath("//select[@class='form-control attribute_select no-print']"));
		select("selectbyvalue", size, "2");
		WebElement addtocart1 = driver.findElement(By.xpath("//button[@class='exclusive']"));
		clickonelement(addtocart1);
		switchintoDefaultFrame();
		wait(5);
		WebElement ckeckoutaddcartsummary = driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]"));
		clickonelement(ckeckoutaddcartsummary);
		wait(4);
		WebElement ckeckoutonsummary = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		javascriptelement(ckeckoutonsummary);
		clickonelement(ckeckoutonsummary);
		wait(5);
		WebElement addcon = driver.findElement(By.name("message"));
		javascriptelement(addcon);
		inputvalue(addcon, "Hi");
		WebElement addresc = driver.findElement(By.name("processAddress"));
		clickonelement(addresc);
		wait(4);
		WebElement track = driver.findElement(By.id("cgv"));
		javascriptelement(track);
		clickonelement(track);
		WebElement trackid = driver.findElement(By.name("processCarrier"));
		clickonelement(trackid);
		wait(4);
		WebElement bankwire = driver.findElement(By.xpath("//a[@class='bankwire']"));
		javascriptelement(bankwire);
		clickonelement(bankwire);
		wait(5);
		WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		clickonelement(submit);
		WebElement logout = driver.findElement(By.className("logout"));
		clickonelement(logout);
		
		
		
		
	}
	
	
	
	
}
