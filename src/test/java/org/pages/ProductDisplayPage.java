package org.pages;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDisplayPage extends LibGlobal{
	
	public ProductDisplayPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//div[text()='Sauce Labs Bolt T-Shirt']//parent::a//parent::div//following-sibling::div)[2]//child::div")
	private WebElement boltTShirtAmount;
	
	@FindBy(xpath="(//div[text()='Sauce Labs Fleece Jacket']//parent::a//parent::div//following-sibling::div)[2]//child::div")
	private WebElement fleeceJacketAmount;
	
	@FindBy(xpath="(//div[text()='Sauce Labs Fleece Jacket']//parent::a//parent::div//following-sibling::div)[2]//child::div//following-sibling::button")
	private WebElement fleeceJacketAddToCart;
	
	@FindBy(xpath="(//div[text()='Sauce Labs Bolt T-Shirt']//parent::a//parent::div//following-sibling::div)[2]//child::div//following-sibling::button")
	private WebElement boltTShirtAddToCart;
	
	@FindBy(xpath="//span[@class='shopping_cart_badge']")
	private WebElement iconAddCartNos;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement iconBtn;

	public WebElement getIconAddCartNos() {
		return iconAddCartNos;
	}

	public WebElement getIconBtn() {
		return iconBtn;
	}

	public WebElement getBoltTShirtAmount() {
		return boltTShirtAmount;
	}

	public WebElement getFleeceJacketAmount() {
		return fleeceJacketAmount;
	}

	public WebElement getFleeceJacketAddToCart() {
		return fleeceJacketAddToCart;
	}

	public WebElement getBoltTShirtAddToCart() {
		return boltTShirtAddToCart;
	}
	
	
	
	
	
	

}
