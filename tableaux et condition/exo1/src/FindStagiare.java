import java.util.Scanner;

public class FindStagiare {

    public static void main(String[] args){ 

     Scanner sc = new Scanner(System.in);

     String[] prenom= new String[12];

     prenom[0] = "jone";
     prenom[1] = "bily";
     prenom[2] = "rico";
     prenom[3] = "heloise";
     prenom[4] = "isabelle";
     prenom[5] = "goerge";
     prenom[6] = "luna";
     prenom[7] = "louis";
     prenom[8] = "ben";
     prenom[9] = "angelina";
     prenom[10] = "raph";
     prenom[11] = "gringo";


 System.out.println("Entré un numero de stagiare");
 int num = sc.nextInt();

 if (num >= 0 && num < prenom.length) {
    System.out.println("Le nom du stagiare est: " + prenom[num]);
    
 }
 else {
    System.out.println("Le numero de stagiare n'existe pas");
 }



 sc.close();
 }
}
