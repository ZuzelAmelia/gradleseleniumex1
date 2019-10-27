package com.love2code.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class AltenLoginPage {

    WebDriver driver;

    By altenUserName = By.name("userName");

    By altenPassword = By.name("password");

    By titleText =By.className("login_title");

    By login = By.id("loginButton");

    public AltenLoginPage(WebDriver driver) {

        this.driver = driver;
    }

    //Set user name in textbox

    public void setUserName(String strUserName){

        driver.findElement(altenUserName).sendKeys(strUserName);

    }

    //Set password in password textbox

    public void setPassword(String strPassword){

        driver.findElement(altenPassword).sendKeys(strPassword);

    }
//Click on login button

    public void clickLogin(){

        driver.findElement(login).click();

    }

    //Get the title of Login Page

    public String getLoginTitle(){

        return    driver.findElement(titleText).getText();

    }

    public void loginToAlten(String strUserName, String strPassword){

        //Fill user name

        this.setUserName(strUserName);

        //Fill password

        this.setPassword(strPassword);

        //Click Login button

        this.clickLogin();
    }


}
