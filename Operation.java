/**
 * Classe abstraite représentant une opération binaire sur deux expressions.
 * Cette classe étend {@link Expression} et contient deux opérandes.
 *
 * @author RyanAgin
 * @version 1.0
 */
public abstract class Operation extends Expression {

	protected Expression operand1;
	protected Expression operand2;

	/**
 	* Constructeur pour initialiser une opération avec deux opérandes.
 	*
 	* @param operand1 le premier opérande de l'opération.
 	* @param operand2 le deuxième opérande de l'opération.
 	*/
	public Operation(Expression operand1, Expression operand2) {
    	this.operand1 = operand1;
    	this.operand2 = operand2;
	}

	/**
 	* Retourne le premier opérande de l'opération.
 	*
 	* @return le premier opérande de type {@link Expression}.
 	*/
	public Expression getOperand1() {
    	return operand1;
	}

	/**
 	* Retourne le deuxième opérande de l'opération.
 	*
 	* @return le deuxième opérande de type {@link Expression}.
 	*/
	public Expression getOperand2() {
    	return operand2;
	}

	/**
 	* Méthode abstraite qui doit être implémentée par les classes dérivées
 	* pour fournir la représentation textuelle de l'opération.
 	*
 	* @return la représentation de l'opération sous forme de chaîne.
 	*/
	@Override
	public abstract String toString();
}

