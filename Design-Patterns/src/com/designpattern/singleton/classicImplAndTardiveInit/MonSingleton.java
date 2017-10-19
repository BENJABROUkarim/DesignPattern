/**
 * @author kbenjabr 18 oct. 2017/16:00:33 Software Engineer At Capgemini Morocco
 *
 */
package com.designpattern.singleton.classicImplAndTardiveInit;

/**
 * la classe est déclarée final pour empêcher la création d'une classe fille
 */
public final class MonSingleton {

	/**
	 * l'unique instance est une variable de classe
	 */
	private static MonSingleton instance;

	/**
	 * ne pas oublier de redéfinir le constructeur par défaut si aucun
	 * constructeur n'est explicitement défini
	 */
	private MonSingleton() {
		// traitement du constructeur
	}

	/**
	 * un getter static permet de renvoyer l'instance et de la créer au besoin
	 */

	public static MonSingleton getInstance() {
		if (instance == null) {
			return new MonSingleton();
		}
		return instance;
	}

	/**
	 * redefinir la méthode clone pour empêcher son utilisation
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

}
