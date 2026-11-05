
import java.util.Scanner;

// Classe produit
public class produit {

    // Définition des attributs
    String reference;
    String designation;
    double prixHt;
    int quantiteStock;

    // Constructeur
    public produit(String Ref, String Des, double Prix, int Qte) {
        this.reference = Ref;
        this.designation = Des;
        this.prixHt = Prix;
        this.quantiteStock = Qte;
    }

    // Getters et Setters

    public double getPrix() {
        return prixHt;
    }

    public void setPrix(double Prix) {
        prixHt = Prix;
    }

    public String getRef() {
        return reference;
    }

    public void setRef(String Ref) {
        reference = Ref;
    }

    public String getDes() {
        return designation;
    }

    public void setDes(String Des) {
        designation = Des;
    }

    public int getQte() {
        return quantiteStock;
    }

    public void setQte(int Qte) {
        quantiteStock = Qte;
    }

    // Afficher les informations du produit
    public void afficher() {
        System.out.println("Référence : " + reference);
        System.out.println("Désignation : " + designation);
        System.out.println("Prix HT : " + prixHt);
        System.out.println("Quantité en stock : " + quantiteStock);
    }

    // Calculer la valeur totale du stock
    public double CalculerValeurStock() {

        return prixHt * quantiteStock;
    }

    // Appliquer une remise
    public void AppliquerRemise() {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Donner le pourcentage de remise : ");
    double pourcentageRemise = scanner.nextDouble();

    double nvprix = prixHt * (1 - pourcentageRemise / 100);

    System.out.println("Prix avant remise : " + prixHt);
    System.out.println("Pourcentage de remise : " + pourcentageRemise + "%");
    System.out.println("Prix après remise : " + nvprix);
}

    // Méthode principale
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Création d'un produit
        produit p = new produit("P01", "Ordinateur", 1500, 10);

        int choix;

        do {
            System.out.println("\n MENU PRODUIT ");
            System.out.println("1. Afficher les détails du produit");
            System.out.println("2. Calculer la valeur du stock");
            System.out.println("3. Appliquer une remise ");
            System.out.println("4. Quitter");

            System.out.print("Donner votre choix : ");
            choix = scanner.nextInt();

            switch (choix) {

                case 1:
                    p.afficher();
                    break;

                case 2:
                    System.out.println("Valeur totale du stock : "
                            + p.CalculerValeurStock());
                    break;

                case 3:
                    p.AppliquerRemise();
                    break;


                case 4:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide. Choisissez entre 1 et 4.");
            }

        } while (choix != 4);

        scanner.close();
    }
}
