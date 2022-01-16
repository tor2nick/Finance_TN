package com.Finance.Pages;

import com.Finance.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payments {

    @FindBy(xpath = "//div[. = 'Добавить платёж']")
    public WebElement Платежи;

    public Payments() {
        PageFactory.initElements(Driver.get(), this);
    }
}
