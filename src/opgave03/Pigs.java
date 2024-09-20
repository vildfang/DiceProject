package opgave03;

import java.util.Scanner;

public class Pigs {
    private static int player01total = 0;
    private static int playero2total = 0;

    public static void main(String[] args) {
        printRules();
        System.out.println("Hvem spiller for spiller 1 tryk 1 for spiller 2 tryk 2. ");
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        if (answer==1){

        }

    }

    public static int roll() {
        return (int) (Math.random() * 6 + 1);
    }


    public static void Player01() {
        Scanner playero1 = new Scanner(System.in);
        System.out.print("Rul en terning? ('ja/nej') ");
        String answer = playero1.nextLine();
        while (!answer.equals("nej")) {

            System.out.print("Rul en terning? ('ja/nej') ");
            if (answer=="ja"){

            }
            answer = playero1.nextLine();
        }

        roll();


    }

    public static void player02() {


    }

    private static void printRules() {
        System.out.println("=====================================================");
        System.out.println("Regler for Pigs");
        System.out.println("spilleren ruller en terning indtil an slår et eller beslutter sig for at stoppe" +
                "\n hvis han slår 1 får han ingen point, hvis han beslutter sig for at stoppe får han summen af sinde slag." +
                "\n først til 100 vinder.");
        System.out.println("=====================================================");
    }

}




    


