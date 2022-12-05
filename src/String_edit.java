import java.util.Scanner;

public class String_edit {
static Scanner scanner = new Scanner(System.in);

    static String Quiz() {


        System.out.println("Guess the animal that lives in a swamp and has green color");
//        System.out.println("Press 1 for Lion");
//        System.out.println("Press 2 for Frog");
//        System.out.println("Press 3 for Horse");

//        String a = "Choose the correct number";
        String b = "Congratulations, you have guessed the correct answer";
        String c = "Sadly, but you are wrong";

        String S = scanner.next();
        if (S.equals("Frog")) {
            return b;
        } else return c;


    }

    }



