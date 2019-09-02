//package pages;
//
//import org.openqa.selenium.*;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//
//import java.awt.*;
//import java.awt.datatransfer.DataFlavor;
//import java.awt.datatransfer.UnsupportedFlavorException;
//import java.io.IOException;
//import java.util.List;
//
//import static org.testng.Assert.*;
//
//public class EasyhireMainPage {
//    private static final String URL = "https://web.automation.easyhire.me/en/login";
//    WebDriver driver;
//    WebDriverWait wait;
//
//    By inputAreaLoginByEmail = By.xpath("//*[@name='email']");
//    By inputAreaLoginByPassword = By.xpath("//*[@name='password']");
//    By loginBtn = By.xpath("//*[@type='submit']");
//    By acceptCookies = By.xpath("//*[contains(@class, 'jss222 jss196 jss207 jss208 jss210 jss211 jss985')]");
//    By questionsBtn = By.xpath("//*[@href='#!questions']");
//    By plusBtn = By.xpath("//*[@class='plus-button']");
//    By inputSetName = By.xpath("//*[@id='add-question-set-modal']//input");
//    By saveNewSet = By.xpath("//*[contains(@can-click, 'addQuestionSet')]");
//    By listOfSets = By.className("ehselect-current-text");
//    By editBtn = By.xpath("//*[contains(@icon, 'mode_edit')]");
//    By deleteSetBtn = By.xpath("//*[contains(@can-click, 'deleteQuestionSet')]");
//
//    public EasyhireMainPage(WebDriver driver) {
//        this.driver = driver;
//        wait = new WebDriverWait(driver, 10);
//    }
//
//    public void openPage() {
//        driver.get(URL);
//        driver.findElement(inputAreaLoginByEmail).sendKeys("tms2@mailinator.com");
//        driver.findElement(inputAreaLoginByPassword).sendKeys("Password01");
//        driver.findElement(acceptCookies).click();
//        driver.findElement(loginBtn).click();
//    }
//
//    public void goToQuestionsPage() {
//        driver.findElement(questionsBtn).click();
//    }
//
//    public void addNewQuestionSetByPlusBtn(String nameOfNewQuestionSet) throws InterruptedException {
//        driver.findElement(plusBtn).click();
//        driver.findElement(By.xpath("//*[contains(@can-click, 'createQuestionSet')]")).click();
//        driver.findElements(inputSetName).get(0).sendKeys(nameOfNewQuestionSet);
//        List <WebElement> mobile = driver.findElements(inputSetName);
//        WebElement checkBoxMobile = mobile.get(1);
//        assertTrue(checkBoxMobile.isSelected());
//        driver.findElements(inputSetName).get(1).click();
//        assertFalse(checkBoxMobile.isSelected());
//        driver.findElement(saveNewSet).click();
//
//        Thread.sleep(2000);
//        String actualName1 = driver.findElements(listOfSets).get(2).getText();
//        assertEquals(actualName1, nameOfNewQuestionSet);
//
//        driver.findElement(editBtn).click();
//        driver.findElement(deleteSetBtn).click();
//
//        Thread.sleep(2000);
//        String actualName2 = driver.findElements(listOfSets).get(2).getText();
//        assertEquals(actualName2, "Sample");
//    }
//}