package org.multiscenario;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import baseclass.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\sri\\eclipse-workspace\\multiscenario\\src\\test\\java\\multiscenario.feature",glue="org.stepDmulti",
monochrome=true,
//dryRun=true,
plugin={"html:Report/html.html"},tags="@User01")

public class Runner_Class_MultiScenario extends BaseClass {

	@BeforeClass
	public static void Set_up() {
		Search_Engine("chrome");
	}
	@AfterClass
	public static void Tear_down() {
		driver.close();
	}
}
