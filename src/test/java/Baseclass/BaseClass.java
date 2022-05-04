package Baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    public void intializeDriver()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\IdeaProjects\\Cambian\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

    }
}
