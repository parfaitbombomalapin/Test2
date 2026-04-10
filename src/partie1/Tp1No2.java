package partie1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Parfait Kangbeni BOMBOMA-TP1(exercice 2)
 *
 * @since 3 septembre 2025
 */

public class Tp1No2 {
    public static void main(String[] args) {
        Tp1No2 obj = new Tp1No2();
        obj.calculerPrixDeVente();
        obj.calculerPrixDeVente();


    }


    public void calculerPrixDeVente() {
        String fruit;
        double quantite;
        double prix;
        double totalTaxe;
        int avantTaxe;
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        System.out.println("****************Achat *****************");
        System.out.println("Quel fruit avez-vous acheté?");
        fruit = sc.nextLine();
        System.out.println("Quel quantité de " + fruit + " en avez-vous achetée (en kg): ");
        quantite = sc.nextInt();
        System.out.println("Quel est le prix (en $/kg)");
        prix = sc.nextDouble();
//
        avantTaxe = (int) (quantite * prix);

        totalTaxe = avantTaxe + (avantTaxe * 5) / 100 + (avantTaxe * 9.975) / 100;
        System.out.println("Prix avant taxes est de :" + avantTaxe);
        System.out.println("Prix après taxes est de :" + totalTaxe);


    }
}








