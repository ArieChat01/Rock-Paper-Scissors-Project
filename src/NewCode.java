import java.util.Arrays;
import java.util.Scanner;

public class NewCode {
    public static void main(String[] args) {

        int generatedNumber;
        boolean hope;

        Scanner user;
        user = new Scanner(System.in);
        String userAnswer;
        String[] option = {"cow", "bomb", "lake"};
        hope = true;

        while (hope) {

            generatedNumber = (int) (Math.random() * 3);
            System.out.println(option[generatedNumber]);

            System.out.println("Hi! Test!");

            for (int i = 0; i < option.length; i++) {
                userAnswer = user.nextLine();
                if(Arrays.asList(option).contains(userAnswer)){
                    System.out.println("MOOOOOO!");
                }
                if ("cow".equals(option)) {
                    System.out.println("I really hope this works! Cow drinks Lake!");
                    break;
                }
                if ("bomb".equals(option)){
                    System.out.println("Cow got blown up by the Bomb!");
                    break;
                }
                if ("lake".equals(option)){
                    System.out.println("Lake extinguishes Bomb;");
                    break;
                }
            }
            hope = false;
        }
    }
}



