package bai19_string_regex.baitap;

public class ValidateClassNameText {
    public static void main(String[] args) {
        String a = "C1234H";
        String a1 = "C1234I";
        String a2 = "C123G";
        System.out.println(ValidateClassName.validate(a));
        System.out.println(ValidateClassName.validate(a1));
        System.out.println(ValidateClassName.validate(a2));
    }
}
