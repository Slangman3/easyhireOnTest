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
        new TextField("Performed By Others Name",driver).typeText("abracadabra");
        new TextField("Light Housework Problem Managing Tips",driver).typeText("abracadabra");
        new TextField("Caregiver/Family Transports Name",driver).typeText("abracadabra");
        new TextField("Finances Performed By Others Name",driver).typeText("abracadabra");
        new TextField("Shopping Problem Managing Tips",driver).typeText("abracadabra");
        new TextField("Equipment Used Other Tips",driver).typeText("abracadabra");
        new TextField("Pain Location Comment",driver).typeText("abracadabra");
        new TextField("Pain Source Comment",driver).typeText("abracadabra");
        new TextField("Pain Triggerd By Comment",driver).typeText("abracadabra");
        new TextField("Wound Care By",driver).typeText("abracadabra");
        new TextField("Other Treatments Name",driver).typeText("abracadabra");
        new TextField("Injections By",driver).typeText("abracadabra");
        new TextField("Other Equipment Name",driver).typeText("abracadabra");
        new TextField("Equipment Cared For By",driver).typeText("abracadabra");
    }
}
