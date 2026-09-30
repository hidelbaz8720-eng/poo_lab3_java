import  java.util.Scanner;
public class exercice3 {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        System.out.print("Combien de valeurs : ");
        int n = sc.nextInt();
        int[] tab = new int[n];
        for (int i = 0; i < n; i++) {
            int impair = 2 * i + 1;
            tab[i] = impair * impair;
            System.out.println(impair + " a pour carre " + tab[i]);
        }

        sc.close();
    }
}
