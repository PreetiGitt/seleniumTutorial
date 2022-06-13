package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginAutomate {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","D:\\setup\\SeleniumDriver\\chromeDriver\\chromedriver.exe");
        WebDriver webDriver=new ChromeDriver();
        webDriver.get("https://demo.mykumpany.com/web/login");
        webDriver.manage().window().maximize();// maximize the browser window
        WebElement username=webDriver.findElement(By.id("login"));
        username.sendKeys("demo");
        webDriver.findElement(By.id("password")).sendKeys("123456");
        webDriver.findElement(By.xpath("/html/body/div/main/div/form/div[3]/button")).click();
        String expTitle="  Odoo  ";
       // System.out.println("The title is"+webDriver.getTitle());
        if(expTitle.replace(" ","").equals(webDriver.getTitle()))
            System.out.println("test passed");
        else
            System.out.println("test failed");
        webDriver.close();// close the browser window

    }
}
