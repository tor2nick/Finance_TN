package com.cybertek.reviews.day09;

import com.cybertek.utilities.Driver;
import com.cybertek.utilities.ExcelUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelUtilExample {

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
    public Object [][] getDataExcel(){
        ExcelUtil obj = new ExcelUtil("src/test/resources/StatusCodes.xlsx","Sheet1");
        Object [][] data = obj.getDataArrayWithoutFirstRow();
        return data;
    }
    @Test(dataProvider = "getDataExcel")
    public void statusCodeTestWithExcel(String code, String msg){
       // code = code.substring(0,3);
        driver.findElement(By.linkText("Status Codes")).click();
        driver.findElement(By.linkText(code)).click();
        String message = msg;
        String actualMessage = driver.findElement(By.tagName("p")).getText();
        Assert.assertTrue(actualMessage.contains(message));


    }



}
