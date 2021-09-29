package services.exception_validate;

public class IllegalAgeInputException extends Exception {
    public IllegalAgeInputException(){
        System.err.println("The age not allow under 18 and exceed 100");
    }
}
