package partie1;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

/**
 * Parfait Kangbeni BOMBOMA-TP1(exercice 1)
 *
 * @since 3 septembre 2025
 */

public class Tp1No1 {
    public static void main(String[] args) {
        double diametre;
        double perimetre;
        double aire;
        double rayon;
        DecimalFormat df = new DecimalFormat("0.003");
        Scanner input = new Scanner(System.in);

        System.out.print("Entrer le diamètre du cercle en cm :");
        diametre = input.nextInt();
        rayon = diametre / 2;
        perimetre = 2 * rayon * PI;
        aire = 2 * rayon * Math.pow(rayon, 2);
        System.out.println("La circonférence du cercle est :" + df.format(perimetre) + "cm");

        System.out.println("L'aire du dique est :" + df.format(aire) + " cm carrés");
    }


}
