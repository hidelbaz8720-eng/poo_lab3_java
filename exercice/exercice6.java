import java.util.Scanner;

public class exercice6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] T = new int[n];

        for (int i = 0; i < n; i++) {
            T[i] = sc.nextInt();
        }

        int MAXV = 100000;
        int[] freq = new int[MAXV + 1];

        int distinct = 0;

        // Première fenêtre
        for (int i = 0; i < k; i++) {

            if (freq[T[i]] == 0) {
                distinct++;
            }

            freq[T[i]]++;
        }

        System.out.print(distinct);

        // Faire glisser la fenêtre
        for (int i = k; i < n; i++) {

            // Retirer l'élément sortant
            int out = T[i - k];

            freq[out]--;

            if (freq[out] == 0) {
                distinct--;
            }

            // Ajouter l'élément entrant
            int in = T[i];

            if (freq[in] == 0) {
                distinct++;
            }

            freq[in]++;

            System.out.print(" " + distinct);
        }

        sc.close();
    }
}