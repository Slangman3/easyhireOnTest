package tests;

import models.CarePlan;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CarePlanCreatePage;
import pages.SeniorLinkLoginPage;

import java.util.concurrent.TimeUnit;

public class SeniorLoginTest {
    ChromeDriver driver;

    @BeforeClass
    public void openDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void startSeniorLoginPage() {
        SeniorLinkLoginPage start = new SeniorLinkLoginPage(driver);
        start.startLogin("aqa1@mailinator.com", "Password02");
    }

    @Test
    public void createCarePlan() {
        CarePlanCreatePage page = new CarePlanCreatePage(driver);
        CarePlan carePlan = new CarePlan();
        carePlan.setHealthDirectiveOther("Health Directive");
        carePlan.setLocation("Location");
        carePlan.setToiletScheduleDescription("Toilet");
        carePlan.setBathShowerAssistProvidedByName("Bath Shower");
        carePlan.setPreparingMealsProblemManagingTips("Preparing Meals");
        page.createPlan(carePlan);
    }

    @AfterClass
    public void exitDriver() {
        driver.quit();
    }
}
