package com.love2code.test;

import com.love2code.pages.AltenHomePage;
import com.love2code.pages.AltenLoginPage;

import org.junit.Assert;
import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAltenLogin {

    private WebDriver driver;

    AltenLoginPage objLogin;

    AltenHomePage objHomePage;

    @Before
    public void setUp() {

        System.setProperty("webdriver.chrome.driver","/src/test/resources/webdrivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().window().maximize();
        driver.get("http://172.21.0.93:8080/production/login.html");

    }



    /**
     * This test case will login in http://172.21.0.93:8080/production/login.html
     * <p>
     * Verify in the login page that exists the class name login_title
     * <p>
     * Login to application
     * <p>
     * Verify the home page using Dashboard message
     */

    @Test
    public void test_Home_Page_Appear_Correct(){

        //Create Login Page object

        objLogin = new AltenLoginPage(driver);

        //Verify login page title

        String loginPageTitle = objLogin.getLoginTitle();

        Assert.assertTrue(loginPageTitle.toLowerCase().contains("Alten Web Reporting"));

        //login to application

        //objLogin.loginToAlten("admin", "Alten47151");

        // go the next page

        //objHomePage = new AltenHomePage(driver);

        //Verify home page

        //Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : "));

    }

}