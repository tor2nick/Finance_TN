package com.Finance.step_definitions;

import com.Finance.Pages.Payments;
import com.Finance.utilities.BrowserUtils;
import com.Finance.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class Payments_StepDefinitions  {

    Payments paymentsPage = new Payments();


    @When("Пользователь кликает {string}")

    public void user_clicks(String string) {
        paymentsPage.Платежи.click();

    }

    @Then("Пользователь попадает на {string} page")
    public void user_lands_on_the_page(String string) throws InterruptedException {
        BrowserUtils.waitFor(2);
        String expectedLink ="https://finance.dev.fabrique.studio/payments/edit/";
        String actualLink = Driver.get().getCurrentUrl();
        Assert.assertEquals("not equal", expectedLink,actualLink);
    }


}
