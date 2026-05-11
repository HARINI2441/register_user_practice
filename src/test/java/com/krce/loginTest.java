package com.krce;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class loginTest {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("autofill.profile_enabled", false);

        options.setExperimentalOption("prefs", prefs);
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    @AfterMethod
    public void tearDown()throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void testLogin() throws InterruptedException {
        driver.get("https://automationexercise.com");
        Thread.sleep(2000);
//        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.findElement(By.linkText("Signup / Login")).click();
//        Thread.sleep(2000);
        driver.findElement(By.name("name")).sendKeys("Harini");
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("Hariniip@gmail.com");
        driver.findElement(By.cssSelector("button[data-qa='signup-button']")).click();
//        Thread.sleep(2000);
        driver.findElement(By.id("uniform-id_gender2")).click();
        driver.findElement(By.id("password")).sendKeys("Eca_2241");
        Select day = new Select(driver.findElement(By.id("days")));
        day.selectByValue("24");
        Select month = new Select(driver.findElement(By.id("months")));
        month.selectByValue("1");
        Select year = new Select(driver.findElement(By.id("years")));
        year.selectByValue("2005");
//        Thread.sleep(2000);
        driver.findElement(By.id("newsletter")).click();
        driver.findElement(By.id("optin")).click();
        driver.findElement(By.id("first_name")).sendKeys("Harini");
//        Thread.sleep(2000);
        driver.findElement(By.id("last_name")).sendKeys("Petchimuthu");
        driver.findElement(By.id("company")).sendKeys("HCLTech");
        driver.findElement(By.id("address1")).sendKeys("9/338, NewColony Street, Vishampettai.");
        driver.findElement(By.id("address2")).sendKeys("AnbilPadugai, Tiruchirapalli");
        Select country = new Select(driver.findElement(By.id("country")));
        country.selectByValue("India");
        driver.findElement(By.id("state")).sendKeys("TamilNadu");
        driver.findElement(By.id("city")).sendKeys("Thanjavur");
        driver.findElement(By.id("zipcode")).sendKeys("123459");
        driver.findElement(By.id("mobile_number")).sendKeys("2294894533");
        WebElement btn = driver.findElement(By.cssSelector("button[data-qa='create-account']"));
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView({block:'center'});", btn);

        btn.click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();
//This is Harini

    }

}
