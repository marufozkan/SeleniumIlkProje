package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class Day02_NavigationMethods {
    public static <Webdriver> void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\mrf\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver webDriver=new ChromeDriver();
        webDriver.manage().window().maximize();
     webDriver.get("http://google.com");
        webDriver.navigate().to("http://amazon.com");
        webDriver.navigate().back();
        webDriver.navigate().forward();
        webDriver.navigate().refresh();


    }




}
