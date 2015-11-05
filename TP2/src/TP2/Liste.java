package TP2;

import javax.annotation.Generated;

/**
 * Created by olivier on 06/10/2015.
 */

@Generated(value = "", date = "2004")
public class Liste extends Structure implements Affichable, Compactable, Cloneable {
    private Maillon _top;

    public Liste() {
        _top = null;
    }

    /**Insère un entier dans la liste s'il n'existe pas déjà
     *
     * @param elt Valeur à insérer en tête de liste si elle n'existe pas déjà
     */
    public void inserer (int elt) {
        Maillon m;
        m = _top;

        boolean exist = false;
        while (m != null && !exist)
        {
            exist = m.get_val() == elt;
            m = m.get_suiv();
        }

        if(!exist) {
            Maillon element = new Maillon(elt);
            element.set_suiv(_top) ;
            _top = element ;
        }
    }

    /**Supprime un entier dans la liste s'il existe
     *
     * @param elt Valeur à supprimer de la liste
     */
    public void supprimer (int elt){
        if(_top != null) {
            Maillon m ;
            m = _top ;

            if (_top.get_val() == elt) {
                _top = _top.get_suiv() ;
            }
            else {
                boolean done = false;
                while (m.get_suiv() != null && !done) {
                    if (m.get_suiv().get_val() == elt) {
                        m.set_suiv(m.get_suiv().get_suiv());
                        done = true;
                    }
                    else
                        m = m.get_suiv();
                }
            }
        }
    }

    public void afficher () {
        if (_top == null)
            System.out.println("La liste est vide");
        else {
            Maillon temp = _top ;
            while(temp != null) {
                System.out.println(temp.get_val()) ;
                temp = temp.get_suiv() ;
            }
            System.out.println() ;
        }
    }

    public void compacter(int elt) {
        while (elt != 0) {
            _top = _top.get_suiv();
            elt--;
        }
    }

    public Liste clone() throws CloneNotSupportedException {
        Liste res = (Liste) super.clone() ;
        res._top = _top.clone() ;
        return res ;
    }

    @Override
    public String toString() {
        return "Liste{" +
                "_top=" + _top +
                '}';
    }
}




@Generated(value = "", date = "2004")
class Maillon {
    private int _val ;
    private Maillon _suiv ;

    /**Constructeur de la classe Maillon
     *
     * @param val Valeur du maillon de la liste
     */
    public Maillon (int val) {
        this._val = val ;
        _suiv = null ;
    }

    /**Accesseur de l'objet val
     *
     * @return Retourne la valeur du maillon
     */
    public int get_val () {return _val ;}

    /**Accesseur de l'objet suiv
     *
     * @return Retourne le suivant du maillon
     */
    public Maillon get_suiv () {return _suiv ;}

    /**Mutateur de l'objet suiv
     *
     * @param suivant Modification de l'attribut suiv
     */
    public void set_suiv(Maillon suivant){
        _suiv = suivant ;
    }

    public Maillon clone() throws CloneNotSupportedException {
        return (Maillon) super.clone() ;
    }

    @Override
    public String toString() {
        return "Maillon{" +
                "_val=" + _val +
                '}';
    }
}
