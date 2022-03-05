package org.pages;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends LibGlobal{
	
	public CheckOutPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="checkout")
	private WebElement checkOutBtn;

	public WebElement getCheckOutBtn() {
		return checkOutBtn;
	}
	
	

}
