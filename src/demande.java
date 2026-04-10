import java.util.Scanner;

public class demande {
    public static void main(String[] args) {
        demande d=new demande();
        d.demanderValeur("Entrez le valeur");
    }
    public double demanderValeur(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer un valeur :"+message);
        double valeur = sc.nextDouble();
        return valeur;

    }
}
