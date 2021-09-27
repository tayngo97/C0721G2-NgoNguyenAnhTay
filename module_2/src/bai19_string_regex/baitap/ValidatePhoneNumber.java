package bai19_string_regex.baitap;

import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    private static final String REGEX_PHONENUM = "^[0-9]{2}[-](0[0-9]{9})";

    public ValidatePhoneNumber() {
    }

    public static boolean validate(String phone) {
        boolean check;
        return check = Pattern.matches(REGEX_PHONENUM, phone);
    }
}
