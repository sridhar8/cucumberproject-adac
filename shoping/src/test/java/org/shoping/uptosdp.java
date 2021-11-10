package org.shoping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import baseclass.BaseClass;
import pomclass.pomshoping;

public class uptosdp extends BaseClass{
	public static WebDriver driver=BaseClass.Search_Engine("chrome");
	public static pomshoping pom=new pomshoping(driver);
	public static void main(String[] args) {
//		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
//		WebElement username = driver.findElement(By.id("email"));
//		WebElement password = driver.findElement(By.id("passwd"));
//		WebElement login = driver.findElement(By.id("SubmitLogin"));
//		WebElement dresses = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
//		WebElement casualdress = driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[2]"));
//		WebElement scroll = driver.findElement(By.xpath("//form[@method='post']"));
//		WebElement mobqickview = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
//		switchToFramebyIndex(0);
//		driver.switchTo().frame("");
//		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
//		WebElement qtyadd = driver.findElement(By.xpath("(//a[@data-field-qty='qty'])[2]"));
//		WebElement size = driver.findElement(By.xpath("//select[@class='form-control attribute_select no-print']"));
//		WebElement addtocart1 = driver.findElement(By.xpath("//button[@class='exclusive']"));
//		WebElement ckeckoutaddcartsummary = driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]"));
//		WebElement ckeckoutonsummary = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
//		WebElement addcon = driver.findElement(By.name("message"));
//		WebElement addresc = driver.findElement(By.name("processAddress"));
//		WebElement track = driver.findElement(By.id("cgv"));
//		WebElement trackid = driver.findElement(By.name("processCarrier"));
//		WebElement bankwire = driver.findElement(By.xpath("//a[@class='bankwire']"));
//		WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
//		WebElement logout = driver.findElement(By.className("logout"));
	
		get_url("http://automationpractice.com/index.php");
		clickonelement(pom.getSiginingin());
		inputvalue(pom.getEmailid(), "greens@gmail.com");
		inputvalue(pom.getPassword(), "Ashur@12345");
		clickonelement(pom.getSiginin());
		wait(4);
		action(pom.perform, "onlyperform");
		clickonelement(pom.getCasualdress());
		wait(5);
		javascriptelement(pom.getScrollview());
		clickonelement(pom.getImg());
		wait(4);
		int frame = driver.findElements(By.tagName("iframe")).size();
		System.out.println(frame);
		switchToFramebyElement(pom.getSwitchtoframe());
		clickonelement(pom.getAddqty());
		clickonelement(pom.getAddqty());
		select("selectbyvalue", pom.getSize(), "2");
		clickonelement(pom.getCartadd());
		switchintoDefaultFrame();
		wait(5);
		clickonelement(pom.getAddcartsummary());
		wait(4);
		javascriptelement(pom.getChecksummary());
		clickonelement(pom.getChecksummary());
		wait(5);
		javascriptelement(pom.getMessage());
		inputvalue(pom.getMessage(), "Hi");
		clickonelement(pom.getAddresscon());
		wait(4);
		javascriptelement(pom.getTrack());
		clickonelement(pom.getTrack());
		clickonelement(pom.getTrackid());
		wait(4);
		javascriptelement(pom.getBankchoose());
		clickonelement(pom.getBankchoose());
		wait(5);
		clickonelement(pom.getSumbit());
		clickonelement(pom.getLogout());
		
	}

}
