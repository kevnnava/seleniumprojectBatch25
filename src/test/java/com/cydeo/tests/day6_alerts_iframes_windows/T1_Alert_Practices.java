package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Alert_Practices {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        // 1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2. Go to website: https://practice.cydeo.com/javascript_alerts
        driver.get("https://practice.cydeo.com/javascript_alerts");
    }

    @Test
    public void alert_test1(){
        // 3. Click to “Click for JS Alert” button
        // To be able to click to Alert OK button we need to switch driver's focus to Alert itself.
        // 4. Click to OK button from the alert
        // 5. Verify “You successfully clicked an alert” text is displayed.
        // Failure message will only be displayed if assertion fails: "Result text is NOT displayed."


    }


}
