// On importe Scanner
// Scanner permet de lire ce que l'utilisateur tape au clavier
import java.util.Scanner;

// Déclaration de la classe
// Le nom commence par une MAJUSCULE
public class ModeProceduralCorrection {

    // Point d’entrée du programme
    // Java commence toujours ici
    public static void main(String[] args) {

        // Création du Scanner
        // System.in = clavier
        Scanner sc = new Scanner(System.in);

        // Demande du capital à l'utilisateur
        // Exemple : 100000
        System.out.print("Veuillez saisir le capital à emprunter : ");

        // Lecture du capital
        // Le nombre est stocké dans la variable capital
        double capital = sc.nextDouble();

        // Demande du taux d'intérêt annuel
        // Exemple : 2.5
        System.out.print("Veuillez saisir le taux d'intérêt annuel : ");

        // Lecture du taux annuel
        // Conversion en taux mensuel
        // 12 mois et 100 pour le pourcentage
        double tauxMensuel = sc.nextDouble() / 1200;

        // Demande de la durée du prêt
        // En années
        System.out.print("Veuillez saisir la durée de remboursement (en années) : ");

        // Lecture de la durée
        // Conversion en mois
        int nbMois = sc.nextInt() * 12;

        // Appel de la méthode de calcul
        // On envoie : capital, nombre de mois, taux mensuel
        double mensualite = calculMensualite(capital, nbMois, tauxMensuel);

        // Affichage du résultat
        // %.2f = 2 chiffres après la virgule
        System.out.printf(
            "Votre mensualité de remboursement sera de %.2f euros%n",
            mensualite
        );

        // Fermeture du Scanner
        // Bonne pratique
        sc.close();
    }

    // Méthode de calcul de la mensualité
    // Elle reçoit :
    // - le capital
    // - le nombre de mois
    // - le taux mensuel
    private static double calculMensualite(double capital, int nbMois, double tauxMensuel) {

        // Calcul de Q
        // Math.pow = puissance
        // (1 + tauxMensuel) à la puissance -nbMois
        double q = 1 - Math.pow(1 + tauxMensuel, -nbMois);

        // Calcul final de la mensualité
        // Formule : capital × tauxMensuel / q
        return (capital * tauxMensuel) / q;
    }
}