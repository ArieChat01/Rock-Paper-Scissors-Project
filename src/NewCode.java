import java.util.Scanner;

public class NewCode {
    public static void main(String[] args) {

        int generatedNumber;
        int numberOne, numberTwo, numberThree;
        boolean hope;
        generatedNumber = (int) (Math.random() * 3);
        numberOne = (int) (Math.random() * 3);
        numberTwo = (int) (Math.random() * 3);
        numberThree = (int) (Math.random() * 3);


        Scanner user;
        user = new Scanner(System.in);
        String userAnswer;
        String cowOption;
        String bombOption;
        String lakeOption;
        cowOption = "cow";
        bombOption = "bomb";
        lakeOption = "lake";

        hope = true;

        String[] option = {cowOption, bombOption, lakeOption};
        option[numberOne] = cowOption;
        option[numberTwo] = bombOption;
        option[numberThree] = lakeOption;
        System.out.println(generatedNumber);

        while (hope) {
            System.out.println("Hi! Test!");
            userAnswer = user.nextLine();
            for (int i = generatedNumber; i < option.length; i++) {
                System.out.println(option[i]);
                break;
            }
            if (userAnswer.equals("lake") && option.equals(cowOption)) {
                System.out.println("I really hope this works! Cow drinks Lake!");
            } else if (userAnswer.equals("cow") && option.equals(bombOption)) {
                System.out.println("Cow got blown up by the Bomb!");
            } else if (userAnswer.equals("bomb") && option.equals(lakeOption)) {
                System.out.println("Lake extinguishes Bomb;");
            }
        }
    }
}




            /*String [] options = {cowOption, bombOption, lakeOption};
         int help = options.length;
         for(int i = generatedNumber; i<help;i++) {
             System.out.println("I hope this works " + options[i]);
             */


