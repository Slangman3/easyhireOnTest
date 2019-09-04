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
    public void startLoginFillInputs() {
        SeniorLinkLoginPage start = new SeniorLinkLoginPage(driver);
        start.startLogin("aqa1@mailinator.com", "Password02");
        CarePlanCreatePage page = new CarePlanCreatePage(driver);
        CarePlan carePlan = new CarePlan();
        carePlan.setHealthDirectiveOther("Health Directive");
        carePlan.setLocation("Location");
        carePlan.setToiletScheduleDescription("Toilet");
        carePlan.setBathShowerAssistProvidedByName("Bath Shower");
        carePlan.setPreparingMealsProblemManagingTips("Preparing Meals");
        carePlan.setPerformedByOthersName("Perfermed By Others");
        carePlan.setLightHouseworkProblemManagingTips("Set lighthouse Work");
        carePlan.setCaregiverFamilyTransportsName("Category Family");
        carePlan.setFinancesPerformedByOthersName("Finances Permormed");
        carePlan.setShoppingProblemManagingTips("Shopping Problem");
        carePlan.setEquipmentUsedOtherTips("Equipment Used");
        carePlan.setPainLocationComment("Pain Location");
        carePlan.setPainSourceComment("Pain Source");
        carePlan.setPainTriggerdByComment("Pain Triggerd");
        carePlan.setWoundCareBy("Wound Care");
        carePlan.setOtherTreatmentsName("Other Treatments");
        carePlan.setInjectionsBy("Injections By");
        carePlan.setTherEquipmentName("Ther Equipment Name");
        carePlan.setEquipmentCaredForBy("Equipment Cared");
        page.createPlan(carePlan);
    }

    @AfterClass
    public void exitDriver() {
        driver.quit();
    }
}
