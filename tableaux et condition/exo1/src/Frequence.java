public class Frequence {
  public static void main (String [] args) {
    int [] liste = {0, 1, 0, 2, 1, 0};
    int [] compteur = new int [3];

    for (int i = 0; i < liste.length; i++) {
        int valeur = liste[i];
        if (valeur >= 0 && valeur < compteur.length) {
            compteur[valeur]++;
        }
    }

    System.out.println("Fréquences : ");
    for (int i = 0; i < compteur.length; i++) {
        System.out.println(i + " : " + compteur[i]);
    }
  }
}
