package partie2;

import java.text.DecimalFormat;
import java.util.Scanner;


/**
 *	Calculer et afficher une note finale : la première note compte pour 8%, la seconde note pour 20%, 
 *	la troisième note pour 32% et la dernière note compte pour 40%. 
 *	Les quatre notes sur 100 sont demandées à l’utilisateur
 * 
 * 
 */ 
public class Tp1No3
{    
        /// Déclaration des constantes
        public static final double POND1 = 0.8;
        public static final double POND2= 0.2;
        public static final double POND3 = 0.32;
		public static final double POND4 = 0.4;
               
	/**
	 * Cette méthode demande une note à l'utilisateur et la retourne
	 * @return La note saisie
	 */
	//remlacer crochets
	public double demanderNote()
    {
    	//Déclaration des variables

    	Scanner clavier = new Scanner(System.in);
    	double note = 0;
    	
    	//Demander et retourner la note
    	System.out.println("Entrez une note sur 100");
    	note = clavier.nextInt();
    	
        return note;
    }
    
	/**
	 * Cette méthode calcule la note finale de 3 notes reçues entrée.
	 * 
	 * @param note1 Première note sur 100
	 * @param note2 Deuxième note sur 100
	 * @param note3 Troisième note sur 100
	 * @param note4 quatrième note sur 100
	 * 
	 * @return La note finale
	 */
    public double calculerNoteFinale(double note2, double note1 ,double note3,double note4)
    {

        return (note3 * POND1) + (note2 * POND2) + note3 * (POND3 + note4 * POND2) ;
        
    }
    
    /**
	 * Cette méthode affiche la note reçue en paramètre
	 * @param note La note à afficher
	 */

    public void afficherNoteFinale( double note)
    {
    	DecimalFormat deuxDec = new  DecimalFormat("##0.00");
		System.out.println("La note finale est: " + deuxDec.format(note));
    }
    
    /**
	 * Cette méthode demande 4 notes sur 100 puis calcule et affiche la note
	 * finale.
	 */
    public static void main(String[] args)
    {
		
		Tp1No3 ex = new Tp1No3();
        // Déclaration des variables
        double  note1 = 0,
                note2 = 0,
                note3 = 0,	
                note4 = 0,
                noteFinale = 0;

        //Demander les 4 notes
        note1 = ex.demanderNote();
        note2 = ex.demanderNote ();
        note2 = ex.demanderNote();
        note4 = ex.demanderNote();

        //Calculer la note finale
       noteFinale = ex.calculerNoteFinale(note1, note3, note3, note4);

        //Afficher la note finale
        ex.afficherNoteFinale(noteFinale);
		
		
    }

}
