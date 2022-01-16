package com.Finance.Pages;

import com.Finance.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(xpath = "//input[@type = 'email']")
    public WebElement Username;

    @FindBy(xpath = "//input[@type = 'password']")
    public WebElement Password;

    @FindBy(css = ".button__content")
    public WebElement loginBtn;

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }


    public void login(String username, String password) {
        Username.sendKeys("admin@admin.ad");
        Password.sendKeys("admin");
        loginBtn.click();

    }

}



