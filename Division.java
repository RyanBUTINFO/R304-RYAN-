/**
 * Représente l'opération de division entre deux expressions.
 * Cette classe étend {@link Operation} et implémente la méthode {@link Operation#valeur()}.
 * Elle gère également la division par zéro en levant une exception {@link ArithmeticException}.
 *
 * @author RyanAgin
 * @version 1.0
 */
public class Division extends Operation {

	/**
 	* Constructeur pour initialiser la division avec deux opérandes.
 	* Si le second opérande est zéro, une exception {@link IllegalArgumentException} est levée.
 	*
 	* @param operand1 le premier opérande.
 	* @param operand2 le deuxième opérande.
 	* @throws IllegalArgumentException si operand2 est égal à zéro.
 	*/
	public Division(Expression operand1, Expression operand2) {
    	super(operand1, operand2);
    	if (operand2.valeur() == 0) {
        	throw new IllegalArgumentException("Division par zéro n'est pas autorisée");
    	}
	}

	/**
 	* Calcule la valeur de la division des deux opérandes.
 	* Si le deuxième opérande est zéro, une exception {@link ArithmeticException} est levée.
 	*
 	* @return le résultat de la division des deux opérandes.
 	* @throws ArithmeticException si le deuxième opérande est égal à zéro.
 	*/
	@Override
	public int valeur() {
    	if (operand2.valeur() == 0) {
        	throw new ArithmeticException("Division par zéro n'est pas autorisée");
    	}
    	return operand1.valeur() / operand2.valeur();
	}

	/**
 	* Retourne la représentation sous forme de chaîne de la division.
 	*
 	* @return une chaîne représentant la division.
 	*/
	@Override
	public String toString() {
    	return "(" + operand1 + " / " + operand2 + ")";
	}
}

