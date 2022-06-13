package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\setup\\SeleniumDriver\\chromeDriver\\chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--headless");//setting browser headless
        WebDriver webDriver=new ChromeDriver(options);
        webDriver.get("https://demo.mykumpany.com/web/login");

        WebElement username=webDriver.findElement(By.id("login"));
        username.sendKeys("demo");
        webDriver.findElement(By.id("password")).sendKeys("123456");
        webDriver.findElement(By.xpath("/html/body/div/main/div/form/div[3]/button")).click();
        String expTitle="  Odoo  ";

        if(expTitle.replace(" ","").equals(webDriver.getTitle()))
            System.out.println("test passed");
        else
            System.out.println("test failed");
        webDriver.close();// close the browser window

    }
}
