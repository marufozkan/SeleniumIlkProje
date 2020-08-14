package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElse {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\mrf\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();

   driver.get("http://amazon.com");
   String sayfaBasligi=driver.getTitle();
   if(sayfaBasligi.toLowerCase().contains("books")){
       System.out.println("books kelimesi geciyor");
   }else{
       System.out.println("books kelimesi gecmiyor");
   }
driver.quit();
    }




}
