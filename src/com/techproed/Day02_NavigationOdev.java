package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationOdev {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\mrf\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver webDriver=new ChromeDriver();

        webDriver.get("http://google.com");
        webDriver.navigate().to("http://youtube.com");

        webDriver.navigate().forward();
        webDriver.navigate().refresh();
        webDriver.quit();




    }


}
