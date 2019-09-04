package pages;

import elements.AreaTextField;
import elements.TextField;
import models.CarePlan;
import org.openqa.selenium.WebDriver;

public class CarePlanCreatePage {
    WebDriver driver;

    public CarePlanCreatePage(WebDriver driver) {
        this.driver = driver;
    }

    public void createPlan(CarePlan carePlan) {
        new TextField("Health Directive Other", driver).typeText(carePlan.getHealthDirectiveOther());
        new TextField("Location", driver).typeText(carePlan.getLocation());
        new TextField("Toilet Schedule Description", driver).typeText(carePlan.getToiletScheduleDescription());
        new TextField("Bath/Shower Assist Provided By Name", driver).typeText(carePlan.getBathShowerAssistProvidedByName());
        new TextField("Preparing Meals Problem Managing Tips", driver).typeText(carePlan.getPreparingMealsProblemManagingTips());
        new TextField("Performed By Others Name", driver).typeText(carePlan.getPerformedByOthersName());
        new TextField("Light Housework Problem Managing Tips", driver).typeText(carePlan.getLightHouseworkProblemManagingTips());
        new TextField("Caregiver/Family Transports Name", driver).typeText(carePlan.getCaregiverFamilyTransportsName());
        new TextField("Finances Performed By Others Name", driver).typeText(carePlan.getFinancesPerformedByOthersName());
        new TextField("Shopping Problem Managing Tips", driver).typeText(carePlan.getShoppingProblemManagingTips());
        new TextField("Equipment Used Other Tips", driver).typeText(carePlan.getEquipmentUsedOtherTips());
        new TextField("Pain Location Comment", driver).typeText(carePlan.getPainLocationComment());
        new TextField("Pain Source Comment", driver).typeText(carePlan.getPainSourceComment());
        new TextField("Pain Triggered By Comment", driver).typeText(carePlan.getPainTriggerdByComment());
        new TextField("Wound Care By", driver).typeText(carePlan.getWoundCareBy());
        new TextField("Other Treatments Name", driver).typeText(carePlan.getOtherTreatmentsName());
        new TextField("Injections By", driver).typeText(carePlan.getInjectionsBy());
        new TextField("Other Equipment Name", driver).typeText(carePlan.getTherEquipmentName());
        new TextField("Equipment Cared For By", driver).typeText(carePlan.getEquipmentCaredForBy());

        new AreaTextField("Cultural Considerations", driver).typeInToArea(carePlan.getCulturalConsiderations());
        new AreaTextField("Caregiver and Consumer Strengths", driver).typeInToArea(carePlan.getCaregiverAndConsumerStrengths());
        new AreaTextField("Important Health/Medical Considerations", driver).typeInToArea(carePlan.getImportantHealthMedicalConsiderations());
        new AreaTextField("Health Directive Comments", driver).typeInToArea(carePlan.getHealthDirectiveComments());
        new AreaTextField("Bed Positioning Comments", driver).typeInToArea(carePlan.getBedPositioningComments());
        new AreaTextField("Moving/Transferring Comments", driver).typeInToArea(carePlan.getMovingTransferringComments());
        new AreaTextField("Walking/Ambulation Comments", driver).typeInToArea(carePlan.getWalkingAmbulationComments());
        new AreaTextField("Getting Dressed Comments", driver).typeInToArea(carePlan.getGettingDressedComments());
        new AreaTextField("Eating/Drinking Comments", driver).typeInToArea(carePlan.getEatingDrinkingComments());
        new AreaTextField("Toilet Use Comments", driver).typeInToArea(carePlan.getToiletUseComments());
        new AreaTextField("Bathing/Showering Comments", driver).typeInToArea(carePlan.getBathingShoweringComments());
        new AreaTextField("Brushing Problem Management Tips", driver).typeInToArea(carePlan.getBrushingProblemManagementTips());
        new AreaTextField("Brushing Comments", driver).typeInToArea(carePlan.getBrushingComments());
        new AreaTextField("Preparing Meals Comments", driver).typeInToArea(carePlan.getPreparingMealsComments());
        new AreaTextField("Light Housework Comments", driver).typeInToArea(carePlan.getLightHouseworkComments());
        new AreaTextField("Transportation Comments", driver).typeInToArea(carePlan.getTransportationComments());
        new AreaTextField("Finances Comments", driver).typeInToArea(carePlan.getFinancesComments());
        new AreaTextField("Phone Use Comments", driver).typeInToArea(carePlan.getPhoneUseComments());
        new AreaTextField("Shopping Comments", driver).typeInToArea(carePlan.getShoppingComments());
        new AreaTextField("Equipment Used/Tips For Managing Comment", driver).typeInToArea(carePlan.getEquipmentUsedTipsForManagingComment());
        new AreaTextField("Medication Prep/Organization Comments", driver).typeInToArea(carePlan.getMedicationPrepOrganizationComments());
        new AreaTextField("Vision Comments", driver).typeInToArea(carePlan.getVisionComments());
        new AreaTextField("Hearing Comments", driver).typeInToArea(carePlan.getHearingComments());
        new AreaTextField("Communication Comments", driver).typeInToArea(carePlan.getCommunicationComments());
        new AreaTextField("Pain Comment", driver).typeInToArea(carePlan.getPainComment());
        new AreaTextField("Treatment Notes/Comments", driver).typeInToArea(carePlan.getTreatmentNotesComments());
        new AreaTextField("Equipment Management Notes/Comments", driver).typeInToArea(carePlan.getEquipmentManagementNotesComments());
        new AreaTextField("Safety Needs Notes/Comments", driver).typeInToArea(carePlan.getSafetyNeedsNotesComments());
        new AreaTextField("UTA Comments", driver).typeInToArea(carePlan.getuTAComments());
        new AreaTextField("Discharge Plan Notes/Comments", driver).typeInToArea(carePlan.getDischargePlanNotesComments());
    }
}
