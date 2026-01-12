public class TriParSelection {

// Méthode pour trier un tableau
public static void triSelection(int[] tableau) {
int n = tableau.length;

// 🔄 Boucle principale : pour chaque position i
for (int i = 0; i < n - 1; i++) {

// 🎯 On cherche le plus petit élément à partir de i
int minIndex = i;

// 🔍 De i+1 à la fin, on cherche le minimum
for (int j = i + 1; j < n; j++) {
if (tableau[j] < tableau[minIndex]) {
minIndex = j; // Nouveau minimum trouvé !
}
}

// 🔁 Échanger tableau[i] avec tableau[minIndex]
int temp = tableau[i];
tableau[i] = tableau[minIndex];
tableau[minIndex] = temp;
}
}

// 🖨️ Méthode pour afficher le tableau
public static void afficherTableau(int[] tableau) {
for (int i = 0; i < tableau.length; i++) {
System.out.print(tableau[i] + " ");
}
System.out.println();
}

// 🚀 Programme principal
public static void main(String[] args) {
int[] nombres = {7, 3, 9, 1, 4};

System.out.println("Avant tri :");
afficherTableau(nombres);

triSelection(nombres);

System.out.println("Après tri :");
afficherTableau(nombres);
}
}