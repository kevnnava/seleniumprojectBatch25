package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        // 1- Set up the browser driver
        WebDriverManager.chromedriver().setup();

        // 2- Create instance of the Selenium WebDriver
        // This is the line opening an empty browser
        WebDriver driver = new ChromeDriver();

        // 3- Go to "https://www.tesla.com"
        driver.get("https://www.tesla.com");

        // gets the title of the page
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        // Gets the current URL using selenium
        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        // Stop code execution for 3 seconds
        Thread.sleep(3000);

        // Use selenium to navigate back
        driver.navigate().back();

        // Stop code execution for 3 seconds
        Thread.sleep(3000);

        // Use selenium to navigate forward
        driver.navigate().forward();

        // Stop code execution for 3 seconds
        Thread.sleep(3000);

        // Use selenium to navigate refresh
        driver.navigate().refresh();

        // Stop code execution for 3 seconds
        Thread.sleep(3000);

        // use navigate().to():
        driver.navigate().to("https://www.google.com");

        // gets the current title after getting the Google page
        currentTitle = driver.getTitle();

        // gets the title of the page
        //System.out.println("driver.getTitle() = " + driver.getTitle()); // one way to do it

        System.out.println("currentTitle = " + currentTitle);

        // Gets the current URL using selenium
        currentURL = driver.getCurrentUrl();

        System.out.println("currentURL = " + currentURL);


    }
}
