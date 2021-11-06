package org.stepDmulti;

import java.awt.AWTException;
import java.awt.event.KeyEvent;

import org.multiscenario.Runner_Class_MultiScenario;
import org.openqa.selenium.WebDriver;

import baseclass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pomclass.POM_Multi;

public class StepDMult extends BaseClass {
	public static WebDriver driver=Runner_Class_MultiScenario.driver;
	public static POM_Multi pommulti=new POM_Multi(driver);
	

@Given("User Enter The Url {string}")
public void user_enter_the_url(String string) {
get_url(string);
}
@When("User Enter The First Name As {string}")
public void user_enter_the_first_name_as(String string) {
inputvalue(pommulti.getFristname(), string);}
@When("User Enter The Last Name As {string}")
public void user_enter_the_last_name_as(String string) {
inputvalue(pommulti.getLastname(), string);}
@Then("User Next  To Enter The Email.id")
public void user_next_to_enter_the_email_id() {
}

@When("User Enter The EmailId {string}")
public void user_enter_the_email_id(String string) {
inputvalue(pommulti.getEmailId(), string);
}
@When("User Click On The Radio BUtton")
public void user_click_on_the_radio_b_utton() {
clickonelement(pommulti.getGender());
}
@When("User Enter The Phone Number")
public void user_enter_the_phone_number() {
inputvalue(pommulti.getPhoneNumber(), "8190983883");
}
@Then("User Next To Enter The DOB")
public void user_next_to_enter_the_dob() {
}


@Given("User Click On The Calander")
public void user_click_on_the_calander() {
	clickonelement(pommulti.getCalander());
}
@When("User Select The Month Of The Birth")
public void user_select_the_month_of_the_birth() {
select("selectbyvalue", pommulti.getBirthmonth(), "1");}
@When("User Select The Year Of The Birth")
public void user_select_the_year_of_the_birth() {
select("selectbyvalue", pommulti.getBirthyear(), "1991");
}
@When("User Select The Date Of The Birth")
public void user_select_the_date_of_the_birth() {
clickonelement(pommulti.getDob());
}
@Then("User Next To Enter The Subjects")
public void user_next_to_enter_the_subjects() {
}
@Given("User Enter The Subject Name As {string}")
public void user_enter_the_subject_name_as(String string) throws AWTException {
javascriptelement(pommulti.getSubject());
inputvalue(pommulti.getSubject(), string);
Robot("keypress",KeyEvent.VK_ENTER );
Robot("keyrelease", KeyEvent.VK_ENTER);
}
@When("User Click On The Sports Checkbox")
public void user_click_on_the_sports_checkbox() {
clickonelement(pommulti.getHobby());
}
@When("User Enter The Address In The AddressBox")
public void user_enter_the_address_in_the_address_box() {
inputvalue(pommulti.getAddress(), "Hi");}

@When("User Click On The StateBox")
public void user_click_on_the_state_box() {
clickonelement(pommulti.getState());
}
@When("User Choose The State")
public void user_choose_the_state() throws AWTException {
clickonelement(pommulti.getSelecestate());
//Robot("keypress",KeyEvent.VK_ENTER );
//Robot("keyrelease", KeyEvent.VK_ENTER);
}
@Then("User Click On The Submit Button")
public void user_click_on_the_submit_button() {
clickonelement(pommulti.getSubmit());
}






}
