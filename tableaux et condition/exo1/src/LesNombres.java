import java.util.Scanner;


public class LesNombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age;
        int anneesManquantes;
        
        System.out.println("Quel est ton age ?");
        age =sc.nextInt();

        anneesManquantes = 18 - age;

        System.out.println("il te manque "  + anneesManquantes + " années pour tes 18 ans.");

        sc.close();
    }
    
}
