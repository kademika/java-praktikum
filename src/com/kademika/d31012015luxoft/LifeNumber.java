package com.kademika.d31012015luxoft;

public class LifeNumber {

    public static void main(String[] args) {


        String dateOfBirth = "02.01.1984";

        dateOfBirth = dateOfBirth.replace(".", "");

        int number = sumNumbersInString(dateOfBirth);

        if (String.valueOf(number).length() > 1) {

            number = sumNumbersInString(String.valueOf(number));
        }


        System.out.println(number);


    }

    static int sumNumbersInString(String date) {

        int summa = 0;

        int index = 0;

        while (index < date.length()) {
            summa = summa + getNumberAtIndex(date, index);
            index = index + 1;

        }


        return summa;
    }


    static int getNumberAtIndex(String date, int index) {


        char ch = date.charAt(index);
        return getNumber(ch);

    }

    static int getNumber(char ch) {
        return Integer.parseInt(String.valueOf(ch));
    }
}
