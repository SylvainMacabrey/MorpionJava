import java.util.Scanner;

public class App {

    static Morpion morpion;
    static boolean play;
    static Scanner sc;

    public static void main(String[] args) throws Exception {
        play = true;
        int tour = 1;
        morpion = new Morpion();
        sc = new Scanner(System.in);
        System.out.println("Jeux du Morpion");
        while(play) {
            if(tour % 2 == 1) {
                play(Caractere.ROND);
            } else {
                play(Caractere.CROIX);
            }
            if(tour >= 9) {
                System.out.println("Toutes les cases sont occupés, MATCH NUL");
                morpion.affichageMorpion();
                play = false;
                sc.close();
            } 
            tour++;
        }
    }

    private static void play(Caractere caractere) {
        System.out.println("Joueur " + caractere.getCaractere() + ", à votre tour:");
        morpion.affichageMorpion();
        boolean ifGood;
        do {
            System.out.println("(Joueur " + caractere.getCaractere() + ") Saisissez la ligne où vous voulez vous placez:");
            int x = sc.nextInt();
            System.out.println("(Joueur " + caractere.getCaractere() + ") Saisissez la colone où vous voulez vous placez:");
            int y = sc.nextInt();
            ifGood = morpion.choixCase(x, y, caractere);
        } while(!ifGood);
        if(morpion.victory(caractere)) {
            System.out.println("Joueur " + caractere.getCaractere() + ", vous avez gagné!!!");
            morpion.affichageMorpion();
            play = false;
        }
    }

}
