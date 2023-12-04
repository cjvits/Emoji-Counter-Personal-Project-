package main;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class EmojiFriendCounter {

    private final Scanner userInput = new Scanner(System.in);

    private final String[] emojiCount = new String[20];

    private final String[] emojiList = {"🧜‍♀️", "🦄", "👸🏾", "🐿️"};

    private int countCorrectAnswer;

    public static void main(String[] args) {
        EmojiFriendCounter e = new EmojiFriendCounter();
        int emojiChoice = e.ChooseCharacter();
        e.createCount(emojiChoice);
        e.checkCount(e.countCorrectAnswer);

    }
    private int ChooseCharacter() {

        System.out.println("What friend would you like to count? Press the number next to the friend!");
        System.out.println("1) " + "\uD83E\uDDDC");
        System.out.println("2) " + "\uD83E\uDD84");
        System.out.println("3) " + "\uD83D\uDC78");
        System.out.println("4) " + "\uD83D\uDC3F");

        return chooseUsersEmoji();


    }






    public int createCount(int emojiChoice) {
           for (int i = 0; i < emojiList.length - 1; i++) {
               emojiCount[i] = emojiList[emojiChoice - 1];

           }

           Random rand = new Random();
           int rand_int1 = rand.nextInt(20);
           countCorrectAnswer = rand_int1;


           for (int i = 0; i < countCorrectAnswer; i++) {
               System.out.print(emojiCount[0] + "   ");

           }
           System.out.println();

           return countCorrectAnswer;
    }

    public void checkCount(int countCorrectAnswer){
       System.out.println("How many friends do you count?");
        String answer = userInput.nextLine();
        int userAnswer = Integer.parseInt(answer);
        if (userAnswer == countCorrectAnswer) {
            System.out.println("Yay! Good job!");
        } else {
            System.out.println("Count again!");
        }
    }

    private int chooseUsersEmoji(){
        int usersAnswer;

        while (true) {
            try {
                String line = userInput.nextLine();
                usersAnswer = Integer.parseInt(line);
                if (usersAnswer <= 0 || usersAnswer > emojiList.length) {
                    System.out.println("Sorry, please enter a number between 1 and " + emojiList.length + ".");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Sorry, please enter a number between 1 and " + emojiList.length + ".");
            }
        }
        return usersAnswer;
    }

}


