package org.cambian;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HelloWorrld {
@Test
    public void helloWorld() throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\IdeaProjects\\Cambian\\driver\\chromedriver.exe");
//    ChromeOptions options=new ChromeOptions();
//    options.addArguments("headless");

    WebDriver driver=new ChromeDriver();
    driver.get("https://demo.guru99.com/V4/");
    driver.manage().window().maximize();
    Thread.sleep(3000);
    System.out.println("print the name of Selenium link  :");
    driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]")).getText();
    Thread.sleep(2000);
    System.out.println(" the test is passed if test is :'Selenium' ");
    System.out.println("heelo world test passed sussefuly");
    driver.close();
}
}
