package org.steps;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.base.LibGlobal;
import org.bouncycastle.asn1.x509.sigi.PersonalData;
import org.junit.Assert;
import org.pages.CheckOutPage;
import org.pages.HomePage;
import org.pages.PersonalInfoPage;
import org.pages.PriceValidationPage;
import org.pages.ProductDisplayPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SauceStepDef extends LibGlobal{

	@Given("User login to url")
	public void user_login_to_url() {
		getDriver("chrome");
		launchUrl("https://www.saucedemo.com/");
		driver.manage().deleteAllCookies();
	}
	
	double boltPrice=0.0;
	double fleecePrice =0.0;
	double totalPrice =0.0;
	@When("User adds product to cart")
	public void user_adds_product_to_cart() throws IOException{
		HomePage a = new HomePage();
		passtxt(a.getUsername(),getExcel("D:\\sauceDemo\\Data.xlsx", 0, 0) );
		passtxt(a.getPassword(),getExcel("D:\\sauceDemo\\Data.xlsx", 0, 1) );
		click(a.getLoginBtn());
		ProductDisplayPage b = new ProductDisplayPage();
		 boltPrice = Double.parseDouble(text(b.getBoltTShirtAmount()).substring(1));
		 fleecePrice = Double.parseDouble(text(b.getFleeceJacketAmount()).substring(1));
		click(b.getBoltTShirtAddToCart());
		click(b.getFleeceJacketAddToCart());
		click(b.getIconBtn());
		CheckOutPage c = new CheckOutPage();
		click(c.getCheckOutBtn());
		totalPrice = boltPrice+ fleecePrice;
	}

	@And("User fills the personal information")
	public void user_fills_the_personal_information() throws IOException {
		PersonalInfoPage personalInfo = new PersonalInfoPage();
		passtxt(personalInfo.getFirstnameFeild(), getExcel("D:\\sauceDemo\\Data.xlsx", 1, 0));
		passtxt(personalInfo.getLastnameFeild(), getExcel("D:\\sauceDemo\\Data.xlsx", 1, 1));
		passtxt(personalInfo.getPostalCodeFeild(), getExcel("D:\\sauceDemo\\Data.xlsx", 1, 2));
		click(personalInfo.getContinueBtn());
		
	}
String totalAmount="";
	@Then("User validates the total amoun")
	public void user_validates_the_total_amoun() {
		PriceValidationPage price = new PriceValidationPage();
		totalAmount = text(price.getGetTotalPrice());
		Assert.assertTrue(totalAmount.contains(String.valueOf(totalPrice)));
		System.out.println("verified");
		click(price.getFinishBtn());
	}

	
}
