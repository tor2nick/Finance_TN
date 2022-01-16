package com.Finance.Pages;

import com.Finance.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddPayment {

    @FindBy(xpath = "//*[.='Расход']")
    public WebElement Expenses;


    @FindBy(xpath = "//div[@data-field-name  = 'amount_fact']")
    public WebElement TotalFact;

    @FindBy(xpath = "//div[@data-field-name  = 'account_sender']")
    public WebElement SenderAccount;

    @FindBy(xpath = "//div[@data-field-name  = 'account_recipient']")
    public WebElement ReceiverAccount;

    @FindBy(xpath = "//div[@class = 'multiselect__tags']")
    public WebElement dropDown;

    @FindBy(xpath = "//span[. = 'Плановые долговые обязательства/уменьшаемый план']")
    public WebElement plan;

    @FindBy(xpath = "//div[@data-field-name ='date_plan']")
    public WebElement WhenBlock;

    @FindBy(xpath = "//div[@data-field-name ='date_fact']")
    public WebElement DateFact;
    public AddPayment() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//div[@data-field-name ='related_payments']")
    public WebElement RelatedPayments;
}
