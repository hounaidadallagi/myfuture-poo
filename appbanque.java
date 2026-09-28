import java.util.Scanner;

public class appbanque {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int Cin;
        String nom;
        String prenom;
        int ncompte;
        float solde = 150.5f;  
        
        final float plafond_retrait = 50000;

        // Saisie manuelle
        System.out.println("veuillez saisir cin ");
        Cin = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("veuillez saisir nom ");
        nom = scanner.nextLine();

        System.out.println("veuillez saisir prenom ");
        prenom = scanner.nextLine();

        System.out.println("veuillez saisir ncompte ");
        ncompte = scanner.nextInt();

        int choix;
        do {
            System.out.println("1. Consulter compte");
            System.out.println("2. Déposer montant");
            System.out.println("3. Retirer montant");
            System.out.println("4. Quitter");
            
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.println(nom + " " + prenom + " " + Cin);
                    System.out.println("N° Compte : " + ncompte);
                    System.out.println("Solde : " + solde);
                    System.out.println("Plafond retrait : " + plafond_retrait);
                    break;
            }

        } while (choix != 4);

        scanner.close(); 
    }
}
    

        