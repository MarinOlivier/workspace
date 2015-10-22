package Exo3;

public class Main {

	public static void main(String[] args) {
		int elt0 = 0;
		int elt1 = 1;
		int elt2 = 2;
		int elt3 = 3;
		
		System.out.println("Creation Liste vide");
		Liste Liste = new Liste() ;
		Liste.afficher();
		
		System.out.println("insertion : " + elt0 + " " + elt1 + " " + elt2 + " " + elt3 + " " + elt2);
		System.out.println("insertion : " + elt2);
		Liste.inserer(elt0);
		Liste.inserer(elt1);
		Liste.inserer(elt2);
		Liste.inserer(elt3);
		
		// test doublon
		Liste.inserer(elt2);
		Liste.afficher();
		
		System.out.println("Supprimer : " + elt2);
		Liste.supprimer(elt2);
		Liste.afficher();
		
		System.out.println("Supprimer : " + elt3);
		Liste.supprimer(elt3);
		Liste.afficher();

	}

}
