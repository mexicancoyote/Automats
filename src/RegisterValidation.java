public class RegisterValidation {
    public void register (){
        Registration element = new Registration();
        Functions generator = new Functions();

        element.getSubmitButton().click();

        String message = element.getMessage().getText();

        generator.happyPathFunctionality(message);
    }
}
