package com.cybertek.reviews.day09;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TitleVerfication {

    @Test
    public void test(){

        Driver.get().get("http://practice.cybertekschool.com/");

        // textContent and innerHTML works for getting title tag text
        String title = Driver.get().findElement(By.tagName("title")).getAttribute("innerHTML");
        String titleWeb = Driver.get().getTitle();
        Assert.assertEquals(title,titleWeb);
        Driver.closeDriver();

    }
}
