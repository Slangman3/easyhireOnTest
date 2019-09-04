package tests;

import models.AreaPlan;
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
        AreaPlan areaPlan = new AreaPlan();
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

        areaPlan.setCulturalConsiderations("Cultural Considerations");
        areaPlan.setCaregiverAndConsumerStrengths("Caregiver and Consumer Strengths");
        areaPlan.setImportantHealthMedicalConsiderations("Important Health Medical Considerations");
        areaPlan.setHealthDirectiveComments("Health Directive Comments");
        areaPlan.setBedPositioningComments("Bed Positioning Comments");
        areaPlan.setMovingTransferringComments("Moving Transferring Comments");
        areaPlan.setWalkingAmbulationComments("Walking Ambulation Comments");
        areaPlan.setGettingDressedComments("Getting Dressed Comments");
        areaPlan.setEatingDrinkingComments("Eating Drinking Comments");
        areaPlan.setToiletUseComments("Toilet Use Comments");
        areaPlan.setBathingShoweringComments("Bathing Showering Comments");
        areaPlan.setBrushingProblemManagementTips("Brushing Problem Management Tips");
        areaPlan.setBrushingComments("Brushing Comments");
        areaPlan.setPreparingMealsComments("Preparing Meals Comments");
        areaPlan.setLightHouseworkComments("Light Housework Comments");
        areaPlan.setTransportationComments("Transportation Comments");
        areaPlan.setFinancesComments("Finances Comments");
        areaPlan.setPhoneUseComments("Phone Use Comments");
        areaPlan.setShoppingComments("Shopping Comments");
        areaPlan.setEquipmentUsedTipsForManagingComment("Equipment Used Tips For Managing Comment");
        areaPlan.setMedicationPrepOrganizationComments("Medication Prep Organization Comments");
        areaPlan.setVisionComments("Vision Comments");
        areaPlan.setHearingComments("Hearing Comments");
        areaPlan.setCommunicationComments("Communication Comments");
        areaPlan.setPainComment("Pain Comment");
        areaPlan.setTreatmentNotesComments("Treatment Notes Comments");
        areaPlan.setEquipmentManagementNotesComments("Equipment Management Notes Comments");
        areaPlan.setSafetyNeedsNotesComments("Safety Needs Notes Comments");
        areaPlan.setuTAComments("uTA Comments");
        areaPlan.setDischargePlanNotesComments("Discharge Plan Notes Comments");

        page.createPlan(carePlan, areaPlan);
    }

    @AfterClass
    public void exitDriver() {
        driver.quit();
    }
}
