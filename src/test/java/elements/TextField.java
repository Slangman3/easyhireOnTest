package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextField {
    WebDriver driver;
    WebElement element;
    String label;
    WebDriverWait wait;

    public TextField(String label, WebDriver driver) {

        this.driver = driver;
        this.label = label;
        element = driver.findElement(By.xpath(String.format("//span[text()='%s']/../..//following-sibling::input", label)));
        wait = new WebDriverWait(driver, 10);
    }

    public TextField typeText(String text) {
        wait.until(ExpectedConditions.visibilityOf(element));
        System.out.println(String.format("Writing text %s into input %s", text, label));
        element.sendKeys(text);
        return this;
    }
}
