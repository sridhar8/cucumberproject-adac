package org.steppD;

import org.cucumbershoping.Runner_shopp;
import org.openqa.selenium.WebDriver;

import baseclass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pomclass.pomshoping;

public class ShopStepD extends BaseClass{
public static WebDriver driver=Runner_shopp.driver;
public static pomshoping pom=new pomshoping(driver);
	@Given("User Enter The Url As {string}")
	public void user_enter_the_url_as(String string) {
	get_url(string);
	}
	@When("User Click On The Sigining In Button")
	public void user_click_on_the_sigining_in_button() {
	clickonelement(pom.getSiginingin());
	}

	@When("User Enter The Email As {string}")
	public void user_enter_the_email_as(String string) {
	javascriptelement(pom.getEmailid());	
	inputvalue(pom.getEmailid(), string);
	}

	@When("User Enter The Password As {string}")
	public void user_enter_the_password_as(String string) throws InterruptedException {
	inputvalue(pom.getPassword(), string);
	}

	@When("User Click On The Signin Button")
	public void user_click_on_the_signin_button() {
		clickonelement(pom.getSiginin());
		wait(4);
	}
	@When("Sleep")
	public void sleep() {
		wait(4);
	}
	@When("User Perfrom Into Dress Section")
	public void user_perfrom_into_dress_section() {
	action(pom.getPerform(), "onlyperform");
	}
	@When("User Click On The Casual Dress")
	public void user_click_on_the_casual_dress() {
	wait(4);
		clickonelement(pom.getCasualdress());
	}
	@When("User Scroll The Window Upto Post")
	public void user_scroll_the_window_upto_post() {
	javascriptelement(pom.getScrollview());
	}
	@When("User Click On The Image That Navigate Into Frame Page")
	public void user_click_on_the_image_that_navigate_into_frame_page() {
	clickonelement(pom.getImg());
	}
	@When("User Entering Into Frame Page")
	public void user_entering_into_frame_page() {
	switchToFramebyElement(pom.getSwitchtoframe());
	}
	@When("User Add The Quantity Of The Product")
	public void user_add_the_quantity_of_the_product() {
	wait(5);
	clickonelement(pom.getAddqty());
	clickonelement(pom.getAddqty());
	}
	@When("User Select The Size Of The Product")
	public void user_select_the_size_of_the_product() {
	select("selectbyvalue", pom.getSize(), "2");
	}
	@When("User Click On The Add To Cart And Its Navigate Into The AddSummary Page")
	public void user_click_on_the_add_to_cart_and_its_navigate_into_the_add_summary_page() {
	clickonelement(pom.getCartadd());
	}
	@When("User Back Into The Parent\\/Default Page")
	public void user_back_into_the_parent_default_page() {
	switchintoParentFrame();
	}
	@When("User Click On The Add To Cart Summary And Its Navigate Into Purchase Summary")
	public void user_click_on_the_add_to_cart_summary_and_its_navigate_into_purchase_summary() {
	wait(4);
	clickonelement(pom.getAddcartsummary());
	}
	@When("User Click On The Checkout PurchaseSummary And Its Navigate Into Address Confirm Page")
	public void user_click_on_the_checkout_purchase_summary_and_its_navigate_into_address_confirm_page() {
	wait(3);
	javascriptelement(pom.getChecksummary());
	clickonelement(pom.getChecksummary());
	}
	@When("User Enter The Message For The Address LandMark")
	public void user_enter_the_message_for_the_address_land_mark() {
	wait(4);
	javascriptelement(pom.getMessage());
	clickonelement(pom.getMessage());
	}
	@When("User Click The Address Confirm Button And Its Navigate Into The Truck Page")
	public void user_click_the_address_confirm_button_and_its_navigate_into_the_truck_page() {
	clickonelement(pom.getAddresscon());
	}
	@When("User click The Radio button For Truck")
	public void user_click_the_radio_button_for_truck() {
	wait(4);
	javascriptelement(pom.getTrack());
	clickonelement(pom.getTrack());
	}
	@When("User Click The Preceed To Carrier Button And Its Navigate Into Banking Page")
	public void user_click_the_preceed_to_carrier_button_and_its_navigate_into_banking_page() {
	clickonelement(pom.getTrackid());
	}
	@When("User Clcik On The Mode Of PayMent")
	public void user_clcik_on_the_mode_of_pay_ment() {
	wait(4);
	javascriptelement(pom.getBankchoose());
	clickonelement(pom.getBankchoose());
	}
	@When("User Enter The Submit Button To Payment And Its Navigate Into Logout Page")
	public void user_enter_the_submit_button_to_payment_and_its_navigate_into_logout_page() {
	wait(4);
	clickonelement(pom.getSumbit());
	}
	@Then("User Click On The Logout Button")
	public void user_click_on_the_logout_button() {
	wait(4);
	clickonelement(pom.getLogout());
	}



}
