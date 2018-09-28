import java.util.Scanner;

public class NewCode {
    public static void main(String[] args) {


        Scanner user;
        user = new Scanner(System.in);
        String userAnswer;

        String cowOption = "cow";
        String LakeOption = "lake";
        String bombOption = "bomb";

            String[] options =  new String [15];
            String [][] option = {
                    {"cow", "lake", "bomb"},
            };
            for (int i = 0; i < options.length; i++) {
                for (int number = 0; number < option[i].length; number++) {
                    System.out.print(option[i][number] + " ");
                    System.out.println();
                }


            }
        }
    }
