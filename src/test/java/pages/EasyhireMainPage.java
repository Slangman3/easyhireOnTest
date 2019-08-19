package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import static org.testng.Assert.*;

public class EasyhireMainPage {
    private static final String URL = "https://web.automation.easyhire.me/en/login";
    WebDriver driver;
    WebDriverWait wait;

    By inputAreaLoginByEmail = By.xpath("//*[@name='email']");
    By inputAreaLoginByPassword = By.xpath("//*[@name='password']");
    By loginBtn = By.xpath("//*[@type='submit']");
    By acceptCookies = By.xpath("//*[contains(@class, 'jss222 jss196 jss207 jss208 jss210 jss211 jss985')]");
    By questionsBtn = By.xpath("//*[@href='#!questions']");

    public EasyhireMainPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public void openPage() {
        driver.get(URL);
        driver.findElement(inputAreaLoginByEmail).sendKeys("tms2@mailinator.com");
        driver.findElement(inputAreaLoginByPassword).sendKeys("Password01");
        driver.findElement(acceptCookies).click();
        driver.findElement(loginBtn).click();
    }

    public void goToQuestionsPage(){
        driver.findElement(questionsBtn).click();
    }
}