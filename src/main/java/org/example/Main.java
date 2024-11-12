package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome( int number ) {
        int orjinalNumber = number;
        int tersNumber = 0;
        number = Math.abs(number);

        while (number >0) {
            int sonHane = number % 10;
            tersNumber = tersNumber *10 + sonHane;
            number = number / 10;
        }

        if ((orjinalNumber==tersNumber) || (orjinalNumber==-tersNumber)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPerfectNumber( int number ) {
            if (number < 0) {
                return false;
            }
            int toplam = 0;
            for (int i = 1; i<number; i++) {
                if (number%i==0) {
                    toplam+=i;
                }
            }
            if (toplam==number) {
                return true;
            }
            return false;
    }

    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }

        String result = "";
        String numberStr = Integer.toString(number);

        for (int i = 0; i < numberStr.length(); i++) {
            char digitChar = numberStr.charAt(i);

            switch (digitChar) {
                case '0':
                    result += "Zero";
                    break;
                case '1':
                    result += "One";
                    break;
                case '2':
                    result += "Two";
                    break;
                case '3':
                    result += "Three";
                    break;
                case '4':
                    result += "Four";
                    break;
                case '5':
                    result += "Five";
                    break;
                case '6':
                    result += "Six";
                    break;
                case '7':
                    result += "Seven";
                    break;
                case '8':
                    result += "Eight";
                    break;
                case '9':
                    result += "Nine";
                    break;
            }

            // Son karakter dışındakilere boşluk ekle
            if (i < numberStr.length() - 1) {
                result += " ";
            }
        }

        return result;
    }
}






















