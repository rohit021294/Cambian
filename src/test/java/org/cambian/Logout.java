package org.cambian;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Logout {
    @Test
    public void logoutTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\IdeaProjects\\Cambian\\driver\\chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://demo.guru99.com/V4/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        System.out.println("Before Loging out we need to Login");
        driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr404594");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ysYdUzy");
        driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
        Thread.sleep(3000);
        System.out.println("if the manager value appeared is mngr404594,the we sussesfully logged in :");
        System.out.println();
        driver.findElement(By.xpath("//td[contains(text(),'Manger Id : mngr404594')]")).getText();
        System.out.println("now we are logging out");
        System.out.println("we are going to click the button named:"+"LOGOUT");
     //   System.out.println(driver.findElement(By.xpath("By.xpath(\"//a[contains(text(),'Log out')]\")")).getText());
        driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
       Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Steps To Generate Access')]")).getText());
        System.out.println("if output is this:  [Steps To Generate Access],then we successfully logged out");
        System.out.println("LOGOUT test passes successfully");
        driver.close();
    }
}
