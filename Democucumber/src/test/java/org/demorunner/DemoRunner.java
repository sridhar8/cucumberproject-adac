package org.demorunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import baseclass.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\sri\\eclipse-workspace\\Democucumber\\src\\test\\java\\Demo.feature",glue = "org.demostepd.com",
monochrome=true ,//dryRun=true,
//strict=true
plugin= {"html:Report/html","json:Jason/report","pretty"}//"com.cucumber.listener.ExtentCucumberFormatter:Report/report.html"}
)
public class DemoRunner extends BaseClass {
	@BeforeClass
	public static void Set_up() {
		Search_Engine("chrome");
	}

	@AfterClass
	public static void Tear_down() {
		driver.close();
	}
}
