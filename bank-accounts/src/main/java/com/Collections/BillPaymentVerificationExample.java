package com.Collections;

import java.util.regex.Pattern;

public class BillPaymentVerificationExample {
    private static final Pattern VALID_BILL_PATTERN = Pattern.compile("\\d{4}-\\d{4}-\\d{4}");

    public static void main(String[] args) {
        System.out.println(verifyBillPayment("1234-5678-9012")); // should return true
        System.out.println(verifyBillPayment("1234-567-9012")); // should return false
    }

    public static boolean verifyBillPayment(String billNumber) {
        if (billNumber == null || billNumber.trim().isEmpty()) {
            return false;
        }

        if (!VALID_BILL_PATTERN.matcher(billNumber).matches()) {
            return false;
        }

        String[] billNumberParts = billNumber.split("-");
        for (String part : billNumberParts) {
            if (part.length() != 4) {
                return false;
            }
        }

        return true;
    }
}
