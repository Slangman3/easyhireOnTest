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
    private ChromeDriver driver;

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

        carePlan.setCulturalConsiderations("Cultural Considerations");
        carePlan.setCaregiverAndConsumerStrengths("Caregiver and Consumer Strengths");
        carePlan.setImportantHealthMedicalConsiderations("Important Health Medical Considerations");
        carePlan.setHealthDirectiveComments("Health Directive Comments");
        carePlan.setBedPositioningComments("Bed Positioning Comments");
        carePlan.setMovingTransferringComments("Moving Transferring Comments");
        carePlan.setWalkingAmbulationComments("Walking Ambulation Comments");
        carePlan.setGettingDressedComments("Getting Dressed Comments");
        carePlan.setEatingDrinkingComments("Eating Drinking Comments");
        carePlan.setToiletUseComments("Toilet Use Comments");
        carePlan.setBathingShoweringComments("Bathing Showering Comments");
        carePlan.setBrushingProblemManagementTips("Brushing Problem Management Tips");
        carePlan.setBrushingComments("Brushing Comments");
        carePlan.setPreparingMealsComments("Preparing Meals Comments");
        carePlan.setLightHouseworkComments("Light Housework Comments");
        carePlan.setTransportationComments("Transportation Comments");
        carePlan.setFinancesComments("Finances Comments");
        carePlan.setPhoneUseComments("Phone Use Comments");
        carePlan.setShoppingComments("Shopping Comments");
        carePlan.setEquipmentUsedTipsForManagingComment("Equipment Used Tips For Managing Comment");
        carePlan.setMedicationPrepOrganizationComments("Medication Prep Organization Comments");
        carePlan.setVisionComments("Vision Comments");
        carePlan.setHearingComments("Hearing Comments");
        carePlan.setCommunicationComments("Communication Comments");
        carePlan.setPainComment("Pain Comment");
        carePlan.setTreatmentNotesComments("Treatment Notes Comments");
        carePlan.setEquipmentManagementNotesComments("Equipment Management Notes Comments");
        carePlan.setSafetyNeedsNotesComments("Safety Needs Notes Comments");
        carePlan.setuTAComments("uTA Comments");
        carePlan.setDischargePlanNotesComments("Discharge Plan Notes Comments");

        page.createPlan(carePlan);
    }

    @AfterClass
    public void exitDriver() {
        driver.quit();
    }
}
