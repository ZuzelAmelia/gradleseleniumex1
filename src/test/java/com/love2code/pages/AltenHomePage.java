package com.love2code.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AltenHomePage {

    WebDriver driver;

    By homePageUserName = By.xpath("//li//span[@id='usernameMenu']");



    public AltenHomePage(WebDriver driver){

        this.driver = driver;

    }

    //Get the User name from Home Page

    public String getHomePageDashboardUserName(){

        return    driver.findElement(homePageUserName).getText();


    }

}
