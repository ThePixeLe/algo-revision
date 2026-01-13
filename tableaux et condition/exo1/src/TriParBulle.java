import java.util.*;

public class TriParBulle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Combien de nombre voulez-vous génerer?");
         n = sc.nextInt();

        int[] _tableau = new int[n];
        
        TriParBulle.remplirTableau(_tableau);
        TriParBulle.afficherTableau(_tableau);


        System.out.println("Voici le tableau trié ");
        TriParBulle.trierTableau(_tableau);
        TriParBulle.afficherTableau(_tableau);

        sc.close();

    }
    public static void trierTableau(int[] _tableau) {
        int i, j, temp;
        boolean permut;

        for (i = 0; i < _tableau.length - 1; i++) {
            permut = false;
            for (j = 0; j < _tableau.length - 1 - i; j++) {
                if (_tableau[j] > _tableau[j + 1]) {
                    temp = _tableau[j];
                    _tableau[j] = _tableau[j + 1];
                    _tableau[j + 1] = temp;
                    permut = true;
                }
            }
            if (!permut) {
                break;
            }
        }

    }






    
}
