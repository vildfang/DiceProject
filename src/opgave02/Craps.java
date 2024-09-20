package opgave02;

import java.security.KeyStore;

public class Craps {

    public static void main(String[] args) {
        playCrabs();
    }

    public static void playCrabs() {
        int point = (int) (Math.random() * 11) + 2;

        if (point == 7 || point == 11) {
            System.out.println(point + " Winner");
        } else if (point == 2 || point == 3 || point == 12) {
            System.out.println(point + " Loser");

        } else {
            System.out.println("Dit point er " + point);
            Boolean resultat = rollForPoint(point);
            if (resultat){
                System.out.println("Winner du slog " + point);
            }else{
                System.out.println("Loser du slog 7");
            }
        }



    }

    public static boolean rollForPoint(int point) {
        int terning = point;
        do {
            int roll = (int) (Math.random() * 11) + 2;

            if (roll == terning) {
                return true;

            } else if (roll==7) {
                return false;
            }
            System.out.println("du slog " + roll);

        }while (true);
    }
}


