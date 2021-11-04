package POMDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Demo {
	public WebDriver driver;
	@FindBy(id="firstName")
	private WebElement firstname;
	
	@FindBy(id="lastName")
	private WebElement lastname;
	
	@FindBy(id="userEmail")
	private WebElement email;
	
	@FindBy(xpath="//label[.='Male']")
	private WebElement gender;
	
	@FindBy(id="userNumber")
	private WebElement phone;
	
	@FindBy(id="dateOfBirthInput")
	private WebElement calander;
	
	@FindBy(xpath="//select[@class='react-datepicker__month-select']")
	private WebElement DOM;
	
	@FindBy(xpath="//select[@class='react-datepicker__year-select']")
	private WebElement DOY;
	
	@FindBy(xpath="(//div[@role='option'])[27]")
	private WebElement DOB;
	
	@FindBy(id="subjectsInput")
	private WebElement subject;
	
	@FindBy(id="subjects-label")
	private WebElement hobby;
	
	@FindBy(xpath="//label[text()='Sports']")
	private WebElement sports;
	
	@FindBy(id="currentAddress")
	private WebElement address;
	
	@FindBy(id="state")
	private WebElement state;
	
	@FindBy(xpath="//div[text()='Uttar Pradesh']")
	private WebElement statee;
	
	@FindBy(id="submit")
	private WebElement submit;



	public POM_Demo(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getCalander() {
		return calander;
	}

	public WebElement getDOM() {
		return DOM;
	}

	public WebElement getDOY() {
		return DOY;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getStatee() {
		return statee;
	}

	public WebElement getDOB() {
		return DOB;
	}

	public WebElement getSubject() {
		return subject;
	}

	public WebElement getHobby() {
		return hobby;
	}

	public WebElement getSports() {
		return sports;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getSubmit() {
		return submit;
	}

}
