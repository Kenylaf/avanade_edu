package test;
import org.w3c.dom.css.ElementCSSInlineStyle;
import model.Adresse;
import model.Enseignant;
import model.Etudiant;
import model.Personne;
public class Main {
	public static void main(String[] args) {
//		int x = 2;
//		Personne personne = new Personne();
//		personne.setNom("wick");
//		personne.setPrenom("john");
//		personne.setNum(-100);
//		Personne personne2 = new Personne(200, "dalton", "jack");
//		System.out.println(personne2);
		Adresse adresse = new Adresse();
		adresse.setRue("paradis");
		adresse.setVille("Marseille");
		adresse.setCodePostal("13000");
		Adresse adresse2 = new Adresse("porte maillot", "75005", "Paris");
		Adresse[] adresses = new Adresse[] { adresse, adresse2 };
//		Personne personne3 = new Personne(300, "maggio", "carol", adresses);
//		System.out.println(personne3);
//		for (int i = 0; i < adresses.length; i++) {
//			System.out.println(adresses[i].getVille());
//		}
		Etudiant etudiant = new Etudiant(400, "cervera", "sophie", adresses, "master");
		Enseignant enseignant = new Enseignant(500, "haddad", "karim", adresses, 1700);
//		System.out.println(enseignant instanceof Personne);
//		System.out.println(personne instanceof Enseignant);
//		Personne[] personnes = new Personne[] { etudiant, personne, enseignant };
//		for(Personne p: personnes) {
//			if (p instanceof Enseignant) {
//				System.out.println(((Enseignant) p).getSalaire());
//			} else if (p instanceof Etudiant) {
//				System.out.println(((Etudiant) p).getNiveau());
//			} else {
//				System.out.println(p.getNum());
//			}
//			/*
//			 * afficher le numéro s'il s'agit d'une personne
//			 * afficher le salaire s'il s'agit d'un enseignant
//			 * afficher le niveau s'il s'agit d'un étudiant
//			 */
//		}
		etudiant.afficherDetails();
		enseignant.afficherDetails();
	}
}