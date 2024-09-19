//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {
    public static void main(String[] args) {
        int cardBoard = 34;
        int truck = 9;

        // Calcul du nombre total de trajets (on arrondit à l'entier supérieur) 4

        double totalTravel = Math.ceil((double) cardBoard / truck);
        System.out.println("Pour " + cardBoard + " cartons, il faut " + (int) totalTravel + " trajets");

        // Boucle pour savoir combien de cartons sont transportés à chaque trajet
        for (int i = 1; i <= totalTravel; i++) {
            // Si 34 est supérieur ou égal à 9 cartons capacité totale du camion
            if (cardBoard >= truck) {
                // on imprime "i" + nombre max de cartons pour simuler (en dur) les 3 premiers trajets
                System.out.println("Trajet " + i + ": " + truck + " cartons");

                // l'opération 34 - 9 permet d'enlever 9 cartons à chaque trajet si le total de cartons restant est supérieur à 9
                cardBoard -= truck;
            }
            // sinon (au dernier trajet cardBoard < truck) on imprime i + le nouveau cardBoard au dessus qui est décrémenté du totalTravel
            else {
                System.out.println("Trajet " + i + ": " + cardBoard + " cartons");
            }

        }
    }
}






