package com.cybertek.reviews.day09;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
    /*
    Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
    Step 2. And click on “Status Codes”.
    Step 3. Then click on “200”.
    Step 4. Verify that following message is displayed:
    “This page returned a 200 status code”
     */
    WebDriver driver;
    @BeforeMethod
    public void set(){
        driver = Driver.get();
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }

    @DataProvider
    public Object [][] getData(){

        Object [][] data = new Object[4][2];
        // test case 9
        data[0][0] = "200";
        data[0][1] = "This page returned a 200 status code";
        // test case 10
        data[1][0] = "301";
        data[1][1] = "This page returned a 301 status code";
        // test case 11
        data[2][0] = "404";
        data[2][1] = "This page returned a 404 status code";
        // test case 9
        data[3][0] = "500";
        data[3][1] = "This page returned a 500 status code";

        return data;
    }

    @Test(dataProvider = "getData")
    public void statusCodeTest(String code, String msg){

        driver.findElement(By.linkText("Status Codes")).click();
        driver.findElement(By.linkText(code)).click();
        String message = msg;
        String actualMessage = driver.findElement(By.tagName("p")).getText();
        Assert.assertTrue(actualMessage.contains(message));


    }




}
