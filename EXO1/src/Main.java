import java.util.Scanner;
import java.lang.String;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Initialisation by Junior Medjo ");
        String chaine;
        String mot;
        int occurence = 0;
        boolean trouve = false;

        System.out.println("entrez une chaine de caractere");
        chaine = scan.nextLine();
        System.out.println("la chaine entree est " + chaine + " et sa taille est " + chaine.length());
        System.out.println(" ");
        System.out.println("Veuillez entrer un mot et nous allons verifier qu'il existe dans la chaine");
        mot = scan.nextLine();




        int x = chaine.length();
        int y = mot.length();
        char[] tab = new char[x];
        char[] tab2 = new char[y];
        int i;
        for (i = 0; i < x; i++)
            tab[i] = chaine.charAt(i);
        for (i = 0; i <y-1; i++)
            tab2[i] = mot.charAt(i);


        for ( i=0;i<=x-1;i++){
            int j=0, k=i, count=0;
            if (tab[i]==tab2[0]) {
                while (tab[k] == tab2[j] & j <= y - 1) {
                    k++;
                    j++;
                    count++;
                }
                if (count == y-1) {
                    occurence += 1;
                }
            }
        }
        System.out.println("Dans la chaine " + chaine + " on retrouvre le mot " + mot + " " + occurence + " fois");
    }

}












