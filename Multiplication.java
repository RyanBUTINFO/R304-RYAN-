/**
 * Représente l'opération de multiplication entre deux expressions.
 * Cette classe étend {@link Operation} et implémente la méthode {@link Operation#valeur()}.
 *
 * @author RyanAgin
 * @version 1.0
 */
public class Multiplication extends Operation {

	/**
 	* Constructeur pour initialiser la multiplication avec deux opérandes.
 	*
 	* @param operand1 le premier opérande.
 	* @param operand2 le deuxième opérande.
 	*/
	public Multiplication(Expression operand1, Expression operand2) {
    	super(operand1, operand2);
	}

	/**
 	* Calcule la valeur du produit des deux opérandes.
 	*
 	* @return le produit des valeurs des deux opérandes.
 	*/
	@Override
	public int valeur() {
    	return operand1.valeur() * operand2.valeur();
	}

	/**
 	* Retourne la représentation sous forme de chaîne de la multiplication.
 	*
 	* @return une chaîne représentant la multiplication.
 	*/
	@Override
	public String toString() {
    	return "(" + operand1 + " * " + operand2 + ")";
	}
}

