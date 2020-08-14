package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverOdev {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\mrf\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver webDriver =new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("http://google.com");
        String titlegoogle=webDriver.getTitle();
        System.out.println(titlegoogle);
        webDriver.navigate().to("http://youtube.com");
        String titleyoutube=webDriver.getTitle();

        String Urlyoutube=webDriver.getCurrentUrl();
        System.out.println(titleyoutube);
        System.out.println(Urlyoutube);
        webDriver.navigate().back();
        String urlGoogle = webDriver.getCurrentUrl();
        System.out.println(urlGoogle);
        webDriver.quit();




    }

}
