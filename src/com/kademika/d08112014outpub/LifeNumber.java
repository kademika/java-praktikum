package com.kademika.d08112014outpub;

public class LifeNumber {

    public static void main(String[] args) {

        String dateOfBirth = "8.11.2014";

        int summa = summaChisel(dateOfBirth);

        if (summa > 9) {
            String magicNumber = String.valueOf(summa);
            System.out.println("magic number is: " + magicNumber);
            summa = summaChisel(magicNumber);
        }

        System.out.println(summa);

    }

    public static int summaChisel(String str) {
        int summa = 0;

        int index = 0;

        while (index < str.length()) {
            summa += charToInt(str, index++);
        }

        return summa;
    }

    public static int charToInt(String date, int index) {

        char ch = date.charAt(index);
        String str = String.valueOf(ch);

        if (str.equals(".")) {
            return 0;
        }

        int number = Integer.parseInt(str);

        return number;
    }
}
