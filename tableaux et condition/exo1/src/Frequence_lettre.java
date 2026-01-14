import java.util.*;


public class Frequence_lettre {
      
    public static void main(String [] args) {
            Scanner sc = new Scanner(System.in);
              char [] alaphabet = new char [26];
              int [] tabfrequence = new int[26];
              String phrase = "Ses nombreuses pattes, lamentablement grêles par comparaison avec la corpulence qu'il avait par ailleurs,; grouillaient désespérément sous ses yeux ";


              do {
                    System.out.println("Veuillez saisir une phrase d'au moins 120 caractere !");
                    phrase = sc.nextLine();

              } while (phrase.length() < 120);
              
                 

              char lettre = 'a';
                  for (int i = 0; i < tabfrequence.length; i++) {
                    alaphabet[i] = lettre;
                    lettre++;
                  }
                  
                  GestionTab.afficherTableau(alphabet);  

                  for (int i = 0; i < tabfrequence.length; i++) {
                    tabfrequence[i]=0;
                  }

                GestionTab.afficherTableau(tabfrequence);




    sc.close();
    }
}
