package org.cucumbershoping;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import baseclass.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\sri\\eclipse-workspace\\shoping\\src\\test\\java\\cucumber\\shopping.feature",glue="org.steppD",
monochrome=true, plugin={"html:Report/Report.html"})
public class Runner_shopp extends BaseClass {
	@BeforeClass
	public static void SetUp() {
	Search_Engine("chrome");
}
	@AfterClass
	public static void TearDowm() {
		driver.close();
	}
}