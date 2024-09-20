package opgave02;

public class Craps {

    public static void main(String[] args) {
        playCrabs(); // Starter spillet
    }

    // Hovedlogik for spillet Craps
    public static void playCrabs() {
        // Ruller terningerne første gang, genererer et tal mellem 2 og 12
        int point = (int) (Math.random() * 11) + 2;

        // Hvis man slår 7 eller 11 på første kast, vinder man
        if (point == 7 || point == 11) {
            System.out.println(point + " Winner");
        }
        // Hvis man slår 2, 3 eller 12, taber man
        else if (point == 2 || point == 3 || point == 12) {
            System.out.println(point + " Loser");
        }
        // Hvis man slår noget andet, fortsætter spillet
        else {
            System.out.println("Dit point er " + point);
            // Spillet fortsætter, indtil man enten slår sit point igen (vinder) eller slår en 7'er (taber)
            Boolean resultat = rollForPoint(point);
            if (resultat) {
                System.out.println("Winner du slog " + point);
            } else {
                System.out.println("Loser du slog 7");
            }
        }
    }

    // Metode til at rulle terningerne indtil man slår pointet eller en 7'er
    public static boolean rollForPoint(int point) {
        // Fortsætter med at rulle terningerne
        int terning = point;
        do {
            int roll = (int) (Math.random() * 11) + 2; // Ruller en værdi mellem 2 og 12

            // Hvis man slår samme point som før, vinder man
            if (roll == terning) {
                return true;
            }
            // Hvis man slår en 7'er, taber man
            else if (roll == 7) {
                return false;
            }
            // Viser hvad spilleren slog, hvis spillet fortsætter
            System.out.println("du slog " + roll);
        } while (true); // Looper indtil man enten vinder eller taber
    }
}


