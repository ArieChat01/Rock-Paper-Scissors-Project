import java.util.Scanner;

public class NewCode {
    public static void main(String[] args) {

        int generatedNumber;
        boolean playAgain;

        Scanner user;
        user = new Scanner(System.in);

        String userAnswer;
        int playerUser = 0;
        int playerComputer = 0;
        int oddScore = 3;
        int evenScore = 2;


        String cowOption, bombOption, lakeOption;
        cowOption = "cow";
        bombOption = "bomb";
        lakeOption = "lake";
        String[] option = {cowOption, bombOption, lakeOption};
        playAgain = true;

        System.out.println("Hello and welcome to cow, lake, bomb. This british version of rock papers scissors is fun for\n" +
                "the whole family. In this rendition, cow drinks lake but is blown up by the bomb. The bomb kills the cow, but\n" +
                "is extinguished by the lake. Lastly the lake can be drank by the cow, but cannot put out the bomb's fuse.");
        System.out.println("Are you ready?");
        System.out.println("Now enter cow, lake or bomb.");
        System.out.println("Best " + evenScore + " out of " + oddScore);

        while (playAgain) {

             while (playerComputer!=evenScore&&playerUser!=evenScore){

                    generatedNumber = (int) (Math.random() * 3);

                    userAnswer = user.nextLine();
                    if (userAnswer.equals(cowOption) && option[generatedNumber].equals(bombOption)) {
                        System.out.println("Your cow has been blown up. :-p");
                        System.out.println("" +
                                "   _.-^^---....,,--       \n" +
                                " _--                  --_  \n" +
                                "<                        >)\n" +
                                "|                         | \n" +
                                " \\._                   _./  \n" +
                                "    ```--. . , ; .--'''       \n" +
                                "          | |   |             \n" +
                                "       .-=||  | |=-.   \n" +
                                "       `-=#$%&%$#=-'   \n" +
                                "          | ;  :|     \n" +
                                " _____.,-#%&$@%#&#~,._____");
                        playerComputer++;
                    } else if (userAnswer.equals(cowOption) && option[generatedNumber].equals(lakeOption)) {
                        System.out.println("Your cow drank my lake! >:-(");
                        System.out.println("" +
                                "          __n__n__\n" +
                                "    .------`-\\00/-'\n" +
                                "   /  ##  ## (oo)\n" +
                                "  / \\## __   ./\n" +
                                "     |//YY \\|/\n" +
                                "     |||   |||");
                        playerUser++;
                    }
                    /////
                    else if (userAnswer.equals(bombOption) && option[generatedNumber].equals(lakeOption)) {
                        System.out.println("Your bomb has been extinguished.:-p");
                        System.out.println(" _    _    _    _    _    _    _    _    _    _    _\n" +
                                " \\\"-._\\\"-._\\\"-._\\\"-._\\\"-._\\\"-._\\\"-._\\\"-._\\\"-._\\\"-._\\\"-._\n" +
                                " \"    \"    \"    \"    \"    \"    \"    \"    \"    \"    \"\n" +
                                "\n" +
                                " _    _    _    _    _    _    _    _    _    _    _\n" +
                                " \\\"-._\\\"-._\\\"-._\\\"-._\\\"-._\\\"-._\\\"-._\\\"-._\\\"-._\\\"-._\\\"-._\n" +
                                " \"    \"    \"    \"    \"    \"    \"    \"    \"    \"    \"\n" +
                                "\n" +
                                " _    _    _    _    _    _    _    _    _    _    _\n" +
                                " \\\"-._\\\"-._\\\"-._\\\"-._\\\"-._\\\"-._\\\"-._\\\"-._\\\"-._\\\"-._\\\"-._\n" +
                                " \"    \"    \"    \"    \"    \"    \"    \"    \"    \"    \"\n");
                        playerComputer++;
                    } else if (userAnswer.equals(bombOption) && option[generatedNumber].equals(cowOption)) {
                        System.out.println("You blew up my cow. >:-(");
                        System.out.println("" +
                                "    _.-^^---....,,--       \n" +
                                " _--                  --_  \n" +
                                "<                        >)\n" +
                                "|                         | \n" +
                                " \\._                   _./  \n" +
                                "    ```--. . , ; .--'''       \n" +
                                "          | |   |             \n" +
                                "       .-=||  | |=-.   \n" +
                                "       `-=#$%&%$#=-'   \n" +
                                "          | ;  :|     \n" +
                                " _____.,-#%&$@%#&#~,._____");
                        playerUser++;
                    }
                    /////
                    else if (userAnswer.equals(lakeOption) && option[generatedNumber].equals(cowOption)) {
                        System.out.println("My cow drank your lake. :-p");
                        System.out.println(" " +
                                "          __n__n__\n" +
                                "    .------`-\\00/-'\n" +
                                "   /  ##  ## (oo)\n" +
                                "  / \\## __   ./\n" +
                                "     |//YY \\|/\n" +
                                "     |||   |||");
                        playerComputer++;
                    } else if (userAnswer.equals(lakeOption) && option[generatedNumber].equals(bombOption)) {
                        System.out.println("Your lake extinguished my bomb. >:-(");
                        System.out.println(" _    _    _    _    _    _    _    _    _    _    _\n" +
                                " \\\"-._\\\"-._\\\"-._\\\"-._\\\"-._\\\"-._\\\"-._\\\"-._\\\"-._\\\"-._\\\"-._\n" +
                                " \"    \"    \"    \"    \"    \"    \"    \"    \"    \"    \"\n" +
                                "\n" +
                                " _    _    _    _    _    _    _    _    _    _    _\n" +
                                " \\\"-._\\\"-._\\\"-._\\\"-._\\\"-._\\\"-._\\\"-._\\\"-._\\\"-._\\\"-._\\\"-._\n" +
                                " \"    \"    \"    \"    \"    \"    \"    \"    \"    \"    \"\n" +
                                "\n" +
                                " _    _    _    _    _    _    _    _    _    _    _\n" +
                                " \\\"-._\\\"-._\\\"-._\\\"-._\\\"-._\\\"-._\\\"-._\\\"-._\\\"-._\\\"-._\\\"-._\n" +
                                " \"    \"    \"    \"    \"    \"    \"    \"    \"    \"    \"\n");
                        playerUser++;
                    }
                    /////
                    else if (userAnswer.equals(option[generatedNumber])) {
                        System.out.println("Aha. It is a tie!");
                    }
                    System.out.println("\nThe score is...\nComputer: " + playerComputer + " User: " + playerUser + "\n");
                }
                if (playerComputer == evenScore) {
                    System.out.println("I win!!!");
                }
                else if (playerUser == evenScore) {
                    System.out.println("My systems must be malfunctioning. It seems you have won.");
                }

                System.out.println("Want to play again?\nEnter \"yes\" or \"no\"");
                userAnswer = user.nextLine();
                if (userAnswer.equals("no")) {
                    System.out.println("GAME OVER!\nGOODBYE!");
                    playAgain = false;
                }
                if (userAnswer.equals("yes")) {
                    oddScore+= 2;
                    evenScore+= 2;
                    System.out.println("Okay, let us see who will win this time?");
                    System.out.println("Best " + evenScore + " out of " + oddScore);
                    playAgain = true;
                }
            }
        }
    }

