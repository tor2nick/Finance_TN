package com.Finance.step_definitions;

import com.Finance.Pages.LoginPage;
import com.Finance.utilities.BrowserUtils;
import com.Finance.utilities.ConfigurationReader;
import com.Finance.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_StepDefinitions {


    @Given("Пользователь переходит на страницу входа")
    public void user_Navigates_to_the_login_page() throws InterruptedException {

        String url = "finance.dev.fabrique.studio/accounts/login/";
        String password = "fabrique";


        String URL = "https://" +password +":" +password +"@"+ url;
        Driver.get().get(URL);
        BrowserUtils.waitFor(3);

    }
    @When("Пользователь входит в систему с действительными учетными данными администратора на второй странице входа.")
    public void user_logs_in_with_valid_credentials() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        LoginPage loginPage = new LoginPage();
        loginPage.Username.sendKeys(ConfigurationReader.get("second_username"));
        loginPage.Password.sendKeys(ConfigurationReader.get("second_password"));
        loginPage.loginBtn.click();
        BrowserUtils.waitFor(2);
    }

    @Then("Пользователь попадает на главную страницу")
    public void userLandsOnTheHomepage() {
        String actualUrl = Driver.get().getCurrentUrl();
        System.out.println(actualUrl);
        String expectedUrl = "https://finance.dev.fabrique.studio/";
        Assert.assertTrue(actualUrl.contains(expectedUrl));
        BrowserUtils.waitFor(3 );

    }

 }












