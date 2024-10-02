Når I genererer et slag med to terninger med

    int point = (int) (Math.random() * 11) + 2;

ændrer I på sansynlighederne. Ved djeres metode er der lige stor sansynlighed for at rulle 12 som at rulle 7. 
Med 

    ((int) (Math.random() * 6) + 1) + ((int) (Math.random() * 6) + 1)

er der større sansynlighed for at rulle 7 end 12.

---

Det ville også have været godt med en metode rollDice()

---

I roolForPoints() metoder laver I en unødvendig variable

        int terning = point;

I kan bruge parametervariablen point i stedet for terning.

---


