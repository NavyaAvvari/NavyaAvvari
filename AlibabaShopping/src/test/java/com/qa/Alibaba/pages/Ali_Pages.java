package com.qa.Alibaba.pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ali_Pages {

	WebDriver driver;

	public Ali_Pages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Sign In")
	WebElement Signinlink;

	@FindBy(id = "fm-login-id")
	WebElement emailid;

	@FindBy(id = "fm-login-password")
	WebElement password;

	@FindBy(id = "fm-keep-login")
	WebElement chechinbox;

	@FindBy(id = "fm-login-submit")
	WebElement signinbtn;

	public WebElement getSigninlink() {
		return Signinlink;
	}

	public WebElement getEmailid() {
		return emailid;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getChechinbox() {
		return chechinbox;
	}

	public WebElement getSigninbtn() {
		return signinbtn;
	}
	@FindBy(name="SearchText")
	WebElement searchbox;
	
	
	public WebElement getSearchbox() {
		return searchbox;
	}

	

	@FindBy(xpath="//*[@id=\"J_SC_header\"]/header/div[2]/div[4]/div[1]/div[1]/div[1]/a/div")
	WebElement myaccountaction;
	

	
	public WebElement getMyaccountaction() {
		return myaccountaction;
	}

	

	@FindBy(linkText="Sign Out")
	WebElement signout;

	public WebElement getSignout() {
		return signout;
	}


	
	
	
	
	
	
	

}