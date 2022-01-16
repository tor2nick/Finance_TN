package com.Finance.step_definitions;

import com.Finance.Pages.AddPayment;
import com.Finance.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class Expenses_StepDefinitions {

    AddPayment addPayment = new AddPayment();

    @When("Пользователь выбирает {string} radio button")
    public void user_selects_radio_button(String string) throws InterruptedException {
        BrowserUtils.waitFor(2);
        addPayment.Expenses.click();
        BrowserUtils.waitFor(2);
    }

    @When("Пользователь выбирает {string} from dropdown")
    public void user_selects_from_dropdown(String string) throws InterruptedException {

        addPayment.dropDown.click();
        Thread.sleep(2000);
        addPayment.plan.click();
        Thread.sleep(2000);

        String expectedOption = "Плановые долговые обязательства/уменьшаемый план";
        String actualOption = addPayment.plan.getText();
        System.out.println(addPayment.plan.getText());

        Assert.assertEquals(actualOption, expectedOption, "Плановые долговые обязательства/уменьшаемый план");
    }

    @Then("{string}, {string} and {string} is disappeared")
    public void and_is_disappeared(String string, String string2, String string3) {
        Assert.assertFalse("НЕ исчез Счет отправителя", addPayment.SenderAccount.isDisplayed());
        Assert.assertFalse("НЕ исчез Счет получателя", addPayment.ReceiverAccount.isDisplayed());
        Assert.assertFalse("НЕ исчез Сумма факт", addPayment.TotalFact.isDisplayed());
    }

    @Then("{string} block is disappeared")
    public void block_is_disappeared(String string) {
        Assert.assertFalse("WhenBlock NOT disappeared", addPayment.WhenBlock.isDisplayed());
        Assert.assertFalse("DateFact NOT disappeared", addPayment.DateFact.isDisplayed());

    }
    @Then("Related Payments appeared")
    public void related_Payments_appeared() {
        Assert.assertTrue("RelatedPayments NOT appeared", addPayment.RelatedPayments.isDisplayed());
    }
}
