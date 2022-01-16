package com.cybertek.reviews.day02;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC03_SmartBearLoginTest {
    /*
    Basic login authentication
- Go to:  http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
- Verify title equals: String expectedTitle = "Web Orders Login"
- Enter username: Tester
- Enter password: test
- Click “Sign In” button
- Verify title equals: String expectedHomePageTitle = "Web Orders"

     */

    public static void main(String[] args) {
        // 1. Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        // to see all the elements in the page, this is necessary
        driver.manage().window().maximize();

        //2. Go to page with URL
        String url = "http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx";
        driver.get(url);

        //3. Verify the title
        String expectedTitle = "Web Orders Login";
        String actualTitle = driver.getTitle();
        if (actualTitle.equalsIgnoreCase(expectedTitle)){
            System.out.println("Login Page Navigation verification PASSED");
        }else {
            System.out.println("FAILED");
        }
        //4. locate username and enter Tester

        WebElement usernameInputBox= driver.findElement(By.id("ctl00_MainContent_username"));
        usernameInputBox.sendKeys("Tester");

        //5. locate password and put password

      //  WebElement passwordBox = driver.findElement(By.id("ctl00_MainContent_password"));
      // passwordBox.sendKeys("test");
        // lazy method
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("tester");


        //6. click on Sign in button

        WebElement signInButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        signInButton.click();

        //7. verify title changed to expected
        String expectedHomePageTitle = "Web Orders";
        String actualHomePageTitle = driver.getTitle();

        if (actualTitle.equalsIgnoreCase(expectedTitle)){
            System.out.println("Login verification PASSED");
        }else {
            System.out.println("FAILED");
        }

        driver.close();

    }
}
