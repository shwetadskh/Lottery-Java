package com.tts;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Please Enter Your Name: ");
        String userName = input.nextLine();
        String userInput = "";
        String c = "";

        do{
            System.out.println("Hello " +  userName);
            System.out.println("Enter the Pet name " );
            String petName = input.nextLine();
            String LowerpetName = petName.toLowerCase();
            String UpperpetName = petName.toUpperCase();
            char ch1 = LowerpetName.charAt(2);

            System.out.println("Enter the Pet age ");
            int petAge = input.nextInt();

            System.out.println("What is your lucky no ");
            int luckyNum = input.nextInt();

            System.out.println("What is your Jersy no ");
            int jersyNum = input.nextInt();

            System.out.println("do they have a favorite quarterback?  if so what is their jersey number?  ");
            int quartBack = input.nextInt();

            System.out.println("what is two-digit model year of their car? ");
            int carModelYear = input.nextInt();

            System.out.println("enter a random number between 1 and 50. ");
            int randomNum = input.nextInt();

            System.out.println("what is the first name of the their favorite actor or actress? ");
            String faveAct = input.next();
            input.nextLine() ;

            String LowerfaveAct = faveAct.toLowerCase();
            String UpperfaveAct = faveAct.toUpperCase();

            char chFirst = LowerfaveAct.charAt(0);
            char chLast = LowerfaveAct.charAt(LowerfaveAct.length() - 1);

            // generate the first number
            // find the 3rd letter of their favorite pet.  convert that character value to an integer value.
            int firstNum = (int) ch1;
            if (firstNum > 65) {
                firstNum = firstNum - 65;
            }

            // Generate the second number
            // use the two digit model year of their car and add their lucky number to it.
            int secondNum = carModelYear + luckyNum;
            if (secondNum > 65) {
                secondNum = secondNum - 65;
            }

            // Generate the third number
            // convert the first letter of their favorite actor/actress to an integer and use that value.
            int thirdNum = (int) chFirst;
            // random numbers between 1 and 65
            if (thirdNum > 65) {
                thirdNum = thirdNum - 65;
            }

            // Generate the fourth number
            // convert the last letter of their favorite actor/actress to an integer and use that value.
            int fourthNum = (int) chLast;
            if (fourthNum > 65) {
                fourthNum = fourthNum - 65;
            }
            // Generate the fifth number
            // use the age of their favorite pet + their car model year.
            int fifthNum = petAge + carModelYear;
            if (fifthNum > 65) {
                fifthNum = fifthNum - 65;
            }

            // Generate the magic ball
            // magic ball number, multiplied by one of the random numbers
            int magicBallNum = quartBack * randomNum;
            // "magic ball" number greater than 75 then subtract 75 from the value and that value is now the "magic ball" number.
            if (magicBallNum > 75) {
                magicBallNum = magicBallNum - 75;
            }


            System.out.println("Lottery numbers: " + firstNum + " , " + secondNum + " , " + thirdNum + " , " + fourthNum + " , " +                      fifthNum + " Magic ball:  " + magicBallNum);
            System.out.println("Hello " + userName );
            System.out.println("Do you want to continue y or n");
            c = input.nextLine();
            System.out.println(c);

        } while(c.equalsIgnoreCase("y"));

    }
}