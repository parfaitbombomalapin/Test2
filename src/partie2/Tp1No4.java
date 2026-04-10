package partie2;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Parfait Kangbeni BOMBOMA-TP1(exercice 4)
 *
 * @since 3 septembre 2025
 */

public class Tp1No4 {


    public static void main(String[] args) {
        Tp1No4 obj = new Tp1No4();
        Scanner input = new Scanner(System.in);
        // obj.demanderValeur("Entrer la longueur de la boite en cm :");
        // obj.demanderValeur("Entrez la largeur de la boite en cm :");
        // obj.demanderValeur("Entrer la hauteur de la boite en cm");
        double longueur = obj.demanderValeur("Entrer la longueur de la boite en cm:");
        double largeur = obj.demanderValeur("Entrez la largueur de la boite en cm:");
        double hauteur = obj.demanderValeur("Entrez la hauteur de la boite en cm:");

        double aire;
        aire = obj.calculerAire(largeur, hauteur, longueur);
        aire = obj.calculerAire(largeur, hauteur, longueur);
        System.out.println(aire);

        double cout;
        System.out.println("Entrer la valeur de l'aire au cm/2");
        cout = obj.calculerCout(aire, input.nextDouble());
        obj.afficherResultat(aire, cout);
        obj.demandeNouvelleBoite();

    }

    public double demanderValeur(String message) {
        System.out.println("demanderValeur: " + message);
        Scanner sc = new Scanner(System.in);
        double valeur = sc.nextDouble();
        return valeur;
    }

    public double calculerAire(double largeur, double hauteur, double longueur) {
        double aire;
        largeur /= 100.0;
        hauteur /= 100.0;
        longueur /= 100.0;
        final double MARGE = 12.0 / 100.0;
        double aireSansMrge = (2 * (largeur * longueur) + 2 * (longueur * hauteur) + 2 * (largeur * hauteur));
        System.out.println(aireSansMrge);
        System.out.println(MARGE);

        aire = aireSansMrge * (1 + MARGE);
        return aire;
    }

    public double calculerCout(double aire, double prix) {
        DecimalFormat df = new DecimalFormat("0.00");
        aire += 0.0;
        prix += 0.0;
        double resultat;
        resultat = (aire * prix);
        return resultat;
    }

    public void afficherResultat(double aire, double resultat) {
        DecimalFormat df = new DecimalFormat("0.00");


        System.out.println("L'aire de carton nécessaire (marge 12% incluse )est de:" + df.format(aire) + " metres carrés");
        System.out.println("Le cout total en metre carrés de carton est de : " + df.format(resultat) + "$");

    }

    public void demandeNouvelleBoite() {
        Tp1No4 obj = new Tp1No4();
        Scanner input = new Scanner(System.in);
        // obj.demanderValeur("Entrer la longueur de la boite en cm :");
        // obj.demanderValeur("Entrez la largeur de la boite en cm :");
        // obj.demanderValeur("Entrer la hauteur de la boite en cm");
        double longueur = obj.demanderValeur("Entrer la longueur de la boite en cm:");
        double largeur = obj.demanderValeur("Entrez la largueur de la boite en cm:");
        double hauteur = obj.demanderValeur("Entrez la hauteur de la boite en cm:");

        double aire;
        aire = obj.calculerAire(largeur, hauteur, longueur);
        aire = obj.calculerAire(largeur, hauteur, longueur);
        System.out.println(aire);
        double cout;
        cout = obj.calculerCout(aire, input.nextDouble());
        obj.afficherResultat(aire, cout);

    }


}

