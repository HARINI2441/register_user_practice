package com.krce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class PracticeTest {
    protected WebDriver driver;
    protected WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void testlogin() throws InterruptedException{
          driver.get("https://the-internet.herokuapp.com/login");
          driver.findElement(By.id("username")).sendKeys("tomsmith");
          driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
          driver.findElement(By.cssSelector("button[type='submit']")).click();
          Thread.sleep(2000);
    }
}






