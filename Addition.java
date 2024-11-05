/**
 * Représente l'opération d'addition entre deux expressions.
 * Cette classe étend {@link Operation} et implémente la méthode {@link Operation#valeur()}.
 *
 * @author RyanAgin
 * @version 1.0
 */
public class Addition extends Operation {

	/**
 	* Constructeur pour initialiser l'addition avec deux opérandes.
 	*
 	* @param operand1 le premier opérande.
 	* @param operand2 le deuxième opérande.
 	*/
	public Addition(Expression operand1, Expression operand2) {
    	super(operand1, operand2);
	}

	/**
 	* Calcule la valeur de l'addition des deux opérandes.
 	*
 	* @return la somme des valeurs des deux opérandes.
 	*/
	@Override
	public int valeur() {
    	return operand1.valeur() + operand2.valeur();
	}

	/**
 	* Retourne la représentation sous forme de chaîne de l'addition.
 	*
 	* @return une chaîne représentant l'addition.
 	*/
	@Override
	public String toString() {
    	return "(" + operand1 + " + " + operand2 + ")";
	}
}

