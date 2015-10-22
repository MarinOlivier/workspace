/**
 * 
 */
package Exo1;

/**
 * @author olivier
 *
 */
public class Main {
	
public static void main(String[] args) {
		int size = 3;
		Pile A = new Pile(size);
		
		System.out.println("Pile est vide : " + A.is_empty());
		System.out.println("Pile est pleine : " + A.is_full());
		
		int elt = 14;
		A.empiler(elt);
		System.out.println("Pile empiler : " + elt);
		System.out.println("Pile est vide : " + A.is_empty());
		System.out.println("Pile est pleine : " + A.is_full());
		System.out.println("Pile top : " + A.depiler());
		
		int elt2 = 45;
		int elt3 = 60;
		
		A.empiler(elt);
		A.empiler(elt2);
		A.empiler(elt3);
		
		System.out.println("Pile empiler :" + elt + " " + elt2 + " " + elt3);
		System.out.println("Pile est vide :" + A.is_empty());
		System.out.println("Pile est pleine :" + A.is_full());
		System.out.println("Pile top :" + A.depiler());
		
		
	}
	
}
