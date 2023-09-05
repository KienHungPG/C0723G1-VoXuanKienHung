package ss1_introduction_java.baitap;

import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số của bạn (0-999) : ");
        int number = scanner.nextInt();

        if (number < 10) {
            switch (number) {
                case 0 -> System.out.println("zero");
                case 1 -> System.out.println("one");
                case 2 -> System.out.println("two");
                case 3 -> System.out.println("three");
                case 4 -> System.out.println("four");
                case 5 -> System.out.println("five");
                case 6 -> System.out.println("six");
                case 7 -> System.out.println("seven");
                case 8 -> System.out.println("eight");
                case 9 -> System.out.println("nine");
                default -> System.out.println("out of ability");
            }
        } else if (number < 20) {
            switch (number) {
                case 10 -> System.out.println("ten");
                case 11 -> System.out.println("eleven");
                case 12 -> System.out.println("twelve");
                case 13 -> System.out.println("thirteen");
                case 14 -> System.out.println("fourteen");
                case 15 -> System.out.println("fifteen");
                case 16 -> System.out.println("sixteen");
                case 17 -> System.out.println("seventeen");
                case 18 -> System.out.println("eighteen");
                case 19 -> System.out.println("nineteen");
            }
        } else if (number < 100) {
            int tens = number / 10;
            int ones = number % 10;
            String tensString = "";
            String onesString = "";

            switch (tens) {
                case 2 -> tensString = "twenty";
                case 3 -> tensString = "thirty";
                case 4 -> tensString = "forty";
                case 5 -> tensString = "fifty";
                case 6 -> tensString = "sixty";
                case 7 -> tensString = "seventy";
                case 8 -> tensString = "eighty";
                case 9 -> tensString = "ninety";
            }

            switch (ones) {
                case 1 -> onesString = "one";
                case 2 -> onesString = "two";
                case 3 -> onesString = "three";
                case 4 -> onesString = "four";
                case 5 -> onesString = "five";
                case 6 -> onesString = "six";
                case 7 -> onesString = "seven";
                case 8 -> onesString = "eight";
                case 9 -> onesString = "nine";
            }

            System.out.println(tensString + " " + onesString);
        } else if (number < 1000) {
            int hundreds = number / 100;
            int remainingNumber = number % 100;
            String hundredsString = switch (hundreds) {
                case 1 -> "one hundred";
                case 2 -> "two hundred";
                case 3 -> "three hundred";
                case 4 -> "four hundred";
                case 5 -> "five hundred";
                case 6 -> "six hundred";
                case 7 -> "seven hundred";
                case 8 -> "eight hundred";
                case 9 -> "nine hundred";
                default -> "";
            };

            if (remainingNumber < 10) {
                String onesString = switch (remainingNumber) {
                    case 1 -> "one";
                    case 2 -> "two";
                    case 3 -> "three";
                    case 4 -> "four";
                    case 5 -> "five";
                    case 6 -> "six";
                    case 7 -> "seven";
                    case 8 -> "eight";
                    case 9 -> "nine";
                    default -> "";
                };
                System.out.println(hundredsString + " and " + onesString);
            } else if (remainingNumber < 20) {
                String teensString = switch (remainingNumber) {
                    case 10 -> "ten";
                    case 11 -> "eleven";
                    case 12 -> "twelve";
                    case 13 -> "thirteen";
                    case 14 -> "fourteen";
                    case 15 -> "fifteen";
                    case 16 -> "sixteen";
                    case 17 -> "seventeen";
                    case 18 -> "eighteen";
                    case 19 -> "nineteen";
                    default -> "";
                };
                System.out.println(hundredsString + " and " + teensString);
            } else {
                int tens = remainingNumber / 10;
                int ones = remainingNumber % 10;
                String tensString = "";
                String onesString = "";

                switch (tens) {
                    case 2 -> tensString = "twenty";
                    case 3 -> tensString = "thirty";
                    case 4 -> tensString = "forty";
                    case 5 -> tensString = "fifty";
                    case 6 -> tensString = "sixty";
                    case 7 -> tensString = "seventy";
                    case 8 -> tensString = "eighty";
                    case 9 -> tensString = "ninety";
                }

                switch (ones) {
                    case 1 -> onesString = "one";
                    case 2 -> onesString = "two";
                    case 3 -> onesString = "three";
                    case 4 -> onesString = "four";
                    case 5 -> onesString = "five";
                    case 6 -> onesString = "six";
                    case 7 -> onesString = "seven";
                    case 8 -> onesString = "eight";
                    case 9 -> onesString = "nine";
                }

                System.out.println(hundredsString + " and " + tensString + " " + onesString);
            }
        }
    }
}
