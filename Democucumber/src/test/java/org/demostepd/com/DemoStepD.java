package org.demostepd.com;

import java.awt.AWTException;
import java.awt.event.KeyEvent;

import org.demorunner.DemoRunner;
import org.openqa.selenium.WebDriver;

import POMDemo.POM_Demo;
import baseclass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoStepD extends BaseClass {
public static WebDriver driver=DemoRunner.driver;
public static POM_Demo sdp=new POM_Demo(driver);
@Given("User Enter The Url {string}")
public void user_enter_the_url(String string) {
get_url(string);
}
@When("User Enter The Firstname as {string}")
public void user_enter_the_firstname_as(String string) {
inputvalue(sdp.getFirstname(), string);
}
@When("User Enter The Lastname as {string}")
public void user_enter_the_lastname_as(String string) {
inputvalue(sdp.getLastname(), string);
}
@When("User Enter The EmailId as {string}")
public void user_enter_the_email_id_as(String string) {
inputvalue(sdp.getEmail(), string);
}
@When("User Select The Gender by Radio Button")
public void user_select_the_gender_by_radio_button() {
clickonelement(sdp.getGender());
}
@When("User Enter The Mobile Number As {string}")
public void user_enter_the_mobile_number_as(String string) {
inputvalue(sdp.getPhone(), string);
}
@When("User Click The Calander")
public void user_click_the_calander() {
clickonelement(sdp.getCalander());
}
@When("User Select The Month Of Birth")
public void user_select_the_month_of_birth() {
select("selectbyvalue", sdp.getDOM(), "1");
}
@When("User Select The Year Of Birth")
public void user_select_the_year_of_birth() {
	select("selectbyvalue", sdp.getDOY(), "1991");
}
@When("User Select The Date Of Birth")
public void user_select_the_date_of_birth() {
	clickonelement(sdp.getDOB());
}
@When("User Select The Subject")
public void user_select_the_subject() throws AWTException {
javascriptelement(sdp.getSubject());
inputvalue(sdp.getSubject(), "Hindi");
Robot("keypress", KeyEvent.VK_ENTER);
Robot("keyrelease", KeyEvent.VK_ENTER);
}
//@When("User Select The SubjectName")
//public void user_select_the_subject_name() {
//inputvalue(sdp.getSubject(), "Hindi");
//}
@When("User Select The Hobby By TickBox")
public void user_select_the_hobby_by_tick_box() {
	javascriptelement(sdp.getSubject());
clickonelement(sdp.getHobby());
}
@When("User Enter The Address As {string}")
public void user_enter_the_address_as(String string) {
inputvalue(sdp.getAddress(), string);
}
@When("User Click The State")
public void user_click_the_state() {
clickonelement(sdp.getState());
}
@When("User Select The State")
public void user_select_the_state() {
clickonelement(sdp.getStatee());
}
@Then("User Click The Submit Button And Its Navigate Into The All Details Page")
public void user_click_the_submit_button_and_its_navigate_into_the_all_details_page() {
clickonelement(sdp.getSubmit());
}


}
