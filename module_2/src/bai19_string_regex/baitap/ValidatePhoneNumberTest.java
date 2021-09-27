package bai19_string_regex.baitap;

public class ValidatePhoneNumberTest {
    public static void main(String[] args) {
        String phone1 ="09-0234567895";
        String phone2 ="09-123456789";
        String phone3 ="09-03456789";
        System.out.println(ValidatePhoneNumber.validate(phone1));
        System.out.println(ValidatePhoneNumber.validate(phone2));
        System.out.println(ValidatePhoneNumber.validate(phone3));
    }
}
