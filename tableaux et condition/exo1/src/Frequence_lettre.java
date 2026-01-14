import java.util.*;


public class Frequence_lettre {
      
    public static void main(String [] args) {
            Scanner sc = new Scanner(System.in);
              char [] alaphabet = new char [26];
              int [] tabfrequence = new int[26];
              String phrase = "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet. Quisque rutrum. Aenean imperdiet. Etiam ultricies nisi vel augue. Curabitur ullamcorper ultricies ";


              do {
                    System.out.println("Veuillez saisir une phrase d'au moins 120 caractere !");
                    phrase = sc.nextLine();

              } while (phrase.length() < 120);


              char lettre = 'a';
                  for (int i = 0; i < tabfrequence.length; i++) {
                    alaphabet[i] = lettre;
                    lettre++;
                  }
                  
                  for (int i = 0; i < tabfrequence.length; i++) {
                    tabfrequence[i]=0;
                  }

                GestionTab.afficherTableau(tabfrequence);




    sc.close();
    }
}
