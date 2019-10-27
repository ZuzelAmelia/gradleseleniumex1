package com.love2code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManagerClass {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\zuzel.gorostiaga\\IdeaProjects\\gradleseleniumex1\\src\\test\\resources\\webdrivers\\chromedriver.exe");
        // Create a new instance of the Firefox driver
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().window().maximize();

        //Launch the Online Store Website
        driver.get("https://www.google.com/");

        // Print a Log In message to the screen
        System.out.println("Successfully opened the website Google Chrome");



    }
}
