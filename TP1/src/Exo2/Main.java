/**
 * 
 */
package Exo2;

/**
 * @author olivier
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Entiers E = new Entiers(5);
		
		int elt = 1;
		int elt2 = 2;
		int elt3 = 3;
		
		System.out.println("Ajout : " + elt + " " + elt2 + " " + elt3);
		E.add(elt);
		E.add(elt2);
		E.add(elt3);
		E.afficher();
		
		System.out.println("Ajout : " + elt2);
		E.add(elt2);
		E.afficher();
		
		System.out.println("Ajout : " + elt3);
		E.add(elt3);
		E.afficher();
		
		System.out.println("Remove : " + elt2);
		E.remove(elt2);
		E.afficher();
		
		System.out.println("Remove : " + elt3);
		E.remove(elt3);
		E.afficher();
		
		System.out.println("Remove : " + elt);
		E.remove(elt);
		E.afficher();
	}

}
