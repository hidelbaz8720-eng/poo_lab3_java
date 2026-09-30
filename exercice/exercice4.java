public class exercice4 {

    // Affiche le tableau
    public static void affiche(double[][] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Vérifie si le tableau est régulier
    public static boolean regulier(double[][] t) {
        if (t.length == 0) {
            return true;
        }

        int taille = t[0].length;

        for (int i = 1; i < t.length; i++) {
            if (t[i].length != taille) {
                return false;
            }
        }

        return true;
    }

    // Calcule la somme de chaque ligne
    public static double[] sommeLignes(double[][] t) {
        double[] result = new double[t.length];

        for (int i = 0; i < t.length; i++) {
            double somme = 0;

            for (int j = 0; j < t[i].length; j++) {
                somme += t[i][j];
            }

            result[i] = somme;
        }

        return result;
    }

    // Additionne deux tableaux
    public static double[][] somme(double[][] t1, double[][] t2) {

        // Vérifier que les deux tableaux sont réguliers
        if (!regulier(t1) || !regulier(t2)) {
            return null;
        }

        // Vérifier les dimensions
        if (t1.length != t2.length) {
            return null;
        }

        if (t1.length > 0 && t1[0].length != t2[0].length) {
            return null;
        }

        double[][] result = new double[t1.length][];

        for (int i = 0; i < t1.length; i++) {
            result[i] = new double[t1[i].length];

            for (int j = 0; j < t1[i].length; j++) {
                result[i][j] = t1[i][j] + t2[i][j];
            }
        }

        return result;
    }
  public static void main(String[] args) {

        double[][] t1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        double[][] t2 = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        // Test affiche
        System.out.println("Tableau t1 :");
        affiche(t1);

        System.out.println();

        // Test regulier
        System.out.println("t1 est regulier : " + regulier(t1));

        System.out.println();

        // Test sommeLignes
        double[] sommes = sommeLignes(t1);

        System.out.println("Somme des lignes :");

        for (int i = 0; i < sommes.length; i++) {
            System.out.println("Ligne " + (i + 1) + " = " + sommes[i]);
        }

        System.out.println();

        // Test somme
        double[][] resultat = somme(t1, t2);

        System.out.println("Somme de t1 + t2 :");

        if (resultat != null) {
            affiche(resultat);
        } else {
            System.out.println("Les tableaux ne peuvent pas être additionnés.");
        }
    }
}