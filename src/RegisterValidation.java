public class RegisterValidation {



    public void register (){
        ElementsLocations element = new ElementsLocations();
        Functions method = new Functions();
        element.getSubmitButton().click();
        Boolean message = element.getMessage().isDisplayed();
        method.happyPathFunctionality(message);
    }
}
