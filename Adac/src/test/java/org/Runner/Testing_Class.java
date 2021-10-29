package org.Runner;

import org.baseclass.adactin.BaseClass_Adactin;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\org\\featurefile\\Training.feature", 
glue="org.StepD",plugin= {"html:Report/HtmlReport","pretty","json:Report/jsonreport"},
monochrome=true,strict=true
)
public class Testing_Class {
	public static WebDriver driver;
	@BeforeClass
	public static void set_Up() {

		driver = BaseClass_Adactin.Search_Engine("chrome");
	}
	
	@AfterClass
	public static void tear_Down() {
			driver.close();
	}
}
