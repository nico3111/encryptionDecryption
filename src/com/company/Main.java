package com.company;

public class Main {

    public static void main(String[] args) {

        String test = "DASISTEINEGEHEIMNACHRICHT";
        String entcodiert = "VJEKTJECPOKGJGIGPKGVUKUCF";
        String fertigtest = "";

        String codiert = coder(test);
        System.out.println(codiert);
        fertigtest = entcoder(entcodiert);
        System.out.println(fertigtest);
    }

    private static String entcoder( String codiert) {
        String fertig = "";
        char ch;
        for (int i = 0; i < codiert.length(); i++) {
            int verschluesselung = codiert.charAt(i) - 2;
            ch = (char) verschluesselung;

            fertig = ch + fertig;
        }
        return fertig;
    }

    private static String coder(String test) {
        String fertig = "";
        char ch;
        for (int i = 0; i < test.length(); i++) {
            int verschluesselung = test.charAt(i) + 2;
            ch = (char) verschluesselung;
            fertig = ch + fertig;
        }
        return fertig;
    }


}
