package org.cambian;

import Baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login  {
    @Test
    public void loginTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\IdeaProjects\\Cambian\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/V4/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr404594");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ysYdUzy");
        driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
        Thread.sleep(3000);
        System.out.println("if the manager value appeared is mngr404594,the we sussesfully logged in :");
        System.out.println();
        driver.findElement(By.xpath("//td[contains(text(),'Manger Id : mngr404594')]")).getText();
        System.out.println(driver.findElement(By.xpath("//td[contains(text(),'Manger Id : mngr404594')]")).getText());
        System.out.println("welcome message:");
        System.out.println(driver.findElement(By.xpath("//marquee[contains(text(),\"Welcome To Manager's Page of Guru99 Bank\")]")).getText());
    System.out.println("Login test passed sussccessfully");
    driver.close();
    }



    }

