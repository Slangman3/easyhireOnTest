package pages;

import elements.TextField;
import models.CarePlan;
import org.openqa.selenium.WebDriver;

public class CarePlanCreatePage {
    WebDriver driver;

    public CarePlanCreatePage(WebDriver driver) {
        this.driver = driver;
    }

    public void createPlan(CarePlan carePlan) {
        new TextField("Health Directive Other",driver).typeText(carePlan.getHealthDirectiveOther());
        new TextField("Location",driver).typeText(carePlan.getLocation());
        new TextField("Toilet Schedule Description",driver).typeText(carePlan.getToiletScheduleDescription());
        new TextField("Bath/Shower Assist Provided By Name",driver).typeText(carePlan.getBathShowerAssistProvidedByName());
        new TextField("Preparing Meals Problem Managing Tips",driver).typeText(carePlan.getPreparingMealsProblemManagingTips());
        new TextField("Performed By Others Name",driver).typeText(carePlan.getPerformedByOthersName());
        new TextField("Light Housework Problem Managing Tips",driver).typeText(carePlan.getLightHouseworkProblemManagingTips());
        new TextField("Caregiver/Family Transports Name",driver).typeText(carePlan.getCaregiverFamilyTransportsName());
        new TextField("Finances Performed By Others Name",driver).typeText(carePlan.getFinancesPerformedByOthersName());
        new TextField("Shopping Problem Managing Tips",driver).typeText(carePlan.getShoppingProblemManagingTips());
        new TextField("Equipment Used Other Tips",driver).typeText(carePlan.getEquipmentUsedOtherTips());
        new TextField("Pain Location Comment",driver).typeText(carePlan.getPainLocationComment());
        new TextField("Pain Source Comment",driver).typeText(carePlan.getPainSourceComment());
        new TextField("Pain Triggerd By Comment",driver).typeText(carePlan.getPainTriggerdByComment());
        new TextField("Wound Care By",driver).typeText(carePlan.getWoundCareBy());
        new TextField("Other Treatments Name",driver).typeText(carePlan.getOtherTreatmentsName());
        new TextField("Injections By",driver).typeText(carePlan.getInjectionsBy());
        new TextField("Other Equipment Name",driver).typeText(carePlan.getTherEquipmentName());
        new TextField("Equipment Cared For By",driver).typeText(carePlan.getEquipmentCaredForBy());
    }
}
