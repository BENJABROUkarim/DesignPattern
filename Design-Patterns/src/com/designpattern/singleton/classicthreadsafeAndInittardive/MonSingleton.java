/**
 * @author kbenjabr 18 oct. 2017/16:00:33 Software Engineer At Capgemini Morocco
 *
 */
package com.designpattern.singleton.classicthreadsafeAndInittardive;

/**
 * la classe est d�clar�e final pour emp�cher la cr�ation d'une classe fille
 */
public final class MonSingleton {

	/**
	 * l'unique instance est une variable de classe
	 */
	private static MonSingleton instance;

	/**
	 * ne pas oublier de red�finir le constructeur par d�faut si aucun
	 * constructeur n'est explicitement d�fini
	 */
	private MonSingleton() {
		// traitement du constructeur
	}

	/**
	 * un getter static permet de renvoyer l'instance et de la cr�er au besoin
	 * s�curiser l'acc�s au getter avec le mot cl� synchronized
	 */

	public static synchronized MonSingleton getInstance() {
		if (instance == null) {
			return new MonSingleton();
		}
		return instance;
	}

	/**
	 * redefinir la m�thode clone pour emp�cher son utilisation
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

}
