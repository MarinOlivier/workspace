package Exo1;

/**
 * Created by olivier on 13/10/2015.
 */
public class Liste {
    private Maillon _top;

    public Liste() {
        _top = null;
    }

    /**Insère un entier dans la liste s'il n'existe pas déjà
     *
     * @param valeur Valeur à insérer en tête de liste si elle n'existe pas déjà
     */
    public void inserer (int valeur) {
        Maillon m;
        m = _top;

        boolean exist = false;
        while (m != null && !exist)
        {
            exist = m.get_val() == valeur;
            m = m.get_suiv();
        }

        if(!exist) {
            Maillon element = new Maillon(valeur);
            element.set_suiv(_top) ;
            _top = element ;
        }
    }

    /**Supprime un entier dans la liste s'il existe
     *
     * @param valeur Valeur à supprimer de la liste
     */
    public void supprimer (int valeur) throws ExceptionFaible {
        if(_top != null) {
            Maillon m ;
            m = _top ;
            boolean done = false;

            if (_top.get_val() == valeur) {
                _top = _top.get_suiv() ;
            }
            else {
                while (m.get_suiv() != null && !done) {
                    if (m.get_suiv().get_val() == valeur) {
                        m.set_suiv(m.get_suiv().get_suiv());
                        done = true;
                    }
                    else
                        m = m.get_suiv();
                }
                if (!done) throw new NotElementListe();
            }
        }
        else
            throw new NotElementListe();
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

    @Override
    public String toString() {
        return "Liste{" +
                "_top=" + _top +
                '}';
    }
}





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

    @Override
    public String toString() {
        return "_val=" + _val +
                ", _suiv=" + _suiv;
    }
}
