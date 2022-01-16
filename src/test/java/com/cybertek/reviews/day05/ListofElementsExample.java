package com.cybertek.reviews.day05;

import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ListofElementsExample {

    WebDriver driver;

    Faker faker = new Faker();


    /**
     * Test case #2
     * Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
     * Step 2. Click on “Registration Form”
     * Step 3. Verify that following options for programming languages are displayed: c++, java, JavaScript
     */

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@href='/registration_form']")).click();
    }

    @AfterMethod
    public void tearDown(){

        driver.close();

    }

    @Test
    public void task2()  {



        WebElement firstName = driver.findElement(By.name("firstname"));
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(firstName));
        List<WebElement> elements = driver.findElements(By.cssSelector(".form-check-label"));// Alt+enter

        List<String> actualElementsStrings = new ArrayList<>();

        for (int i = 0; i < elements.size(); i++) {
             actualElementsStrings.add(elements.get(i).getText());

        }

        // we did assertion one by one
        Assert.assertEquals(elements.get(0).getText(),"C++");
        Assert.assertEquals(elements.get(1).getText(),"Java");
        Assert.assertEquals(elements.get(2).getText(),"JavaScript");

        List<String> expectedCodeNames = Arrays.asList("C++","Java","JavaScript"); // Java lazy way of creating a list


        // We did assertion as a List
        Assert.assertEquals(actualElementsStrings,expectedCodeNames); // you can not compare list of string to list of webelement


    }

    @Test
    public void task5() throws InterruptedException {
        driver.findElement(By.name("firstname")).sendKeys(faker.name().firstName());
        driver.findElement(By.name("lastname")).sendKeys(faker.name().lastName());
        driver.findElement(By.name("username")).sendKeys(faker.regexify("[a-z1-9]{10}"));
        driver.findElement(By.name("email")).sendKeys(faker.internet().emailAddress());
        driver.findElement(By.name("password")).sendKeys(faker.regexify("[a-z1-9]{10}"));
        driver.findElement(By.name("phone")).sendKeys("012-012-0123");
        driver.findElement(By.xpath("//input[@value='male']")).click();

        driver.findElement(By.name("birthday")).sendKeys("07/07/1992");

        Thread.sleep(2000);
        // Select dropdown review
        WebElement dropdownOffice =  driver.findElement(By.name("department"));
        Select departmentDropdown = new Select(dropdownOffice);
        departmentDropdown.selectByVisibleText("Tourism Office");


        Thread.sleep(2000);

        // Select dropdown for Jobtitle
        WebElement jobTitleLocator = driver.findElement(By.name("job_title"));
        Select jobTitleDropDown = new Select(jobTitleLocator);
        jobTitleDropDown.selectByVisibleText("SDET");

        List<WebElement> elements = driver.findElements(By.cssSelector(".form-check-label"));// Alt+enter

        elements.get(1).click();

        driver.findElement(By.id("wooden_spoon")).click();
        WebDriverWait wait = new WebDriverWait(driver,10);
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/p")));

       String expectedMessage = "You've successfully completed registration!";
       String actualMessage = driver.findElement(By.xpath("//div/p")).getText();

       Assert.assertEquals(actualMessage,expectedMessage, "Message do NOT match");

    }


}
