import java.util.Scanner;

public class ModeProceduralLisible {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Veuillez saisir le capital à emprunter : ");
    double capital = sc.nextDouble();

    System.out.print("Veuillez saisir le taux d'intérêt annuel : ");
    double tauxMensuel = sc.nextDouble() / 1200;

    System.out.print(
      "Veuillez saisir la durée de remboursement (en années) : "
    );
    int nbMois = sc.nextInt() * 12;

    double rembmensuel = calculMensualite(capital, nbMois, tauxMensuel);

    System.out.printf(
      "Votre mensualité de remboursement sera de %.2f euros%n",
      rembmensuel
    );

    sc.close();
  }

  private static double calculMensualite(
    double capital,
    int nbMois,
    double tauxMensuel
  ) {
    double q = 1 - Math.pow(1 + tauxMensuel, -nbMois);
    return (capital * tauxMensuel) / q;
  }
}
