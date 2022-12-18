package functionalInterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main (String[] args) {
        System.out.println("Without Predicate");
        System.out.println(isPhoneNumberValid("0700000000"));
        System.out.println(isPhoneNumberValid("0800000000"));

        System.out.println("With Predicate");
        System.out.println(isPhoneNumberValidPredicate.test("0700000000"));
        System.out.println(isPhoneNumberValidPredicate.test("0800000000"));
        //chaining multiple predicates
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("0700030000"));
        System.out.println(isPhoneNumberValidPredicate.or(containsNumber3).test("0700000000"));
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 10;

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 10;
    }

    static Predicate<String> containsNumber3 = phoneNumber ->  phoneNumber.contains("3");
}
