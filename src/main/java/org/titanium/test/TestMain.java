package org.titanium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.titanium.utils.Constants;

import java.net.MalformedURLException;

public class TestMain {
    WebDriver driver;
    WebDriverWait wait;
    WebElement lblError;
    String baseUrl = "http://www.store.demoqa.com";
    String chromePath = System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";

    @BeforeTest
    public void setUp() throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.get(baseUrl);
        driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

    @Test(priority=0, description="Test Case using valid credentials")
    public void validCredentials() throws InterruptedException{

    }

    @Test(priority=1, description="Test Case using empty password")
    public void emptyPassword() {

    }

    @Test(priority=2, description="Test Case using empty credentials")
    public void emptyCredentials(){

    }

    @Test(priority=3, description="Test Case using empty user name")
    public void emptyUserName(){

    }

    @Test(priority=4, description="Test Case using wrong credentials")
    public void invalidCredentials(){

    }
}
