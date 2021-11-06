package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Multi {
	public WebDriver driver;
	
	@FindBy(id="firstName")
	private WebElement fristname;
	
	@FindBy(id="lastName")
	private WebElement lastname;
	
	@FindBy(id="userEmail")
	private WebElement emailId;
	
	@FindBy(id="userNumber")
	private WebElement phoneNumber;
	
	@FindBy(xpath="(//label[@class='custom-control-label'])[1]")
	private WebElement gender;
	
	@FindBy(id="dateOfBirthInput")
	private WebElement calander;
	
	@FindBy(className="react-datepicker__month-select")
	private WebElement birthmonth;
	
	@FindBy(className="react-datepicker__year-select")
	private WebElement birthyear;
	
	@FindBy(xpath="(//div[@role='option'])[27]")
	private WebElement dob;
	
	@FindBy(id="subjectsInput")
	private WebElement subject;
	
	@FindBy(xpath="//label[text()='Sports']")
	private WebElement hobby;
	
	@FindBy(id="currentAddress")
	private WebElement address;
	
	@FindBy(xpath="//div[text()='Select State']")
	private WebElement state;
	
	@FindBy(xpath="//div[text()='Uttar Pradesh']")
	private WebElement selecestate;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit;

	public POM_Multi(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFristname() {
		return fristname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmailId() {
		return emailId;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getCalander() {
		return calander;
	}

	public WebElement getBirthmonth() {
		return birthmonth;
	}

	public WebElement getBirthyear() {
		return birthyear;
	}

	public WebElement getDob() {
		return dob;
	}

	public WebElement getSubject() {
		return subject;
	}

	public WebElement getHobby() {
		return hobby;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getSelecestate() {
		return selecestate;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	
	
	
	
}	


