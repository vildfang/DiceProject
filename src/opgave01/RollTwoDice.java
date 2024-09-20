package opgave01;

import java.util.Scanner;

public class RollTwoDice {
    private static int rollCount = 0;
    private static int summenAfKAst = 0;
    private static int SammeTal=0;
    private static int højesteTal=0;

    public static void main(String[] args) {

        System.out.println("Velkommen til spillet, rul en terning.");
        printRules();
        System.out.println();

        playOneDie();

        System.out.println();
        System.out.println("Tak for at spille, rul en terning.");
    }

    private static void printRules() {
        System.out.println("=====================================================");
        System.out.println("Regler for rul en terning");
        System.out.println("Spilleren ruller en terning, så længe man lyster.");
        System.out.println("=====================================================");
    }

    private static void playOneDie() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Rul en terning? ('ja/nej') ");
        String answer = scanner.nextLine();
        while (!answer.equals("nej")) {
            int[] terninger = rollDice();
            System.out.println("Du rullede: " + terninger[0]+ " og " + terninger[1]);
            System.out.println();

            updateStatistics(terninger);

            System.out.println("Rul en terning? ('ja/nej')" );
            answer = scanner.nextLine();
        }

        printStatistics();
        scanner.close();
    }

    private static int[] rollDice() {
        int[] terniger = new int[2];
        for (int i=0; i< terniger.length;i++){
            terniger[i] = (int) (Math.random() * 6) + 1;



        }
        return terniger;
    }

    private static void updateStatistics(int[]terninger) {
        summenAfKAst += terninger[0]+terninger[1];


        if (terninger[0]==terninger[1]){
            SammeTal++;

        }
        if(højesteTal  <  terninger[0]+terninger[1]){
            højesteTal = terninger[0]+terninger[1];
        }


        rollCount++;


    }

    private static void printStatistics() {
        System.out.println("\nResults:");
        System.out.println("-------");
        System.out.printf("%17s %4d\n", "Antal rul:", rollCount);
        int sumAfKast = summenAfKAst;
        System.out.println("Totale sum af alle kast = " + sumAfKast);
        int sammetal = SammeTal;
        System.out.println("Antal gange terningerne var det samme =  " + sammetal);
        int højestetal = højesteTal;
        System.out.println("Det højeste tal er " + højestetal);
    }

}


