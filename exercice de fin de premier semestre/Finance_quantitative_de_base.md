//# Simulateur d'EMPRUNT - Franck CHATELOT 2018

## Exercice à faire en mode PROCEDURAL (puis OBJET)

### EXPLICATION DE CHAQUE VARIABLE
- `tauxInteretAnnuel` → taux de l'interet annuel
- `nbrAnneeRbmt` → le nombre d'annee de remboursement
- `capitalEmprunte` → le capital emprunte
- `tauxInteretmensuel` → taux de l'intérêt mensuel ← `tauxInteretAnnuel/12`
- `mensualite` → la mensualite constante a rembourser
- `mois` → le nombre de mois de la période
- `interetsMensuel` → les intérets du mois courant
- `amortissementMois` → le montant de l'amortissement du capital pour le mois courant

---

## 1) Réaliser la fonction qui renvoie la mensualité constante du prêt

**Consigne :** 
En fonction du `tauxInteretAnnuel` et du `capitalEmprunte` et du `nbrAnneeRbmt`, afficher l'annuité et la `mensualité` constante à rembourser d'après la formule de calcul qui vous est communiqué par la maîtrise d'ouvrage.

**Formule financière calcul de la mensualité constante :**
- a (avec 2 chiffres décimaux obligatoires)
- Soit n = nombre de mois de remboursement
- tm = taux mensuel = taux annuel / 12
- a = K × tm / Q
- Q = (1 - (1 + tm)<sup>-n</sup>)

---

## 2) Réaliser une fonction qui renvoie et affiche le tableau d'amortissement du prêt

**Consigne :**
Afficher le tableau d'amortissement mensuel du prêt en mode console sur 5 colonnes :
- compteur numero mois
- part interet (1 décimal)
- part capital (1 decimal)
- capital restant (pas de décimal)
- mensualité (pas de décimal)

**Formules :**
Soit K(n) = capital restant dû au mois n
- Quand n = 0 : K(n) = Capital emprunté
- Quand n > 0 :
  - K(n+1) = K(n) - part_Capital(n)
  - part_Capital(n) = Mensualité - part_Interet(n)
  - part_Interet(n) = K(n-1) × tm

---

