Denne kodeblok

                System.out.println("Spiller 1, det er din tur");
                System.out.println("Din totale score er " + player01total);
                SpilEnRunde(); // Spiller en runde
                player01total += rundetotal; // Opdaterer spiller 1's total
                CheckVinder(); // Tjekker om der er en vinder
                System.out.println("Din total er " + player01total);
                answer = 2; // Skift til spiller 2

Ligner meget denne

                System.out.println("Spiller 2, det er din tur");
                System.out.println("Din totale score er " + player02total);
                SpilEnRunde(); // Spiller en runde
                player02total += rundetotal; // Opdaterer spiller 2's total
                CheckVinder(); // Tjekker om der er en vinder
                System.out.println("Din total er " + player02total);
                answer = 1; // Skift til spiller 1

Overvej om man kunne flytte dele af dette ud i en metode med en parameter og dermed udgå duplikeret kode. 