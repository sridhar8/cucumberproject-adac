package org.StepD;

import org.Runner.Testing_Class;
import org.baseclass.adactin.BaseClass_Adactin;
import org.openqa.selenium.WebDriver;
import org.sdp.com.P_O_M_adactin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Step_Def extends  BaseClass_Adactin{
	public static WebDriver driver= Testing_Class.driver;
	
	P_O_M_adactin cucu = new P_O_M_adactin(driver);
	
	
	
	@Given("^Launch The Url$")
	public void launch_The_Url() throws Throwable {
		search_url("https://adactinhotelapp.com/index.php");
	}


	@When("^user Enter the Name In \"([^\"]*)\" Field$")
	public void user_Enter_the_Name_In_Field(String arg1) throws Throwable {
	inputvalue(cucu.getInstanceSignin().getUsername(), arg1);
}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
		inputvalue(cucu.getInstanceSignin().getPassword(), "Sri@8190");
	}

	@Then("^user Click On The Login Button And It Navigates To Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {
		clickonelement(cucu.getInstanceSignin().getLogin());
	}
	
	@Given("user Choose The Hotel Location")
	public void user_choose_the_hotel_location() {
	select( "selectbyvalue",cucu.getInstanceCheckindetails().getLocation(),"Sydney");
	}

	@When("user Choose The Hotel Name")
	public void user_choose_the_hotel_name() {
	select("selectbyvalue", cucu.getInstanceCheckindetails().getHotel(), "Hotel Creek");
	}

	@When("user Choose The Room  Type")
	public void user_choose_the_room_type() {
		select("selectbyvalue", cucu.getInstanceCheckindetails().getRoomtype(), "Standard");	
	}
	
	@When("user Book The Total Number Of Rooms")
	public void user_book_the_total_number_of_rooms() {
		select("selectbyvalue", cucu.getInstanceCheckindetails().getRoomnos(), "2");
	}

	@When("Adults Allowed In A Single Room")
	public void adults_allowed_in_a_single_room() {
		select("selectbyvalue", cucu.getInstanceCheckindetails().getAdultrooms(), "2");
	}

	@When("Children Allowed In A Single Room")
	public void children_allowed_in_a_single_room() {
		select("selectbyvalue", cucu.getInstanceCheckindetails().getChildroom(), "2");
	}

	@Then("user Click On The Search Button And It Navigates To Hotel Confirmation Page")
	public void user_click_on_the_search_button_and_it_navigates_to_hotel_confirmation_page() {
		clickonelement(cucu.getInstanceCheckindetails().getSumbmit());
	}
	
	@Given("user Click The Radio Button To Confirm The Hotel Booking")
	public void user_click_the_radio_button_to_confirm_the_hotel_booking() {
		clickonelement(cucu.getInstanceDetails().getRadiobutton());

}

	@When("user Click On The Continue Button To Navigate Into Personal Info Page")
	public void user_click_on_the_continue_button_to_navigate_into_personal_info_page() {
		clickonelement(cucu.getInstanceDetails().getContine());
}

@Given("user Enter The FirstName In The Correcponing Field")
public void user_enter_the_first_name_in_the_correcponing_field() {
	inputvalue(cucu.getInstanceAddress().getFirstname(),"sridhar");

}

@When("user Enter The LastName For That Corresponding Field")
public void user_enter_the_last_name_for_that_corresponding_field() {
	inputvalue(cucu.getInstanceAddress().getLastname(),"k");
}

@When("user Enter The Billing Address")
public void user_enter_the_billing_address() {
	inputvalue(cucu.getInstanceAddress().getAddress(),"poror");
}

@When("user Enter The Valid {int} Degits Valid Creadit Card Number")
public void user_enter_the_valid_degits_valid_creadit_card_number(Integer int1) {
	inputvalue(cucu.getInstanceAddress().getCcnum(),"1234235432555685");
}

@Given("user Click On The Logout Button")
public void user_click_on_the_logout_button() {
}



@When("user Enter The Creadit Cart Type")
public void user_enter_the_creadit_cart_type() {
	select("selectbyvalue", cucu.getInstanceAddress().getCctype(), "AMEX");
}
@When("user Enter The Expire Date")
public void user_enter_the_expire_date() {
	select("selectbyvalue", cucu.getInstanceAddress().getCcexmon(), "2");
}
@When("user Enter The Expire Year")
public void user_enter_the_expire_year() {
	select("selectbyvalue", cucu.getInstanceAddress().getCcexpyr(), "2012");
}
@When("user Enter The Cvv Number")
public void user_enter_the_cvv_number() {
	inputvalue(cucu.getInstanceAddress().getCvv(),"767");
}
@Then("user Click On The Book Now Button To Navigate Into LogOut Page")
public void user_click_on_the_book_now_button_to_navigate_into_log_out_page() {
	clickonelement(cucu.getInstanceAddress().getBooknow());

}

@Given("user Click On The Logoutt Button")
public void user_click_on_the_logoutt_button() {
	clickonelement(cucu.getInstanceLogout().getLogout());
}









}
