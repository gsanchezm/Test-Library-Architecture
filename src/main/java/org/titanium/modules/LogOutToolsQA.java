package org.titanium.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogOutToolsQA {

    WebDriver driver;

    public LogOutToolsQA(WebDriver driver){
        this.driver = driver;
    }

    public boolean logOutApplication(){

        try{
            System.out.println(driver.findElement(By.xpath("//li[@id='wp-admin-bar-my-account']")).getText());
            driver.findElement(By.id("account_logout")).click();
        }catch(Exception ex){
            System.err.println(ex.getMessage());
            return false;
        }
        return true;
    }
}
