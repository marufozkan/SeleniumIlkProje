package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\mrf\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://facebook.com ");
           String sayfaBasligi=driver.getTitle();

           if(sayfaBasligi.toLowerCase().equals("facebook")){
System.out.println("sayfa basligi facebook oldugu dogrulandi");
           }else{
  System.out.println(sayfaBasligi);
           }
           String url=driver.getCurrentUrl();
           if(url.contains("facebook")){
System.out.println("Sayfa Url si facebook kelimesini iceriyor ");
           }else{
System.out.println(url);
           }
driver.navigate().to("http://www.walmart.com");
String sayfaWalmart=driver.getTitle();
if(sayfaWalmart.contains("Walmart.com")){
    System.out.println("Walmart sayfa basligi Walmart.com iceriyor");
}else{
    System.out.println("Walmart sayfa basligi Walmart.com icermiyor");
}
driver.navigate().back();
driver.navigate().refresh();
driver.manage().window().maximize();
        driver.close();
    }


}
