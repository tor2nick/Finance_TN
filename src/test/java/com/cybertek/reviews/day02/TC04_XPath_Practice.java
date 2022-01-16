package com.cybertek.reviews.day02;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC04_XPath_Practice {
/*
go to http://practice.cybertekschool.com/multiple_buttons
click on button1 with xpath locator
Verify Expected: “Clicked on button one!”

 */

    public static void main(String[] args) {
        //1. Open Chrome Browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. go to http://practice.cybertekschool.com/multiple_buttons
        String url = "http://practice.cybertekschool.com/multiple_buttons";
        // driver.get and driver.navigate().to()  doing the same thing
        driver.navigate().to(url);

        //3. click on button1 with xpath locator

     // with using TEXT----> WebElement buttonOne = driver.findElement(By.xpath("//button[.='Button 1']"));
     // with using one attribute   WebElement buttonOne = driver.findElement(By.xpath("//button[@onclick='button1()']"));
        WebElement buttonOne = driver.findElement(By.xpath("//button[@class='btn btn-primary' and @onclick='button1()']"));
     // Using two attributes
        buttonOne.click();

        //4.Verify Expected: “Clicked on button one!”
// instead of writing text() like this we just put "."
        WebElement textElement = driver.findElement(By.xpath("//p[contains(.,'button one')]"));
        String expectedText = "Clicked on button one!";
        String actualText = textElement.getText();

        // without verification what is our value to the company
// TestNG for verification, ready assertions
        if(expectedText.equalsIgnoreCase(actualText)){
            System.out.println("Text verification PASSED");
        }else {
            System.out.println("FAILED!!!!!!!");
        }


        driver.close();



    }
}
