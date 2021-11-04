package org.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclass.BaseClassFaceBook;
import pomfacebook.Login_FaceBook;

public class AfterBaseClass_FaceBook extends BaseClassFaceBook{
//	new Login_FaceBook
	public static void main(String[] args) {
		Search_Engine("chrome");
		get_url("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjM1ODY1NzAyLCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D");
		wait(4);
		Login_FaceBook login = new Login_FaceBook(driver);
//		WebElement email = driver.findElement(By.id("email"));
		
		inputvalue(login.getEmail(), "8190983883");
		
//		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		inputvalue(login.getPassword(), "8190983883");
//		WebElement login = driver.findElement(By.xpath("//div[@class='_xkt']"));
		clickonelement(login.getLogin());
		
	}

}
