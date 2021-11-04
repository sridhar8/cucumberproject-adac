package org.stepD_facebook.com;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.WebDriver;

import Runner_class.FaceBook_runclass;
import baseclass.BaseClassFaceBook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pomfacebook.Login_FaceBook;

public class StepD_facebook extends BaseClassFaceBook {
	public static WebDriver driver=FaceBook_runclass.driver;
	 Login_FaceBook aft=new Login_FaceBook(driver);
	
	
	
	@Given("^User Launch The Application Url \"([^\"]*)\"$")
	public void user_Launch_The_Application_Url(String arg1) throws Throwable {
		get_url(arg1);
	}

	@When("^User Enter The Username In \"([^\"]*)\"$")
	public void user_Enter_The_Username_In(String arg1) throws Throwable {
		inputvalue(aft.getEmail(), arg1);
	}

	@When("^User Enter The Password In \"([^\"]*)\"$")
	public void user_Enter_The_Password_In(String arg1) throws Throwable {
		inputvalue(aft.getPassword(), arg1);
	}

	@Then("^User Click On The LogIn Button And It's Navigate Into FaceBook HomePage$")
	public void user_Click_On_The_LogIn_Button_And_It_s_Navigate_Into_FaceBook_HomePage() throws Throwable {
	clickonelement(aft.getLogin());
	}
//	 @Given("User Launch The Application Url {string}")
//	 public void user_launch_the_application_url() {
//		 Search_Engine("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjM1ODY1NzAyLCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D");
//	 }

//	 @Given("User Launch The Application Url")
//	 public void user_launch_the_application_url() {
//		get_url("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjM1ODY1NzAyLCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D");
//}
//
//	 
//	 @When("User Enter The Username In {string}")
//	 public void user_enter_the_username_in(String string) {
//	 inputvalue(aft.getEmail(), string);
//	 }
//	
//	 @When("User Enter The Password In {string}")
//	 public void user_enter_the_password_in(String string) {
//	 inputvalue(aft.getPassword(), string);
//	 }
//	 
//	 @Then("User Click On The LogIn Button And It's Navigate Into FaceBook HomePage")
//	 public void user_click_on_the_log_in_button_and_it_s_navigate_into_face_book_home_page() {
//	 clickonelement(aft.getLogin());
//	 }


}