package Runner_class;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import baseclass.BaseClassFaceBook;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\sri\\git\\fbcucumber\\FbCucumber\\src\\test\\java\\facebooklogin.feature",glue="org.stepD_facebook.com",
plugin= {"html:htmlReport/htmlreport",
		"json:jsonRerport/jsonreport"},
//"com.cucumber.listener.ExtentCucumberFormatter:extentreport/extent.html"},
monochrome=true,
//dryRun=true
strict=true

)

public class FaceBook_runclass {
	public static WebDriver driver;
	
	@BeforeClass
	public static void Set_up() {
	driver=BaseClassFaceBook.Search_Engine("chrome");
	}
	@AfterClass
	public static void Tear_up() {
		
		driver.close();
	}
	
}
