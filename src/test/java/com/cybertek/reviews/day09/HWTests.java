package com.cybertek.reviews.day09;

import com.cybertek.utilities.BrowserUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HWTests extends TestBaseForHW{

    @Test
    public void testCase1(){

        extentLogger = report.createTest("Verify Optins Link");
        extentLogger.info("Preconditions are loaded");
        extentLogger.info("verify that Options is displayed");
        Assert.assertTrue(calendarEventsPage.options.isDisplayed(), "Page is NOT Displayed");
        extentLogger.pass("Options is displayed");

    }

    @Test
    public void testCase2(){

        extentLogger = report.createTest("Verify Page Number");
        extentLogger.info("Preconditions are loaded");
        extentLogger.info("verify that Page Number  is equals to 1");
        String PGnumber = calendarEventsPage.pageNumber.getAttribute("value");
        Assert.assertEquals(PGnumber,"1","Page number is NOT 1");
        extentLogger.pass("Number is equals to 1");

    }

    @Test
    public void testCase3(){

         Assert.assertEquals(calendarEventsPage.viewPerPage.getText(),"25","View Number Test FAILED");
  }

  @Test
    public void testCase4(){

      Assert.assertEquals(calendarEventsPage.getNumberOfRows(),calendarEventsPage.getNumberOfTotalRecords());

  }

  @Test
    public void testCase5() throws InterruptedException {

        calendarEventsPage.checkBoxForAll.click();

      BrowserUtils.waitFor(1);
      // Getting all the checkboxes, and iterate through to see if they are selected
      for (int i = 0; i < calendarEventsPage.checkboxes.size(); i++) {

          Assert.assertTrue(calendarEventsPage.checkboxes.get(i).isSelected());

      }

  }

  @Test
    public void testCase6(){
        calendarEventsPage.filter.click();
        wait.until(ExpectedConditions.visibilityOf(calendarEventsPage.title));

        calendarEventsPage.title.click();

        calendarEventsPage.containsBox.sendKeys("Testers Meeting");

        calendarEventsPage.updateButton.click();

        BrowserUtils.waitFor(1);

        calendarEventsPage.meetingLink.click();


        Assert.assertEquals(calendarEventsPage.verifyInfo.getText(),"Testers Meeting");

  }

}
