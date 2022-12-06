import java.util.Scanner;

public class String_edit {
static Scanner scanner = new Scanner(System.in);

    static String Quiz() {


        System.out.println("Guess the animal that lives in a swamp and has green color");

        String b = "Congratulations, you have guessed the correct answer";
        String c = "Sadly, but you are wrong";

        String S = scanner.next();
        if (S.equals("Frog")) {
            return b;
        } else return c;


    }

    }



