package models;

public class CarePlan {
    public String getHealthDirectiveOther() {
        return healthDirectiveOther;
    }

    public void setHealthDirectiveOther(String healthDirectiveOther) {
        this.healthDirectiveOther = healthDirectiveOther;
    }

    String healthDirectiveOther;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String location;

    public String getToiletScheduleDescription() {
        return toiletScheduleDescription;
    }

    public void setToiletScheduleDescription(String toiletScheduleDescription) {
        this.toiletScheduleDescription = toiletScheduleDescription;
    }

    public String toiletScheduleDescription;

    public String bathShowerAssistProvidedByName;

    public String preparingMealsProblemManagingTips;

    public String getBathShowerAssistProvidedByName() {
        return bathShowerAssistProvidedByName;
    }

    public void setBathShowerAssistProvidedByName(String bathShowerAssistProvidedByName) {
        this.bathShowerAssistProvidedByName = bathShowerAssistProvidedByName;
    }

    public String getPreparingMealsProblemManagingTips() {
        return preparingMealsProblemManagingTips;
    }

    public void setPreparingMealsProblemManagingTips(String preparingMealsProblemManagingTips) {
        this.preparingMealsProblemManagingTips = preparingMealsProblemManagingTips;
    }
}
