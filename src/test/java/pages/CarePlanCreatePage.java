package pages;

import elements.AreaTextField;
import elements.TextField;
import models.AreaPlan;
import models.CarePlan;
import org.openqa.selenium.WebDriver;

public class CarePlanCreatePage {
    WebDriver driver;

    public CarePlanCreatePage(WebDriver driver) {
        this.driver = driver;
    }

    public void createPlan(CarePlan carePlan, AreaPlan areaPlan) {
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

        new AreaTextField("Cultural Considerations", driver).typeInToArea(areaPlan.getCulturalConsiderations());
        new AreaTextField("Caregiver and Consumer Strengths", driver).typeInToArea(areaPlan.getCaregiverAndConsumerStrengths());
        new AreaTextField("Important Health/Medical Considerations", driver).typeInToArea(areaPlan.getImportantHealthMedicalConsiderations());
        new AreaTextField("Health Directive Comments", driver).typeInToArea(areaPlan.getHealthDirectiveComments());
        new AreaTextField("Bed Positioning Comments", driver).typeInToArea(areaPlan.getBedPositioningComments());
        new AreaTextField("Moving/Transferring Comments", driver).typeInToArea(areaPlan.getMovingTransferringComments());
        new AreaTextField("Walking/Ambulation Comments", driver).typeInToArea(areaPlan.getWalkingAmbulationComments());
        new AreaTextField("Getting Dressed Comments", driver).typeInToArea(areaPlan.getGettingDressedComments());
        new AreaTextField("Eating/Drinking Comments", driver).typeInToArea(areaPlan.getEatingDrinkingComments());
        new AreaTextField("Toilet Use Comments", driver).typeInToArea(areaPlan.getToiletUseComments());
        new AreaTextField("Bathing/Showering Comments", driver).typeInToArea(areaPlan.getBathingShoweringComments());
        new AreaTextField("Brushing Problem Management Tips", driver).typeInToArea(areaPlan.getBrushingProblemManagementTips());
        new AreaTextField("Brushing Comments", driver).typeInToArea(areaPlan.getBrushingComments());
        new AreaTextField("Preparing Meals Comments", driver).typeInToArea(areaPlan.getPreparingMealsComments());
        new AreaTextField("Light Housework Comments", driver).typeInToArea(areaPlan.getLightHouseworkComments());
        new AreaTextField("Transportation Comments", driver).typeInToArea(areaPlan.getTransportationComments());
        new AreaTextField("Finances Comments", driver).typeInToArea(areaPlan.getFinancesComments());
        new AreaTextField("Phone Use Comments", driver).typeInToArea(areaPlan.getPhoneUseComments());
        new AreaTextField("Shopping Comments", driver).typeInToArea(areaPlan.getShoppingComments());
        new AreaTextField("Equipment Used/Tips For Managing Comment", driver).typeInToArea(areaPlan.getEquipmentUsedTipsForManagingComment());
        new AreaTextField("Medication Prep/Organization Comments", driver).typeInToArea(areaPlan.getMedicationPrepOrganizationComments());
        new AreaTextField("Vision Comments", driver).typeInToArea(areaPlan.getVisionComments());
        new AreaTextField("Hearing Comments", driver).typeInToArea(areaPlan.getHearingComments());
        new AreaTextField("Communication Comments", driver).typeInToArea(areaPlan.getCommunicationComments());
        new AreaTextField("Pain Comment", driver).typeInToArea(areaPlan.getPainComment());
        new AreaTextField("Treatment Notes/Comments", driver).typeInToArea(areaPlan.getTreatmentNotesComments());
        new AreaTextField("Equipment Management Notes/Comments", driver).typeInToArea(areaPlan.getEquipmentManagementNotesComments());
        new AreaTextField("Safety Needs Notes/Comments", driver).typeInToArea(areaPlan.getSafetyNeedsNotesComments());
        new AreaTextField("UTA Comments", driver).typeInToArea(areaPlan.getuTAComments());
        new AreaTextField("Discharge Plan Notes/Comments", driver).typeInToArea(areaPlan.getDischargePlanNotesComments());
    }
}
