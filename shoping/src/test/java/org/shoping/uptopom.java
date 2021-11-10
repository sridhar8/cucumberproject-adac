package org.shoping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import baseclass.BaseClass;
import pomclass.pomshoping;

public class uptopom extends BaseClass{
	
	public static void main(String[] args) {
	Search_Engine("chrome");	
	get_url("http://automationpractice.com/index.php");
	pomshoping pom=new pomshoping(driver);
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
