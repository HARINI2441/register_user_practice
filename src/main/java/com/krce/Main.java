//package com.krce;
//
//import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.io.File;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.time.Duration;
//
//public void Main() {
//    WebDriver driver = new ChromeDriver();
//    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//    driver.get("https://the-internet.herokuapp.com/login");
//    driver.findElement(By.id("username")).sendKeys("tomsmith");
//    driver.findElement(By.id("password")).sendKeys("SuperSecretPassword");
//    driver.findElement(By.cssSelector("button[type='submit']")).click();
//    WebElement flash = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("flash")));
//    System.out.println("Login Message : "+flash.getText().trim());
//    File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//    Files.copy(screenshot.toPath(),new File("screenshot.png").toPath());
//    driver.quit();
//}
