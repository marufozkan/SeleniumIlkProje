package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TitleUrlTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\mrf\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://youtube.com");
        String sayfaBasligi=driver.getTitle();
        if(sayfaBasligi.toLowerCase().contains("video")){
            System.out.println("video kelimesi geciyor");
        }else{
            System.out.println("video kelimesi geciyor");
        }
        driver.quit();
    }
}
