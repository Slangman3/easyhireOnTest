package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeniorLinkLoginPage {

    private static final String URL = "https://seniorlink--staging.lightning.force.com/lightning/o/Personal_Care_Plan__c/new?count=3&ws=%2Flightning%2Fr%2FOpportunity%2F0065500000CJiqqAAD%2Fview&nooverride=1&useRecordTypeCheck=1&navigationLocation=RELATED_LIST&uid=1567436538193 ";
    WebDriver driver;
    WebDriverWait wait;

    By userName = By.id("username");
    By password = By.id("password");
    By loginButton = By.id("Login");

    public SeniorLinkLoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public void startLogin(String name, String pass) {
        driver.get(URL);
        driver.findElement(userName).sendKeys(name);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginButton).click();
    }

}
