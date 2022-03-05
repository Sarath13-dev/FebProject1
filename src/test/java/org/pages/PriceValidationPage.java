package org.pages;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PriceValidationPage extends LibGlobal{
	
	public PriceValidationPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[@class='summary_subtotal_label']")
	private WebElement getTotalPrice;
	
	@FindBy(id="finish")
	private WebElement finishBtn;

	public WebElement getGetTotalPrice() {
		return getTotalPrice;
	}

	public WebElement getFinishBtn() {
		return finishBtn;
	}
	
	
}
