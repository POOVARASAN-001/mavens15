package com.example;

public class App {
    public boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        // Normalize strings by converting to lowercase and stripping spaces
        String cleanStr = str.replaceAll("\\s+", "").toLowerCase();
        String reversedStr = new StringBuilder(cleanStr).reverse().toString();
        return cleanStr.equals(reversedStr);
    }
}
