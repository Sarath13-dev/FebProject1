package org.pages;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalInfoPage extends LibGlobal {
	
	public PersonalInfoPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first-name")
	private WebElement firstnameFeild;
	@FindBy(id="last-name")
	private WebElement lastnameFeild;
	@FindBy(id="postal-code")
	private WebElement postalCodeFeild;
	
	@FindBy(id="continue")
	private WebElement continueBtn;

	public WebElement getFirstnameFeild() {
		return firstnameFeild;
	}

	public WebElement getLastnameFeild() {
		return lastnameFeild;
	}

	public WebElement getPostalCodeFeild() {
		return postalCodeFeild;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}
	
	

}
