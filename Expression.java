
/**
 * Classe abstraite représentant une expression mathématique.
 * Cette classe est la base des classes qui représentent des nombres ou des opérations mathématiques.
 * Chaque expression doit pouvoir renvoyer sa valeur en tant qu'entier.
 *
 * @author RyanAgin
 * @version 1.0
 */
public abstract class Expression {
    
	/**
 	* Méthode abstraite qui renvoie la valeur entière de l'expression.
 	*
 	* @return la valeur de l'expression en entier.
 	*/
	public abstract int valeur();
}

