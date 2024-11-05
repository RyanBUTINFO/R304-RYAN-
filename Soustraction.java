/**
 * Représente l'opération de soustraction entre deux expressions.
 * Cette classe étend {@link Operation} et implémente la méthode {@link Operation#valeur()}.
 *
 * @author RyanAgin
 * @version 1.0
 */
public class Soustraction extends Operation {

	/**
 	* Constructeur pour initialiser la soustraction avec deux opérandes.
 	*
 	* @param operand1 le premier opérande.
 	* @param operand2 le deuxième opérande.
 	*/
	public Soustraction(Expression operand1, Expression operand2) {
    	super(operand1, operand2);
	}

	/**
 	* Calcule la valeur de la soustraction des deux opérandes.
 	*
 	* @return la différence des valeurs des deux opérandes.
 	*/
	@Override
	public int valeur() {
    	return operand1.valeur() - operand2.valeur();
	}

	/**
 	* Retourne la représentation sous forme de chaîne de la soustraction.
 	*
 	* @return une chaîne représentant la soustraction.
 	*/
	@Override
	public String toString() {
    	return "(" + operand1 + " - " + operand2 + ")";
	}
}

