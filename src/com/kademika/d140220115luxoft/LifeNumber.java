package com.kademika.d140220115luxoft;

public class LifeNumber {

    public static void main(String[] args) {

        String date = "17.03.1984";
        date = date.replace(".", ""); // 17031984

        int summa = summiruemChisla(date);

        while (summa > 9) {
            summa = summiruemChisla(String.valueOf(summa));
        }

        System.out.println(summa);


    }

    public static int summiruemChisla(String dateString) {

        int summa = 0;
        int i = 0;

        while (i < dateString.length()) {
            summa += charToInt(dateString.charAt(i));
            i += 1;
        }

        return summa;

    }

    public static int charToInt(char ch) {

        String validChars = "0123456789";

        if (validChars.indexOf(ch) >= 0) {
            String numberStr = String.valueOf(ch);
            int number = Integer.parseInt(numberStr);

            return number;
        }

        return 0;
    }
}
