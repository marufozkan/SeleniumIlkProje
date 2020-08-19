package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tekrar02 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mrf\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://google.com");
        driver.manage().window().maximize();
        driver.navigate().refresh();
        driver.navigate().to("http://amazon.com");
        driver.manage().window().maximize();
        driver.navigate().refresh();
             driver.navigate().back();
             driver.navigate().forward();


             String sayfa=driver.getTitle();

       System.out.println(">>>>>>"+sayfa.length());

       String adres=driver.getCurrentUrl();
        System.out.println(">>>>>>"+adres.length());

        System.out.println(">>>>>>"+adres.toLowerCase().contains("a"));
driver.quit();



    }


}
