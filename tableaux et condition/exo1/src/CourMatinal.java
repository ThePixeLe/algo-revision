import java.util.Scanner;


public class CourMatinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String prenom;

        System.out.println("quelle est ton prenom");
        prenom =sc.nextLine();

        System.out.println("Bonjour"  + prenom);


     sc.close();
    }
    
}
