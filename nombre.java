/**
 * Représente un nombre entier dans une expression.
 * Cette classe étend {@link Expression} et implémente la méthode {@link Expression#valeur()}.
 *
 * @author RyanAgin
 * @version 1.0
 */
public class Nombre extends Expression {

	private int valeurNombre;

	/**
 	* Constructeur pour initialiser un nombre avec une valeur donnée.
 	*
 	* @param valeurNombre la valeur entière du nombre.
 	*/
	public Nombre(int valeurNombre) {
    	this.valeurNombre = valeurNombre;
	}

	/**
 	* Retourne la valeur du nombre.
 	*
 	* @return la valeur entière du nombre.
 	*/
	@Override
	public int valeur() {
    	return valeurNombre;
	}

	/**
 	* Retourne la représentation sous forme de chaîne de caractères du nombre.
 	*
 	* @return une chaîne représentant la valeur du nombre.
 	*/
	@Override
	public String toString() {
    	return String.valueOf(valeurNombre);
	}
}

